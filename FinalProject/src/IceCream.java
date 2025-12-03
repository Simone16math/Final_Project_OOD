public class IceCream implements Menu{
    @Override
    public String item() {;
        return "Ice Cream";
    }

    @Override
    public double getPrice() {
        return 2.0;
    }

    @Override
    public String getDescription() {
        return "Item: " + item() + " " + getPrice();
    }
}
