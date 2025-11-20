public class Sprinkles extends ToppingDecorator{

    public Sprinkles(IceCream iceCream){
        super(iceCream);
    }

    public String getDescription(){
        return super.getDescription() + ", Sprinkles";
    }

    public void price(){
        // need to change the price so that it updates or add price as an attribute to icecream
    }
}
