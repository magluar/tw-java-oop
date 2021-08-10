package practice08;

import java.util.ArrayList;
import java.util.List;

public class Klass {
    private final int klass;
    private Student student;
    private final List<Student> studentList = new ArrayList<>();

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
        if(studentList.contains(student)){
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
