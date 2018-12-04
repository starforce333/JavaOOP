package lesson09.school;

public class SomeClass<T extends Comparable<T>> {

    private T someField;

    public SomeClass(T someField) {
        this.someField = someField;
    }

    public T getSomeField() {
        return someField;
    }

    public void setSomeField(T someField) {
        this.someField = someField;
    }

    @Override
    public String toString() {
        return "SomeClass{" +
                "someField=" + someField +
                '}';
    }
}
