public class VanillaIceCreamPint implements Menu{
    @Override
    public String getItemName() {
        return "Vanilla Ice Cream Pint";
    }

    @Override
    public double getPrice() {
        return 7;
    }

    @Override
    public String getDescription() {
        return " " + getItemName() +  " $" + getPrice();
    }
}
