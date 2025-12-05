package Command;

import AbstractFactory.*;
import Command.*;
import Decorator.*;
import Observer.*;

/*
    Author: Simone Charles
    Purpose: The CommandInvoker is responsible for initiating requests from the commands possible.
 */

import java.util.*;

public class CommandInvoker {
    //Attributes
    private ArrayList<Command> commands;
    private Menu menuItem;

    // Constructor
    public CommandInvoker(){
        // create a new list of commands
        commands = new ArrayList<>();
    }

    // Methods
    public void addCommand(Command command){
        // adds a command to the list of commands
        commands.add(command);
    }

    public void executeCommand(Command command, Menu menuItem){
        // calls a command in the list of commands
        for (Command c: commands){ // for each command in the list
            if (c == command){     // if it matches the desired command
                c.execute(menuItem);// execute the command
                this.menuItem = c.getMenuItem();

            }
        }
    }

    public Menu getMenuItem(){
        return menuItem;
    }


}
