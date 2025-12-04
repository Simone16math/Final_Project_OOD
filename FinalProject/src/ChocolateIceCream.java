public class ChocolateIceCream implements Menu{
    @Override
    public String itemName() {
        return "Chocolate Ice Cream";
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
