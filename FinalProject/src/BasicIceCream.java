/*
    Author: Simone Charles
    Purpose: Describes the basic behavior of the ice cream objects being wrapped
 */

public class BasicIceCream extends IceCream{

    @Override
    public String getItemName() {
        // returns the menu item's name
        String name = "IceCream";
        return name;
    }

    @Override
    public double getPrice() {
        // returns the price of the menu item
        double price = 2.0;
        return price;
    }

    @Override
    public String getDescription() {
        // returns the description of the menu item
        return "Item: " + this.getItemName() + " $" + getPrice();
    }
}
