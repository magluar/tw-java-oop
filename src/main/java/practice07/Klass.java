package practice07;

public class Klass {
    private final int klass;
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
        this.student = student;
    }

    public Student getLeader() {
        return student;
    }
}
