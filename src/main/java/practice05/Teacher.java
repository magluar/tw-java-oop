package practice05;

public class Teacher extends Person{
    private final int klass;

    public Teacher(String name, int age, int klass) {
        super(name, age);
        this.klass = klass;
    }

    public Teacher(String name, int age) {
        super(name, age);
        this.klass = 0;
    }

    public int getKlass() {
        return this.klass;
    }

    public String introduce() {
        if (this.klass == 0){
            return "My name is " + getName() + ". I am " + getAge() + " years old. I am a Teacher. I teach No Class.";
        }
        return "My name is " + getName() + ". I am " + getAge() + " years old. I am a Teacher. I teach Class " + klass + ".";
    }
}
