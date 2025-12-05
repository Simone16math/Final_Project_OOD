package AbstractFactory;

public class ChocolateShake implements Menu {

    @Override
    public String getItemName() {
        return "Chocolate Shake";
    }

    @Override
    public double getPrice() {
        return 5;
    }

    @Override
    public String getDescription() {
        return " " + getItemName() +  " $" + getPrice();
    }
}
