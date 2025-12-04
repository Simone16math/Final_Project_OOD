public class VanillaIceCream implements Menu{
    @Override
    public String getItemName() {
        return "Vanilla Ice Cream";
    }

    @Override
    public double getPrice() {
        return 0;
    }

    @Override
    public String getDescription() {
        return "Item: " + getItemName() +  " $" + getPrice();
    }
}
