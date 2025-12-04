public class ChocolateIceCreamPint implements Menu{
    @Override
    public String itemName() {
        return "Chocolate Ice Cream Pint";
    }

    @Override
    public double getPrice() {
        return 10;
    }

    @Override
    public String getDescription() {
        return "Item: " + itemName() +  " $" + getPrice();
    }
}
