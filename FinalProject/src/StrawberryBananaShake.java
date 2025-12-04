public class StrawberryBananaShake implements Menu{
    @Override
    public String getItemName() {
        return "Strawberry-Banana Smoothie";
    }

    @Override
    public double getPrice() {
        return 5;
    }

    @Override
    public String getDescription() {
        return "Item: " + getItemName() +  " $" + getPrice();
    }
}
