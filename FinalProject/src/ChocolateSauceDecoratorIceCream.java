public class ChocolateSauceDecoratorIceCream extends IceCreamToppingDecorator {

    public ChocolateSauceDecoratorIceCream(IceCream iceCream){
        super(iceCream);
    }

    @Override
    public String getIceCreamDescription(){
        return super.getIceCreamDescription() + ", Chocolate Sauce";
    }

    @Override
    public double price(){
        return super.iceCream.price() + 0.50;
    }
}
