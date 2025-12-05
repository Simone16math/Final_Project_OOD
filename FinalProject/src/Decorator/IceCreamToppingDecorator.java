package Decorator;

import AbstractFactory.*;
import Command.*;
import Observer.*;

/*
    Author: Simone Charles
    Purpose: This file represents the base decorator class for the ice cream in which it serves as a baseline for all
            decorators to follow
 */

abstract class IceCreamToppingDecorator extends IceCream {
    // Attributes
    protected IceCream decoratedIceCream;

    // Constructor
    public IceCreamToppingDecorator(IceCream decoratedIceCream){
      this.decoratedIceCream = decoratedIceCream;
    }

    // return the description of the ice cream
    @Override
    public String getDescription(){
        return " " + getItemName() + " $" + getPrice();
    }

    @Override
    public double getPrice(){
        return decoratedIceCream.getPrice();
    }

    @Override
    public String getItemName(){
        return decoratedIceCream.getItemName();
    }


}
