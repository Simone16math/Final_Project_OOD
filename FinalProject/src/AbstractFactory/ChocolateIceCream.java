package AbstractFactory;

public class ChocolateIceCream extends IceCream{
    // add item Name
    @Override
    public String getItemName() {
        return "Chocolate Ice Cream";
    }
    // add price
    @Override
    public double getPrice() {
        return 0;
    }
    // add description
    @Override
    public String getDescription() {
        return " " + getItemName();
    }
    // cone or cup descriptions
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
