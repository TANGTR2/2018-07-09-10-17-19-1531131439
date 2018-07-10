package practice06;

public class Teacher extends Person{
    public int getKlass() {
        return klass;
    }

    public void setKlass(int klass) {
        this.klass = klass;
    }

    public int klass;
    public Teacher(String name,int age,int klass){
        super(name,age);
        setKlass(klass);
    }
    public Teacher(String name,int age){
        super(name,age);
    }
    public String introduce(){
        if(getKlass() != 0)
            return super.introduce().concat(" I am a Teacher. I teach Class "+this.getKlass() + ".");
        else
            return super.introduce().concat(" I am a Teacher. I teach No Class.");
    }
}
