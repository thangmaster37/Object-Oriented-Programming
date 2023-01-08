package bridge.exercise;

public class MacOS implements OperatingSystem
{
    public void startup(){
        System.out.println("Start up Mac");
    }

    public void loadUrl(String url){
        System.out.println("Loading " + url);
    }
}
