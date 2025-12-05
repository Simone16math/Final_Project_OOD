package Command;
import AbstractFactory.*;
import Command.*;
import Decorator.*;
import Observer.*;
/*
    Author: Simone Charles
    Purpose: An interface for the concrete commands to follow
 */

import AbstractFactory.Menu;

public interface Command {
    // all commands will call the execute method
    void setMenuItem(Menu menuItem);
    void execute(Menu menuItem);
    Menu getMenuItem();
}
