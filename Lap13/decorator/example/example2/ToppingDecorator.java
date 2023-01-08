package decorator.example.example2;

public abstract class ToppingDecorator implements IceCream
{
    protected IceCream iceCream;
    public String getDescription(){
        return "Description Topping";
    }

    public abstract String addTopping();
}
