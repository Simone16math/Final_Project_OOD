package AbstractFactory;

public class CookiesNCreamIceCream extends IceCream {
    @Override
    public String getItemName() {
        return "Cookies N' Cream Ice Cream";
    }

    @Override
    public double getPrice() {
        return 0.50;
    }

    @Override
    public String getDescription() {
        return " " + getItemName() +  " $" + getPrice();
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
