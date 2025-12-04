public class CookiesNCreamIceCream implements Menu{
    @Override
    public String itemName() {
        return "Cookies N' Cream Ice Cream";
    }

    @Override
    public double getPrice() {
        return 2;
    }

    @Override
    public String getDescription() {
        return "Item: " + itemName() +  " $" + getPrice();
    }
}
