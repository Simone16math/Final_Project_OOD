package Command;
import AbstractFactory.*;
import Command.*;
import Decorator.*;
import Observer.*;

/*
    Author: Simone Charles
    Purpose: The AddChocolateSauceCommand is a command that adds chocolate sauce to the ice cream in the order
 */

public class AddChocolateSauceCommand implements Command {
    // Attribute
    private IceCream iceCream;

    // Constructor
    public AddChocolateSauceCommand(IceCream iceCream){
        this.iceCream = iceCream;
    }

    @Override
    public void setMenuItem(Menu menuItem){
        this.iceCream = (IceCream) menuItem;
    }

    @Override
    public void execute(Menu menuItem){
        setMenuItem(menuItem);
        iceCream = new ChocolateSauceDecoratorIceCream(iceCream);
        //System.out.println(iceCream.getDescription());
        setMenuItem(iceCream);
    }
    @Override
    public Menu getMenuItem(){
        return iceCream;
    }

    public static class RemoveChocolateSauceCommand implements Command {
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
            setMenuItem(menuItem);
            String previousItemName = iceCream.getItemName();
            String newItemName = previousItemName.replace(", Chocolate Sauce", "");

            IceCream newIceCream = new BasicIceCream();
            newIceCream.setPrice(iceCream.getPrice()-0.5);
            newIceCream.setItemName(newItemName);

            iceCream = newIceCream;
            //System.out.println(iceCream.getDescription());
            setMenuItem(iceCream);
        }

        @Override
        public Menu getMenuItem(){
            return iceCream;
        }
    }
}
