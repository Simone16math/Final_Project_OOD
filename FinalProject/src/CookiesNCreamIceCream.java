public class CookiesNCreamIceCream implements Menu{
    @Override
    public String itemName() {
        return "Cookies N' Cream Ice Cream";
    }

    @Override
    public double getPrice() {
        return 0.50;
    }

    @Override
    public String getDescription() {
        return "Item: " + itemName() +  " $" + getPrice();
    }
}
