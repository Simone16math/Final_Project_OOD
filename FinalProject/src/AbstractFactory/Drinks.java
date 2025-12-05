package AbstractFactory;

public class Drinks implements Menu {
    @Override
    public String getItemName() {
        return "Vanilla Shake";
    }

    @Override
    public double getPrice() {
        return 5.0;
    }

    @Override
    public String getDescription (){
        return " " + getItemName() +  " $" + getPrice();
    }
}
