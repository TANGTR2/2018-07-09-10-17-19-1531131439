package practice05;

public class Worker extends Person{
    public Worker(String name,int age){
        super(name,age);
    }
    public String introduce(){
        return super.introduce().concat(" I am a Worker. I have a job.");
    }
}

