package prog2.examen;

import prog2.examen.entities.*;
import prog2.examen.exceptions.InformacionInvalida;
import uy.edu.um.adt.binarytree.MySearchBinaryTree;
import uy.edu.um.adt.binarytree.MySearchBinaryTreeImpl;
import uy.edu.um.adt.hash.MyHash;
import uy.edu.um.adt.hash.MyHashImpl;
import uy.edu.um.adt.heap.MyHeap;
import uy.edu.um.adt.heap.MyHeapImpl;
import uy.edu.um.adt.linkedlist.MyLinkedListImpl;
import uy.edu.um.adt.linkedlist.MyList;
import uy.edu.um.adt.queue.EmptyQueueException;
import uy.edu.um.adt.queue.MyQueue;

import java.time.LocalDateTime;

public class SNS {

    private static final TipoVacuna pfizer = new TipoVacuna("Pfizer");

    private static final TipoVacuna coronavac = new TipoVacuna("Coronavac");

    private static final TipoVacuna astrazeneca = new TipoVacuna("AstraZeneca");

    private MyQueue<Persona> enEspera;

    private MySearchBinaryTree<Long, Persona> asignados;

    private MyList<TipoVacuna> certifica;

    private MyHeap<PartidaVacuna> partidaPfizer;

    private MyHeap<PartidaVacuna> partidaCoronavac;

    private MyHeap<PartidaVacuna> partidaAstrazeneca;

    public SNS() {
        this.enEspera = new MyLinkedListImpl<>();
        this.asignados = new MySearchBinaryTreeImpl<>();
        this.certifica = new MyLinkedListImpl<>();
        this.partidaPfizer = new MyHeapImpl<>();
        this.partidaCoronavac = new MyHeapImpl<>();
        this.partidaAstrazeneca = new MyHeapImpl<>();

        certifica.add(pfizer);
        certifica.add(coronavac);
        certifica.add(astrazeneca);
    }

    public void registrarPersona(long cedula, boolean pertenece_salud,
                                 boolean pertenece_educacion, int edad) throws InformacionInvalida {
        Persona personaToAdd = null;

        if (!pertenece_salud && !pertenece_educacion && edad < 75) {
            throw new InformacionInvalida();
        }

        if (pertenece_salud) {
            personaToAdd = new Salud(cedula);
        } else if (pertenece_educacion) {
            personaToAdd = new Educacion(cedula);
        } else {
            personaToAdd = new Adulto(cedula);
        }

        // asignar vacuna a persona

        if (puedoVacunar(personaToAdd)) {
            vacunar(personaToAdd);
            this.asignados.add(personaToAdd.getCedula(), personaToAdd);
        } else {
            this.enEspera.enqueue(personaToAdd);
        }
    }

    public void cargarPartidaVacuna(String tipo, LocalDateTime fechaRecepcion, LocalDateTime
            fechaVencimiento, int cantidad) throws InformacionInvalida {
        TipoVacuna tipoVacuna = getTipoVacuna(tipo);

        if (tipoVacuna == null || fechaRecepcion == null || fechaVencimiento == null || cantidad <= 0) {
            throw new InformacionInvalida();
        }

        PartidaVacuna partida = new PartidaVacuna(fechaRecepcion, tipoVacuna, cantidad, fechaVencimiento);

        if (partida.getTipo().equals(SNS.astrazeneca)) {
            this.partidaAstrazeneca.insert(partida);
        } else if (partida.getTipo().equals(SNS.coronavac)) {
            this.partidaCoronavac.insert(partida);
        } else {
            this.partidaPfizer.insert(partida);
        }

        // Intentar vacunar a las personas en espera

        if (this.enEspera.size() > 0) {

            MyQueue<Persona> tempEnEspera = new MyLinkedListImpl<>();
            while (this.enEspera.size() > 0) {

                Persona persona = null;

                try {
                    persona = this.enEspera.dequeue();
                } catch (EmptyQueueException e) {
                    e.printStackTrace();
                }

                if (puedoVacunar(persona)) {
                    vacunar(persona);
                    this.asignados.add(persona.getCedula(), persona);
                } else {
                    tempEnEspera.enqueue(persona);
                }
            }

            this.enEspera = tempEnEspera;
        }
    }

    // Ejemplo de heapSort con PartidaVacuna

    private MyList<PartidaVacuna> heapSort(MyList<PartidaVacuna> listaDesordenada) {
        MyList<PartidaVacuna> salida = new MyLinkedListImpl<>();
        MyHeap<PartidaVacuna> heap = new MyHeapImpl<>();

        // insertar valores en el heap

        for (PartidaVacuna temp : listaDesordenada) {
            heap.insert(temp);
        }

        // quitar del heap y agregar en lista resultado

        for (int i = 0; i < heap.size(); i++) {
            salida.add(heap.delete());
        }

        return salida;
    }

    private TipoVacuna getTipoVacuna(String tipo) {
        TipoVacuna tipoVacuna = null;

        if (tipo.equals("Pfizer")) {
            tipoVacuna = SNS.pfizer;
        } else if (tipo.equals("Coronavac")) {
            tipoVacuna = SNS.coronavac;
        } else if (tipo.equals("AstraZeneca")) {
            tipoVacuna = SNS.astrazeneca;
        }

        return tipoVacuna;
    }

    private void vacunar(Persona temp) {
        PartidaVacuna partida = null;
        if (temp instanceof Salud) {

            partida = this.partidaPfizer.get();
            temp.setPartidaVacuna(partida);

            if (partida.getCantidad() == 0) {
                this.partidaPfizer.delete();
            }

        } else if (temp instanceof Educacion) {
            partida = this.partidaCoronavac.get();
            temp.setPartidaVacuna(partida);

            if (partida.getCantidad() == 0) {
                this.partidaCoronavac.delete();
            }

        } else {

            partida = this.partidaPfizer.get();

            if (partida != null) {
                temp.setPartidaVacuna(partida);

                if (partida.getCantidad() == 0) {
                    this.partidaPfizer.delete();
                }
            } else {
                partida = this.partidaAstrazeneca.get();
                temp.setPartidaVacuna(partida);

                if (partida.getCantidad() == 0) {
                    this.partidaAstrazeneca.delete();
                }
            }
        }

    }

    private boolean puedoVacunar(Persona temp) {
        boolean puedo = false;

        if (temp instanceof Salud) {

            if (this.partidaPfizer.size() > 0) {
                puedo = true;
            }

        } else if (temp instanceof Educacion) {

            if (this.partidaCoronavac.size() > 0) {
                puedo = true;
            }

        } else { // Adultos

            if (this.partidaPfizer.size() > 0 || this.partidaAstrazeneca.size() > 0) {
                puedo = true;
            }

        }

        return puedo;
    }
}
