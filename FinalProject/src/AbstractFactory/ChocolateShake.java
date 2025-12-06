/*Annika Maringer
 *
 * class that implements Menu
 * */

package AbstractFactory;

public class ChocolateShake implements Menu {
    // add item Name
    @Override
    public String getItemName() {
        return "Chocolate Shake";
    }
    // add price
    @Override
    public double getPrice() {
        return 5;
    }
    // add description
    @Override
    public String getDescription() {
        return " " + getItemName() +  " $" + getPrice();
    }
}
