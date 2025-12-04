public class Drinks implements Menu{
    @Override
    public String getItemName() {
        return "Drinks";
    }

    @Override
    public double getPrice() {
        return 5.0;
    }

    @Override
    public String getDescription (){
        return "Item: " + getItemName() +  " $" + getPrice();
    }
}
