public interface MyList <R> {

    void add(R value);

    void delete(R value);

    R get(int position);

    int size();

}
