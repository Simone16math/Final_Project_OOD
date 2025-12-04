public class LavaCake implements Menu{
    @Override
    public String itemName() {
        return "Lava Cake";
    }

    @Override
    public double getPrice() {
        return 6;
    }

    @Override
    public String getDescription() {
        return "Item: " + itemName() +  " $" + getPrice();
    }
}
