public class VanillaIceCreamPint implements Menu{
    @Override
    public String getItemName() {
        return "Vanilla Ice Cream Pint";
    }

    @Override
    public double getPrice() {
        return 10;
    }

    @Override
    public String getDescription() {
        return "Item: " + getItemName() +  " $" + getPrice();
    }
}
