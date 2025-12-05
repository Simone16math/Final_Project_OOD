public class ChocolateIceCream implements Menu{
    @Override
    public String getItemName() {
        return "Chocolate Ice Cream";
    }

    @Override
    public double getPrice() {
        return 0;
    }

    @Override
    public String getDescription() {
        return " " + getItemName();
    }
}
