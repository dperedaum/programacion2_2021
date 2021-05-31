import org.junit.jupiter.api.Test;

public class MyClosedHashImplTest {

    @Test
    public void addElementTest() {
        MyHash<String, Object> myHash = new MyClosedHashImpl<>();

        MyHash<String, Object> myHash2 = new MyClosedHashImpl<>(40, 0.8f);

        MyHash<Person, House> myHash3 = new MyClosedHashImpl<>();

        Person person1 = new Person(123, "Daniel");

        House house1 = new House();

        myHash3.put(person1, house1);
    }
}
