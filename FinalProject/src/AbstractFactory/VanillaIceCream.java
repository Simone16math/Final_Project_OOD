package AbstractFactory;

public class VanillaIceCream extends IceCream {
    @Override
    public String getItemName() {
        return "Vanilla Ice Cream";
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
