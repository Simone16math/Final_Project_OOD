package Command;

import AbstractFactory.Menu;
import Command.*;

import java.util.List;

/*
    Author: Simone Charles
    Purpose: The CommandOrder is an interface responsible for the baseline of the commands that deal with the orders
 */

interface CommandOrder extends Command {
    List<Menu> getOrderList(); // return the order list
    void setOrderList(List<Menu> orderList); // set the order list
}
