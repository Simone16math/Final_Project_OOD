package Command;

import AbstractFactory.*;
import java.util.ArrayList;
import java.util.List;

/*
    Author: Simone Charles
    Purpose: The AddMenuItemCommand is a command that adds an item to the customer's order
*/

public class AddMenuItemCommand implements Command,CommandOrder{
    // Attributes
    private Menu menuItem;
    private List<Menu> orderList;

    // Constructor
    public AddMenuItemCommand(){
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
        orderList.add(menuItem);
        System.out.println("Added item");
    }
}
