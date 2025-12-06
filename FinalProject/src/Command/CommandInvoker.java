package Command;

import AbstractFactory.*;

/*
    Author: Simone Charles
    Purpose: The CommandInvoker is responsible for initiating requests from the commands possible.
 */

import java.util.*;

public class CommandInvoker {
    //Attributes
    private ArrayList<Command> commands;
    private Menu menuItem;
    private List<Menu> orderList;

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

    public void executeDecoratorCommand(Command command, Menu menuItem){
        // calls a command in the list of commands
        for (Command c: commands){ // for each command in the list
            if (c == command){     // if it matches the desired command
                c.execute(menuItem);// execute the command
                this.menuItem = c.getMenuItem();

            }
        }
    }

    public void executeOrderUpdate(Command command, Menu menuItem, List<Menu> orderList){
        // for a
        for (Command c: commands){
            // for a given command
            if (c == command){
                // set the menu item and order list
                c.setMenuItem(menuItem);
                ((CommandOrder) c).setOrderList(orderList);
                c.execute(menuItem); // execute the command
                this.menuItem = c.getMenuItem();
                this.orderList = orderList;
                // return the menu item
            }
        }
    }

    public Menu getMenuItem(){
        return menuItem;
    }

    public List<Menu> getOrderList(){
        return orderList;
    }


}
