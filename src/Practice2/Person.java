package Practice2;
public class Person<T,E> {
    private T name;
    private E age;

    public Person() {
    }
    public Person(T name, E age) {
        this.name = name;
        this.age = age;
    }
    public T getName() {
        return name;
    }

    public void setName(T name) {
        this.name = name;
    }

    public E getAge() {
        return age;
    }

    public void setAge(E age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "\nPerson{" +
                "\nname='" + name + '\'' +
                "\nage=" + age +
                '}';
    }
}

