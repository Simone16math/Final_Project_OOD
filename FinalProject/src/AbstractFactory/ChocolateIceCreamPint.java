/*Annika Maringer
 *
 * class that implements Menu
 * */

package AbstractFactory;

public class ChocolateIceCreamPint implements Menu {
    // add item Name
    @Override
    public String getItemName() {
        return "Chocolate Ice Cream Pint";
    }
    // add price
    @Override
    public double getPrice() {
        return 7;
    }
    // add description
    @Override
    public String getDescription() {
        return " " + getItemName() +  " $" + getPrice();
    }
}
