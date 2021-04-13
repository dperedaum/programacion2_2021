public interface MyQueue {

    void enqueue(Object element);

    Object dequeue();

    int size();

}
