public class Cookie implements Menu{
    @Override
    public String item() {
        return "Cookie";
    }

    @Override
    public double getPrice() {
        return 2.0;
    }

    @Override
    public String getDescription(){
        return "Item: " + item() +  " $" + getPrice();
    }
}
