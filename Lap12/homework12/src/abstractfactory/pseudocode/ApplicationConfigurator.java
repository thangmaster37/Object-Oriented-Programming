package abstractfactory.pseudocode;

public class ApplicationConfigurator
{
    public static void main(String[] args) throws Exception {
        String configOS = "Windows";
        GUIFactory factory;
        if (configOS.equals("Windows")) {
            factory = new WinFactory();
        } else if (configOS.equals("Mac")) {
            factory = new MacFactory();
        } else {
            throw new Exception("Error! Unknown OS");
        }
        Application app = new Application(factory);
        app.createUI();
        app.paint();
    }

}
