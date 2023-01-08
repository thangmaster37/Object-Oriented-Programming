package bridge.exercise;

public class PC extends Computer
{
    public PC(OperatingSystem os){
        super(os);
    }

    public void startup(){
        os.startup();
    }

    public void browseinternet(String url){
        os.loadUrl(url);
    }

    public boolean canMoveComputer(){
        return false;
    }
}
