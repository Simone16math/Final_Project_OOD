/*
    Author: Simone Charles
    Purpose: Add chocolate sauce to the constructor
 */

public class ChocolateSauceDecoratorIceCream extends IceCreamToppingDecorator {

    // Constructor
    public ChocolateSauceDecoratorIceCream(IceCream iceCream){
        super(iceCream);
    }

    @Override
    public String getIceCreamDescription(){
        // returned the updated description of the ice cream
        return super.getIceCreamDescription() + ", Chocolate Sauce";
    }

    @Override
    public double getPrice(){
        // returns the updated price of the ice cream
        return super.iceCream.getPrice() + 0.50;
    }
}
