import java.util.*;

public class CommandInvoker {
    private ArrayList<Command> commands;

    public CommandInvoker(){
        commands = new ArrayList<>();
    }

    public void addCommand(Command command){
        commands.add(command);
    }

    public void triggerCommand(Command command){
        for (Command c: commands){
            if (c == command){
                c.execute();
            }
        }
    }

}
