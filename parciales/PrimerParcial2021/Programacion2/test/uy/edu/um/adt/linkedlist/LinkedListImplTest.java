package uy.edu.um.adt.linkedlist;

import org.junit.Test;

import static org.junit.Assert.*;

public class LinkedListImplTest {

    @Test
    public void testFlujoCompleto() {

        MyList<Integer> list = new MyLinkedListImpl<>();

        list.add(4);
        list.add(5);
        list.add(7);
        list.add(2);

        assertEquals(4, list.size());

        assertEquals(new Integer(4), list.get(0));

        assertEquals(new Integer(2), list.get(3));

        assertTrue(list.contains(5));

        assertFalse(list.contains(12));

        list.remove(12); // si trata de eliminar un elemento que no existe deja la lista como esta

        assertEquals(4, list.size());

        list.remove(7);
        list.remove(4);
        list.remove(2);

        assertEquals(1, list.size());

        assertNull(list.get(2));

        assertEquals(new Integer(5), list.get(0));


    }

}
