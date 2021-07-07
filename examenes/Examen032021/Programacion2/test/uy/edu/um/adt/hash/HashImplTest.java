package uy.edu.um.adt.hash;

import org.junit.Test;
import uy.edu.um.adt.linkedlist.MyList;

import static org.junit.Assert.*;

public class HashImplTest {

    @Test
    public void testFlujoNormal() {
        MyHash<Integer, String> hash = new MyHashImpl<>(5);

        hash.put(1, "Daniel");
        hash.put(3, "Lola");
        hash.put(4, "Toby");
        hash.put(5, "Siny");

        assertEquals(4, hash.size());

        assertTrue(hash.contains(3));
        assertEquals("Lola", hash.get(3));
        hash.remove(3);

        assertEquals(3, hash.size());

        assertFalse(hash.contains(3));
        assertNull(hash.get(3));

        MyList<Integer> keys = hash.keys();

        assertEquals(3, keys.size());
        assertTrue(keys.contains(1));
        assertTrue(keys.contains(4));
        assertTrue(keys.contains(5));

        MyList<String> values = hash.values();

        assertEquals(3, values.size());
        assertTrue(values.contains("Daniel"));
        assertTrue(values.contains("Toby"));
        assertTrue(values.contains("Siny"));
    }
}
