/*
    Author: Simone Charles
    Purpose: Adds sprinkles to the ice cream
 */

public class SprinklesDecoratorIceCream extends IceCreamToppingDecorator {
    // Constructor
    public SprinklesDecoratorIceCream(IceCream iceCream) {
        super(iceCream);
    }

    @Override
    public String getDescription(){
        // returns the updated description of the ice cream
        return " " + getItemName() + " $" + getPrice();
    }

    @Override
    public String getItemName(){
        // updates the description of the ice cream
        return decoratedIceCream.getItemName() + ", Sprinkles";
    }

    @Override
    public double getPrice(){
        // returns the updated price of the ice cream
        return decoratedIceCream.getPrice() + 0.25;
    }
}
