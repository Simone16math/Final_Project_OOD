package AbstractFactory;

public class Drinks implements Menu {
    // add item Name
    @Override
    public String getItemName() {
        return "Vanilla Shake";
    }
    // add price
    @Override
    public double getPrice() {
        return 5.0;
    }
    // add description
    @Override
    public String getDescription (){
        return " " + getItemName() +  " $" + getPrice();
    }
}
