/* Annika Maringer

abstract class that implements Menu and has methods like cone and cup
 */

package AbstractFactory;

public abstract class IceCream implements Menu {
   private String description;
   private String item = "Ice Cream";
   private double price = 2.0;
    // add item Name
    @Override
    public String getItemName() {;
        return item;
    }
    // add price
    @Override
    public double getPrice() {
        return price;
    }
    // add description
    @Override
    public String getDescription() {
        description = " " + getItemName() + " $" + getPrice();
        return description;
    }

    public void setItemName(String item){
        this.item = item;
    }

    public void setPrice(double price){
        this.price = price;
    }

    public String cone(){
        description = " In a Cone";
        return description;
    }
    public String cup(){
        description = " In a Cup" ;
        return description;
    }
}
