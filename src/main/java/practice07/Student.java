package practice07;

public class Student {
    private final int id;
    private final String name;
    private final int age;
    private final Klass klass;

    public Student(int id, String name, int age, Klass klass) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.klass = klass;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
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
