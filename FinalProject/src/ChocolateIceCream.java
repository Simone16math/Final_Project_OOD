public class ChocolateIceCream implements Menu{
    @Override
    public String itemName() {
        return "Chocolate Ice Cream";
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
