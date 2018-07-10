package practice07;

public class Student extends Person {
    public Klass getKlass() {
        return klass;
    }

    public void setKlass(Klass klass) {
        this.klass = klass;
    }

    public Klass klass;
    public String introduce(){
        return super.introduce().concat(" I am a Student. I am at Class " + this.klass.getNumber() +".");
    }

    public Student(String name,int age,Klass klass){
        super(name,age);
        setKlass(klass);
    }
}
