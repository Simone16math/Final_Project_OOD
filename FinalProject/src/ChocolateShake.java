public class ChocolateShake implements Menu{

    @Override
    public String item() {
        return "Chocolate Shake";
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
