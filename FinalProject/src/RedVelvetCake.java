public class RedVelvetCake implements Menu{
    @Override
    public String itemName() {
        return "Red Velvet Cake";
    }

    @Override
    public double getPrice() {
        return 7;
    }

    @Override
    public String getDescription() {
        return "Item: " + itemName() +  " $" + getPrice();
    }
}
