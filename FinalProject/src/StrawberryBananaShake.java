public class StrawberryBananaShake implements Menu{
    @Override
    public String item() {
        return "Strawberry Banana Shake";
    }

    @Override
    public double getPrice() {
        return 5;
    }

    @Override
    public String getDescription() {
        return "Item: " + item() +  " $" + getPrice();
    }
}
