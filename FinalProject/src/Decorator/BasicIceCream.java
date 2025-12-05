package Decorator;

import AbstractFactory.*;
import Command.*;
import Decorator.*;
import Observer.*;

/*
    Author: Simone Charles
    Purpose: Describes the basic behavior of the ice cream objects being wrapped
 */

public class BasicIceCream extends IceCream {
    private String description;
    private String item = "Ice Cream";
    private double price = 2.0;

    @Override
    public String getItemName() {
        // returns the menu item's name
        //String name = "IceCream";
        return item;
    }

    @Override
    public double getPrice() {
        // returns the price of the menu item
        //double price = 2.0;
        return price;
    }

    @Override
    public String getDescription() {
        // returns the description of the menu item
        description = " " + this.getItemName() + " $" + getPrice();
        return description;
    }

    @Override
    public void setItemName(String item){
        this.item = item;
    }

    @Override
    public void setPrice(double price){
        this.price = price;
    }

}
