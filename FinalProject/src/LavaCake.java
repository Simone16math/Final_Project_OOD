public class LavaCake implements Menu{
    @Override
    public String getItemName() {
        return "Lava Cake";
    }

    @Override
    public double getPrice() {
        return 6;
    }

    @Override
    public String getDescription() {
        return "Item: " + getItemName() +  " $" + getPrice();
    }
}
