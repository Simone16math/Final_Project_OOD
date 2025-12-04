public class ChocolateShake implements Menu{

    @Override
    public String itemName() {
        return "Chocolate Shake";
    }

    @Override
    public double getPrice() {
        return 5;
    }

    @Override
    public String getDescription() {
        return "Item: " + itemName() +  " $" + getPrice();
    }
}
