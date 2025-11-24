public class ChocolateChipsDecorator extends ToppingDecorator{

    public ChocolateChipsDecorator(IceCream1 iceCream1){
        super(iceCream1);
    }

    @Override
    public String getDescription(){
        return super.getDescription() + ", Chocolate Chips";
    }

    @Override
    public double getPrice(){
        return super.iceCream1.getPrice() + 0.50;
    }

}
