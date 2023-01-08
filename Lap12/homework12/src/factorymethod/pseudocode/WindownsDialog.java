package factorymethod.pseudocode;

public class WindownsDialog extends Dialog
{
    public Button createButton(){
        return new WindownsButton();
    }
}
