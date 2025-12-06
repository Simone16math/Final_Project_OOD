/*Annika Maringer
 *
 * class that implements Menu
 * */

package AbstractFactory;

public class StrawberryBananaShake implements Menu {
    // add item Name
    @Override
    public String getItemName() {
        return "Strawberry-Banana Smoothie";
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
