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
    public String getIceCreamDescription(){
        // returns the updated description of the ice cream
        return super.getDescription() + ", Sprinkles";
    }


    @Override
    public double getPrice(){
        // returns the updated price of the ice cream
        return super.iceCream.getPrice() + 0.25;
    }
}
