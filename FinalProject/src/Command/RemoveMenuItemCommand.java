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
        return menuItem;
    }

    @Override
    public List<Menu> getOrderList(){
        return orderList;
    }

    @Override
    public void setOrderList(List<Menu> orderList){
        this.orderList = orderList;
    }

    @Override
    public void setMenuItem(Menu menuItem){
        this.menuItem = menuItem;
    }

    @Override
    public void execute(Menu menuItem){
        orderList.remove(menuItem);
        System.out.println("Removed item");
    }
}
