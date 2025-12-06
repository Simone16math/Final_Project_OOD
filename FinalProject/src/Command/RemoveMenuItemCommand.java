package Command;

import AbstractFactory.*;

import java.util.List;

/*
    Author: Simone Charles
    Purpose: The RemoveMenuItemCommand is a command that removes an item to the customer's order
*/

public class RemoveMenuItemCommand implements Command,CommandOrder{
    // Attributes
    private Menu menuItem;
    private List<Menu> orderList;

    // Constructor
    public RemoveMenuItemCommand(){
    }

    @Override
    public Menu getMenuItem(){
        // return the menu item
        return menuItem;
    }

    @Override
    public List<Menu> getOrderList(){
        // return the order list
        return orderList;
    }

    @Override
    public void setOrderList(List<Menu> orderList){
        // set the order list
        this.orderList = orderList;
    }

    @Override
    public void setMenuItem(Menu menuItem){
        // set the menuItem
        this.menuItem = menuItem;
    }

    @Override
    public void execute(Menu menuItem){
        // if the command is called, remove the item from the list
        orderList.remove(menuItem);
        System.out.println("Removed item");
    }
}
