package uy.edu.um.adt.heap;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HeapImplTest {

    @Test
    public void testHeapMin() {
        MyHeap<Integer> heapMin = new MyHeapImpl<>(5);

        heapMin.insert(150);
        heapMin.insert(15);
        heapMin.insert(2);
        heapMin.insert(200);
        heapMin.insert(17);

        assertEquals(5, heapMin.size());

        assertEquals(new Integer(2), heapMin.get());
        assertEquals(new Integer(2), heapMin.delete());

        assertEquals(new Integer(15), heapMin.get());
        assertEquals(new Integer(15), heapMin.delete());

        assertEquals(new Integer(17), heapMin.get());
        assertEquals(new Integer(17), heapMin.delete());

        assertEquals(new Integer(150), heapMin.get());
        assertEquals(new Integer(150), heapMin.delete());

        assertEquals(new Integer(200), heapMin.get());
        assertEquals(new Integer(200), heapMin.delete());

        assertEquals(0, heapMin.size());
    }

    @Test
    public void testHeapMax() {
        MyHeap<Integer> heapMin = new MyHeapImpl<>(5,  false);

        heapMin.insert(150);
        heapMin.insert(15);
        heapMin.insert(2);
        heapMin.insert(200);
        heapMin.insert(17);

        assertEquals(5, heapMin.size());

        assertEquals(new Integer(200), heapMin.get());
        assertEquals(new Integer(200), heapMin.delete());

        assertEquals(new Integer(150), heapMin.get());
        assertEquals(new Integer(150), heapMin.delete());

        assertEquals(new Integer(17), heapMin.get());
        assertEquals(new Integer(17), heapMin.delete());

        assertEquals(new Integer(15), heapMin.get());
        assertEquals(new Integer(15), heapMin.delete());

        assertEquals(new Integer(2), heapMin.get());
        assertEquals(new Integer(2), heapMin.delete());

        assertEquals(0, heapMin.size());
    }

}
