package AbstractFactory;

public class VanillaIceCreamPint implements Menu {
    // add item Name
    @Override
    public String getItemName() {
        return "Vanilla Ice Cream Pint";
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
