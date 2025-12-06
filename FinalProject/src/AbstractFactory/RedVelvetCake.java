package AbstractFactory;

public class RedVelvetCake implements Menu {
    // add item Name
    @Override
    public String getItemName() {
        return "Red Velvet Cake";
    }
    // add price
    @Override
    public double getPrice() {
        return 7;
    }
    // add description
    @Override
    public String getDescription() {
        return " " + getItemName() +  " $" + getPrice();
    }
}
