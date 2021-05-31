import java.util.Objects;

public class Person {

    private int id;

    private String name;

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public boolean equals(Object b) {
        boolean equals = false;

        if (b instanceof Person) {
            equals = ((Person) b).getId() == this.getId();
        }

        return equals;
    }

    public int hashCode() {
        return Integer.valueOf(this.id).hashCode();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
