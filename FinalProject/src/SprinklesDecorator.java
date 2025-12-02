public class SprinklesDecorator extends ToppingDecorator{

    public SprinklesDecorator(IceCream iceCream){
        super(iceCream);
    }

    public String getIceCreamDescription(){
        return super.getDescription() + ", Sprinkles";
    }

    public double price(){
        // need to change the price so that it updates or add price as an attribute to icecream
        return super.iceCream.price() + 0.25;
    }
}
