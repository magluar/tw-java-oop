package practice07;

public class Student extends Person{
    private final Klass klass;

    public Student(int id, String name, int age, Klass klass) {
        super(id, name, age);
        this.klass = klass;
    }

    public Klass getKlass() {
        return this.klass;
    }

    public String introduce() {
        if (getKlass().getLeader() != null) {
//            "My name is Tom. I am 21 years old. I am a Student. I am Leader of Class 2.";
            return "My name is " + getName() + ". I am " + getAge() + " years old. I am a Student. I am Leader of " +
                    "Class " + klass.getNumber() + ".";
        }
        return "My name is " + getName() + ". I am " + getAge() + " years old. I am a Student. I am at Class "
                + klass.getNumber() + ".";
    }
}
