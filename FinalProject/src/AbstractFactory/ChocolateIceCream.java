/*Annika Maringer
*
* class that extends IceCream
* */


package AbstractFactory;

public class ChocolateIceCream extends IceCream{
    // add item Name
    @Override
    public String getItemName() {
        return "Chocolate Ice Cream";
    }
    // add price
    @Override
    public double getPrice() {
        return 2;
    }
    // add description
    @Override
    public String getDescription() {
        return " " + getItemName() + " $" + getPrice();
    }

}
