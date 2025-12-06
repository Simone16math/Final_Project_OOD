package Decorator;

import AbstractFactory.*;
import Command.*;
import Observer.*;

/*
    Author: Simone Charles
    Purpose: Adds chocolate sauce to the ice cream
 */

public class ChocolateSauceDecoratorIceCream extends IceCreamToppingDecorator {

    // Constructor
    public ChocolateSauceDecoratorIceCream(IceCream iceCream){
        super(iceCream);
    }

    @Override
    public String getDescription(){
        // returned the updated description of the ice cream
        return "Item: " + getItemName() + " $" + getPrice();
    }

    @Override
    public String getItemName(){
        // returns the items new name;
        return decoratedIceCream.getItemName() + ", Chocolate Sauce";
    }

    @Override
    public double getPrice(){
        // returns the updated price of the ice cream
        return decoratedIceCream.getPrice() + 0.50;
    }
}
