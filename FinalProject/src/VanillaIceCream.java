public class VanillaIceCream implements Menu{
    @Override
    public String itemName() {
        return "Vanilla Ice Cream";
    }

    @Override
    public double getPrice() {
        return 2;
    }

    @Override
    public String getDescription() {
        return "Item: " + itemName() +  " $" + getPrice();
    }
}
