package Bai1_5;

public class TestAnimal
{
    public static void main(String[] args)
    {
        Animal animal = new Animal("Bird");
        System.out.println(animal);

        Mammal mammal = new Mammal("Dolphin");
        System.out.println(mammal);

        Cat cat = new Cat("MeMe");
        cat.greets();
        System.out.println(cat);

        Dog dog1 = new Dog("Chuw");
        Dog dog2 = new Dog("Moon");
        System.out.println(dog1);
        dog1.greets();
        dog1.greets(dog2);
        System.out.println(dog2);
    }
}
