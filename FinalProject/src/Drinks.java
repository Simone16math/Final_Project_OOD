public class Drinks implements Menu{
    @Override
    public String itemName() {
        return "Drinks";
    }

    @Override
    public double getPrice() {
        return 5.0;
    }

    @Override
    public String getDescription (){
        return "Item: " + itemName() +  " $" + getPrice();
    }
}
