public class BasicIceCream extends IceCream implements Menu{
    @Override
    public String item() {
        String name = "IceCream";
        return name;
    }

    @Override
    public double price() {
        double price = 2.0;
        return price;
    }
}
