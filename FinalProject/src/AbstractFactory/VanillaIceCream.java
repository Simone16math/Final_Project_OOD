/*Annika Maringer
 *
 * class that extends IceCream
 * */


package AbstractFactory;

public class VanillaIceCream extends IceCream {
    // add item Name
    @Override
    public String getItemName() {
        return "Vanilla Ice Cream";
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
    // cone or cup descriptions

}
