package factorymethod.pseudocode;

public abstract class Dialog
{
    abstract Button createButton();

    public void render(){
        Button okbutton = createButton();
        okbutton.onClick();
        okbutton.render();
    }
}
