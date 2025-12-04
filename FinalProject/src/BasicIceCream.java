public class BasicIceCream extends IceCream{
    @Override
    public String itemName() {
        String name = "IceCream";
        return name;
    }

    @Override
    public double getPrice() {
        double price = 2.0;
        return price;
    }

    @Override
    public String getDescription() {
        return "Item: " + itemName() + " $" + getPrice();
    }
}
