package bridge.exercise;

public class Laptop extends Computer
{
    public Laptop(OperatingSystem os){
        super(os);
    }
    public void startup(){
        os.startup();
    }

    public void browseinternet(String url){
        os.loadUrl(url);
    }

    public boolean canMoveComputer(){
        return true;
    }
}
