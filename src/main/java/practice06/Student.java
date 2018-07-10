package practice06;

public class Student extends Person {
    public int getKlass() {
        return klass;
    }

    public void setKlass(int klass) {
        this.klass = klass;
    }

    public int klass;

    public String introduce(){
        return super.introduce().concat(" I am a Student. I am at Class " + this.klass +".");
    }

    public Student(String name,int age,int klass){
        super(name,age);
        setKlass(klass);
    }
}


