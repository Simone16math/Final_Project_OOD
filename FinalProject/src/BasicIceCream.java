public class BasicIceCream extends IceCream{
    @Override
    public String item() {
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
        return "Item: " + item() + " $" + getPrice();
    }
}
