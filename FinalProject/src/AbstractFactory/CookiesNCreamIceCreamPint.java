package AbstractFactory;

public class CookiesNCreamIceCreamPint implements Menu {
    // add item Name
    @Override
    public String getItemName() {
        return "Cookies N Cream Ice Cream Pint";
    }
    // add price
    @Override
    public double getPrice() {
        return 8;
    }
    // add description
    @Override
    public String getDescription() {
        return " " + getItemName() +  " $" + getPrice();
    }
}
