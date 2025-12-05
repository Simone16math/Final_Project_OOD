package Command;

import AbstractFactory.*;
import Decorator.*;

/*
    Author: Simone Charles
    Purpose: The AddChocolateSauceCommand is a command that adds chocolate sauce to the ice cream
 */

public class AddChocolateSauceCommand implements Command {
    // Attribute
    private IceCream iceCream;

    // Constructor
    public AddChocolateSauceCommand(IceCream iceCream){
        // set the ice cream
        this.iceCream = iceCream;
    }

    @Override
    public Menu getMenuItem(){
        // return the ice cream set
        return iceCream;
    }

    @Override
    public void setMenuItem(Menu menuItem){
        // set the ice cream
        this.iceCream = (IceCream) menuItem;
    }

    @Override
    public void execute(Menu menuItem){
        // set the menuItem to the iceCream
        setMenuItem(menuItem);
        // apply the chocolate sauce decorator to the ice cream
        iceCream = new ChocolateSauceDecoratorIceCream(iceCream);
        // update the set ice cream again
        setMenuItem(iceCream);
    }


}
