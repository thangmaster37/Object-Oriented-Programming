package command.exercise;

import java.util.ArrayList;
import java.util.List;

public class Switch
{
    private List<Command> history = new ArrayList<Command>();
    public Switch(){

    }

    public void storeAndExecute(Command command){
        this.history.add(command);
        command.execute();
    }
}
