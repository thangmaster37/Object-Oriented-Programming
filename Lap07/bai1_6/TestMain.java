package bai1_6;

public class TestMain
{
    public static void main(String[] args)
    {
        Animal animal1 = new Cat("Dolphin");
        animal1.greets();

        Animal animal2 = new Dog("Dogy");
        animal2.greets();
        Dog animal3 = new Dog("Muc");
        Dog animal4 = new Dog("Cho");
        animal3.greets(animal4);

        Dog animal5 = new BigDog("Husky");
        animal5.greets();
        animal5.greets(animal3);
        BigDog animal6 = new BigDog("Ngao");
        animal5.greets(animal6);
    }
}
