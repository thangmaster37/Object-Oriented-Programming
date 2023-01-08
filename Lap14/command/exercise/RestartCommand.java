package command.exercise;

public class RestartCommand extends Computer implements Command
{
    private Computer cp;
    public RestartCommand(Computer cp){
        this.cp = cp;
    }

    public void execute(){
        cp.restart();
    }
}
