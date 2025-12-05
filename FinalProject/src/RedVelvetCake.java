public class RedVelvetCake implements Menu{
    @Override
    public String getItemName() {
        return "Red Velvet Cake";
    }

    @Override
    public double getPrice() {
        return 7;
    }

    @Override
    public String getDescription() {
        return " " + getItemName() +  " $" + getPrice();
    }
}
