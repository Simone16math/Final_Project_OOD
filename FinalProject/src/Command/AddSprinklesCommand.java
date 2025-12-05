package Command;

import AbstractFactory.*;
import Decorator.*;
/*
    Author: Simone Charles
    Purpose: The AddSprinklesCommand is a command that adds chocolate sauce to the ice cream in the order
*/


public class AddSprinklesCommand implements Command {
    // Attribute
    private IceCream iceCream;

    // Constructor
    public AddSprinklesCommand(IceCream iceCream){
        this.iceCream = iceCream;
    }



    @Override
    public Menu getMenuItem(){
        // return the ice cream
        return iceCream;
    }
    @Override
    public void setMenuItem(Menu menuItem){
        // set the ice cream
        this.iceCream = (IceCream) menuItem;
    }

    @Override
    public void execute(Menu menuItem){
        // set the ice cream to the instance
        setMenuItem(menuItem);
        // apply the sprinkles decorator to the ice cream
        iceCream = new SprinklesDecoratorIceCream(iceCream);
        // update the ice cream again (just in case)
        setMenuItem(iceCream);
    }




}
