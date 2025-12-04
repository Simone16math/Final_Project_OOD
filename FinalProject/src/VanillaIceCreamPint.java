public class VanillaIceCreamPint implements Menu{
    @Override
    public String itemName() {
        return "Vanilla Ice Cream Pint";
    }

    @Override
    public double getPrice() {
        return 10;
    }

    @Override
    public String getDescription() {
        return "Item: " + itemName() +  " $" + getPrice();
    }
}
