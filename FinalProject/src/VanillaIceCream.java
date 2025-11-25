public class VanillaIceCream implements Menu1,IceCream1{

    @Override
    public String getDescription(){
        return "Vanilla Ice Cream";
    }

    @Override
    public double getPrice(){
        return 2.00;
    }
}
