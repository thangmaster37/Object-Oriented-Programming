package abstractfactory.pseudocode;

public class MacFactory implements GUIFactory
{
    public Button createButton(){
        return new MacButton();
    }

    public Checkbox createCheckbox(){
        return new MacCheckbox();
    }
}
