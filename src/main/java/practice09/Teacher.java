package practice09;

import java.util.Collection;
import java.util.LinkedList;
import java.util.stream.Collectors;

public class Teacher extends Person{
    private final LinkedList<Klass> classList;

    public Teacher(int id, String name, int age, LinkedList<Klass> linkedList) {
        super(id, name, age);
        this.classList = linkedList;
    }

    public Teacher(int id, String name, int age) {
        super(id, name, age);
        this.classList = null;
    }

    public LinkedList<Klass> getClasses() {
        return this.classList;
    }
    public String introduce() {
        if (classList != null) {
            String numOfClasses = classList.stream()
                    .map(klass -> String.valueOf(klass.getNumber()))
                    .collect(Collectors.joining(", "));
            return "My name is " + getName() + ". I am " + getAge() + " years old. I am a Teacher. I teach Class " +
                    numOfClasses + ".";
        }
        return "My name is " + getName() + ". I am " + getAge() + " years old. I am a Teacher. I teach No Class.";
    }

    public boolean isTeaching(Student student) {
        assert classList != null;
        return classList.contains(student.getKlass());
    }

    public String introduceWith(Student student) {
        return "My name is " + getName() + ". I am " + getAge() + " years old. I am a Teacher. I teach "
                + student.getName() + ".";
    }
}
