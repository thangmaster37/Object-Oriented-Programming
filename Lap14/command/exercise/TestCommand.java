package command.exercise;

public class TestCommand
{
    public static void main(String[] args)
    {
        Computer computer = new Computer();
        Command shutdown = new ShutDownCommand(computer);
        Command restart = new RestartCommand(computer);

        Switch s = new Switch();

        String str = "restart";

        if(str == "shutdown"){
            s.storeAndExecute(shutdown);
        }else{
            s.storeAndExecute(restart);
        }
    }
}
