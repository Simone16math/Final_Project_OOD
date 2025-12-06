/*Annika Maringer
 *
 * class that implements Menu
 * */


package AbstractFactory;

public class LavaCake implements Menu {
    // add item Name
    @Override
    public String getItemName() {
        return "Lava Cake";
    }
    // add price
    @Override
    public double getPrice() {
        return 6;
    }
    // add description
    @Override
    public String getDescription() {
        return " " + getItemName() +  " $" + getPrice();
    }
}
