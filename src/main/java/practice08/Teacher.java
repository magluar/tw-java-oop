package practice08;



public class Teacher extends Person{
    private final Klass klass;

    public Teacher(int id, String name, int age, Klass klass) {
        super(id, name, age);
        this.klass = klass;
    }

    public Teacher(int id, String name, int age) {
        super(id, name, age);
        this.klass = null;
    }

    public Klass getKlass() {
        return this.klass;
    }

    public String introduce(){
        if (this.klass != null){
            return "My name is " + getName() + ". I am " + getAge() + " years old. I am a Teacher. I teach Class " +
                    getKlass().getNumber() + ".";
        }
        return "My name is " + getName() + ". I am " + getAge() + " years old. I am a Teacher. I teach No Class.";
    }

    public String introduceWith(Student student) {
        assert this.klass != null;
        if (this.klass.getNumber() == student.getKlass().getNumber()) {
            return "My name is " + getName() + ". I am " + getAge() + " years old. I am a Teacher. I teach "
                    + student.getName() + ".";
        }
        return "My name is " + getName() + ". I am " + getAge() + " years old. I am a Teacher. I don't teach "
                + student.getName() + ".";
    }
}
