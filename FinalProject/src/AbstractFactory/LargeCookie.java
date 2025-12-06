/*Annika Maringer
 *
 * class that implements Menu
 * */

package AbstractFactory;

public class LargeCookie implements Menu {
    // add item Name
    @Override
    public String getItemName() {
        return "Large Cookie";
    }
    // add price
    @Override
    public double getPrice() {
        return 3;
    }
    // add description
    @Override
    public String getDescription() {
        return " " + getItemName() +  " $" + getPrice();
    }
}
