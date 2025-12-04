public class LargeCookie implements Menu{
    @Override
    public String itemName() {
        return "Large Cookie";
    }

    @Override
    public double getPrice() {
        return 3;
    }

    @Override
    public String getDescription() {
        return "Item: " + itemName() +  " $" + getPrice();
    }
}
