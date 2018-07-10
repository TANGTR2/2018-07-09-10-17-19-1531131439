package practice07;

public class Person {
    public String name;
    public int age;

    public Person(String name,int age){
        setName(name);
        setAge(age);
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public int getAge() {
        return age;
    }

    public  String introduce(){
        return "My name is " + this.getName() + ". I am " + this.getAge() + " years old.";
    }
}



