public class VanillaIceCream implements Menu{
    @Override
    public String itemName() {
        return "Vanilla Ice Cream";
    }

    @Override
    public double getPrice() {
        return 0;
    }

    @Override
    public String getDescription() {
        return "Item: " + itemName() +  " $" + getPrice();
    }
}
