package AbstractFactory;

public class CookiesNCreamIceCream implements Menu {
    @Override
    public String getItemName() {
        return "Cookies N' Cream Ice Cream";
    }

    @Override
    public double getPrice() {
        return 0.50;
    }

    @Override
    public String getDescription() {
        return " " + getItemName() +  " $" + getPrice();
    }
}
