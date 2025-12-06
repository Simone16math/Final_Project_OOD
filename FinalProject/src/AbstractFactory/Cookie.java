/*Annika Maringer
 *
 * class that implements Menu
 * */

package AbstractFactory;

public class Cookie implements Menu {
    // add item Name
    @Override
    public String getItemName() {
        return "Small Cookie";
    }
    // add price
    @Override
    public double getPrice() {
        return 2.0;
    }
    // add description
    @Override
    public String getDescription(){
        return " " + getItemName() +  " $" + getPrice();
    }
}
