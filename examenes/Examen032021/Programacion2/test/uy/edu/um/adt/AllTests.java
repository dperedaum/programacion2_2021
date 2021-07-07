package uy.edu.um.adt;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import uy.edu.um.adt.binarytree.withnode.SearchBinaryTreeImplTest;
import uy.edu.um.adt.hash.HashImplTest;
import uy.edu.um.adt.heap.HeapImplTest;
import uy.edu.um.adt.linkedlist.LinkedListImplTest;
import uy.edu.um.adt.queue.QueueImplTest;
import uy.edu.um.adt.stack.StackImplTest;

@RunWith(Suite.class)
@SuiteClasses({QueueImplTest.class, StackImplTest.class, LinkedListImplTest.class, SearchBinaryTreeImplTest.class, HashImplTest.class, HeapImplTest.class})
public class AllTests {

}
