package AbstractFactory;

public class ChocolateIceCream extends IceCream{
    @Override
    public String getItemName() {
        return "Chocolate Ice Cream";
    }

    @Override
    public double getPrice() {
        return 0;
    }

    @Override
    public String getDescription() {
        return " " + getItemName();
    }

    @Override
    public String cone(){
        String description = " In a Cone";
        return description;
    }
    @Override
    public String cup(){
        String description = " In a Cup" ;
        return description;
    }
}
