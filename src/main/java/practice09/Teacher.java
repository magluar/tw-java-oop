package practice09;

import java.util.Collection;
import java.util.LinkedList;

public class Teacher extends Person{
    private final LinkedList<Klass> classList;

    public Teacher(int id, String name, int age, LinkedList<Klass> linkedList) {
        super(id, name, age);
        this.classList = linkedList;
    }

    public LinkedList<Klass> getClasses() {
        return this.classList;
    }
}
