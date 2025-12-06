package AbstractFactory;

public class VanillaIceCream extends IceCream {
    // add item Name
    @Override
    public String getItemName() {
        return "Vanilla Ice Cream";
    }
    // add price
    @Override
    public double getPrice() {
        return 2;
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
