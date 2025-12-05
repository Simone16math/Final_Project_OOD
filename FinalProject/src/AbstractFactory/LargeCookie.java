package AbstractFactory;

public class LargeCookie implements Menu {
    @Override
    public String getItemName() {
        return "Large Cookie";
    }

    @Override
    public double getPrice() {
        return 3;
    }

    @Override
    public String getDescription() {
        return " " + getItemName() +  " $" + getPrice();
    }
}
