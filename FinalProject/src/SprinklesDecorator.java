public class SprinklesDecorator extends ToppingDecorator{

    public SprinklesDecorator(IceCream1 iceCream1){
        super(iceCream1);
    }

    @Override
    public String getDescription(){
        return super.getDescription() + ", Sprinkles";
    }

    @Override
    public double getPrice(){
        return super.iceCream1.getPrice() + 0.25;
    }
}
