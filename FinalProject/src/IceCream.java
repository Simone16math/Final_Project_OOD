public abstract class IceCream implements Menu{
    @Override
    public String itemName() {;
        return "Ice Cream";
    }

    @Override
    public double getPrice() {
        return 2.0;
    }

    @Override
    public String getDescription() {
        return "Item: " + itemName() + " $" + getPrice();
    }
}
