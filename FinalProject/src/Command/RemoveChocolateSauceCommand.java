package Command;

import AbstractFactory.*;
import Decorator.*;

/*
    Author: Simone Charles
    Purpose: The RemoveChocolateSauceCommand is a command that removes the chocolate sauce on the ice cream in the order
 */

public class RemoveChocolateSauceCommand implements Command{
    // Attribute
    private IceCream iceCream;

    // Constructor
    public RemoveChocolateSauceCommand(IceCream iceCream){
        this.iceCream = iceCream;
    }

    @Override
    public void setMenuItem(Menu menuItem){
        this.iceCream = (IceCream) menuItem;
    }

    @Override
    public void execute(Menu menuItem){
        // set the menu item
        setMenuItem(menuItem);
        // update the item's description and price so that it removes the chocolate sauce
        String previousItemName = iceCream.getItemName();
        String newItemName = previousItemName.replace(", Chocolate Sauce", "");

        IceCream newIceCream = new BasicIceCream();
        newIceCream.setPrice(iceCream.getPrice()-0.5);
        newIceCream.setItemName(newItemName);

        iceCream = newIceCream;
        // set the ice cream
        setMenuItem(iceCream);
    }

    @Override
    public Menu getMenuItem(){
        // return the ice cream
        return iceCream;
    }
}
