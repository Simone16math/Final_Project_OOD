package AbstractFactory;

public abstract class IceCream implements Menu {
   private String description;
   private String item = "Ice Cream";
   private double price = 2.0;

    @Override
    public String getItemName() {;
        return item;
    }

    @Override
    public double getPrice() {
        return price;
    }

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
}
