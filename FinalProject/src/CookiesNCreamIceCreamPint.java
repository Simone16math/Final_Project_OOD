public class CookiesNCreamIceCreamPint implements Menu{
    @Override
    public String getItemName() {
        return "Cookies N Cream Ice Cream Pint";
    }

    @Override
    public double getPrice() {
        return 8;
    }

    @Override
    public String getDescription() {
        return "Item: " + getItemName() +  " $" + getPrice();
    }
}
