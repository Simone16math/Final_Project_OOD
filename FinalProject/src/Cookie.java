public class Cookie implements Menu{
    @Override
    public String getItemName() {
        return "Small Cookie";
    }

    @Override
    public double getPrice() {
        return 2.0;
    }

    @Override
    public String getDescription(){
        return "Item: " + getItemName() +  " $" + getPrice();
    }
}
