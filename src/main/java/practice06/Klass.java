package practice06;

public class Klass {
    private final int klass;

    public Klass(int klass) {
        this.klass = klass;
    }

    public int getNumber() {
        return this.klass;
    }

    public String getDisplayName() {
        return "Class " + getNumber();
    }
}
