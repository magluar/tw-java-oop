package practice08;

import java.util.Objects;

public class Person {
    private final String name;
    private final int age;
    private final int id;

    public Person(int id, String name, int age) {
        this.name = name;
        this.age = age;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age && id == person.id && Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, id);
    }

    public String introduce() {
        return "My name is " + name + ". I am " + age + " years old.";
    }
}
