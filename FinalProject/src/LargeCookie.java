public class LargeCookie implements Menu{
    @Override
    public String item() {
        return "Large Cookie";
    }

    @Override
    public double getPrice() {
        return 3;
    }

    @Override
    public String getDescription() {
        return "Item: " + item() +  " $" + getPrice();
    }
}
