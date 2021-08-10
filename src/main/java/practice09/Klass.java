package practice09;

import java.util.ArrayList;
import java.util.List;

public class Klass {
    private final int klass;
    private List<Student> studentList = new ArrayList<>();
    private Student student;

    public Klass(int klass) {
        this.klass = klass;
    }

    public int getNumber() {
        return this.klass;
    }

    public String getDisplayName() {
        return "Class " + getNumber();
    }

    public void assignLeader(Student student) {
        if (studentList.contains(student)){
            this.student = student;
        }
        else{
            System.out.print("It is not one of us.\n");
        }
    }

    public Student getLeader() {
        return this.student;
    }

    public void appendMember(Student student) {
        studentList.add(student);
    }
}
