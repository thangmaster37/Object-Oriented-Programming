package bridge.exercise;

public class WindowsOS implements OperatingSystem
{
    public void startup(){
        System.out.println("Start up Window");
    }

    public void loadUrl(String url){
        System.out.println("Loading " + url);
    }
}
