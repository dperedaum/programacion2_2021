package uy.edu.um.adt.queue;

public interface MyQueue<T> {

	void enqueue(T value);

	void enqueueWithPriority(T value, int priority);
	
	T dequeue() throws EmptyQueueException;
	
	boolean contains(T value);
	
	int size();
	
}
