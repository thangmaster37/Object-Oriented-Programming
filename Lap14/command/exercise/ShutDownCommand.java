package command.exercise;

public class ShutDownCommand extends Computer implements Command
{
    private Computer cp;
    public ShutDownCommand(Computer cp){
        this.cp = cp;
    }

    public void execute(){
        cp.shutDown();
    }
}
