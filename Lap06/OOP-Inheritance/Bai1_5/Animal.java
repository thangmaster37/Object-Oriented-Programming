package Bai1_5;

public class Animal
{
    private String name;

    public Animal(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String toString(){
        return "Animal[name = " + name + "]";
    }
}
