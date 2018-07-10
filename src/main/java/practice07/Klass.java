package practice07;

public class Klass {
    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int number;
    public String getDisplayName(){
        return "Class "+this.getNumber();
    }

    public Klass(int number){
        setNumber(number);
    }
}
