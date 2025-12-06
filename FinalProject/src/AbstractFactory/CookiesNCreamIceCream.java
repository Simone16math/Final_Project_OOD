/*Annika Maringer
 *
 * class that extends IceCream
 * */


package AbstractFactory;

public class CookiesNCreamIceCream extends IceCream {
    // add item Name
    @Override
    public String getItemName() {
        return "Cookies N' Cream Ice Cream";
    }
    // add price
    @Override
    public double getPrice() {
        return 2.50;
    }
    // add description
    @Override
    public String getDescription() {
        return " " + getItemName() +  " $" + getPrice();
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
