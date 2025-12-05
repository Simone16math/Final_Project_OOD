package Command;

import AbstractFactory.*;

/*
    Author: Simone Charles
    Purpose: An interface for the concrete commands to follow
 */



public interface Command {
    // all commands will call the execute method
    void setMenuItem(Menu menuItem);
    void execute(Menu menuItem);
    Menu getMenuItem();
}
