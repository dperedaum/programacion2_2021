package uy.edu.um.adt.queue;

import static com.sun.tools.internal.ws.wsdl.parser.Util.fail;
import static org.junit.Assert.*;

import org.junit.Test;
import uy.edu.um.adt.linkedlist.MyLinkedListImpl;

public class QueueImplTest {

	@Test
	public void testFlujoCompleto() {
		MyQueue<Integer> queue = new MyLinkedListImpl<>();
		
		queue.enqueue(new Integer(21));
		queue.enqueue(new Integer(34));
		queue.enqueue(new Integer(3));

        assertTrue(queue.contains(21));
        assertEquals(3, queue.size());

		try {

			assertEquals(new Integer(21), queue.dequeue());

		} catch (EmptyQueueException e) {

			fail(e.getMessage());

		}

        assertFalse(queue.contains(21));

		assertEquals(2, queue.size());
		
		assertTrue(queue.contains(34));
		
		assertFalse(queue.contains(18));

        try {

            assertEquals(new Integer(34), queue.dequeue());

        } catch (EmptyQueueException e) {

            fail(e.getMessage());

        }

        try {

            assertEquals(new Integer(3), queue.dequeue());

        } catch (EmptyQueueException e) {

            fail(e.getMessage());

        }

        try {

            queue.dequeue();

            fail("Se espera excepcion");
        } catch (EmptyQueueException e) {

            assertTrue(true);

        }
	}

    @Test
	public void testEnqueueWithPriority() {
        MyQueue<Integer> queue = new MyLinkedListImpl<>();

        queue.enqueueWithPriority(11, 11);
        queue.enqueueWithPriority(10, 10);
        queue.enqueueWithPriority(1, 1);
        queue.enqueueWithPriority(3, 3);
        queue.enqueueWithPriority(12, 12);

        assertEquals(5, queue.size());

        try {

            assertEquals(12, queue.dequeue().intValue());
            assertEquals(11, queue.dequeue().intValue());
            assertEquals(10, queue.dequeue().intValue());
            assertEquals(3, queue.dequeue().intValue());
            assertEquals(1, queue.dequeue().intValue());

        } catch (EmptyQueueException e) {
            e.printStackTrace();
        }

    }

}
