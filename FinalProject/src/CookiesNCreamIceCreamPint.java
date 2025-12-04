public class CookiesNCreamIceCreamPint implements Menu{
    @Override
    public String itemName() {
        return "Cookies N Cream Ice Cream Pint";
    }

    @Override
    public double getPrice() {
        return 11;
    }

    @Override
    public String getDescription() {
        return "Item: " + itemName() +  " $" + getPrice();
    }
}
