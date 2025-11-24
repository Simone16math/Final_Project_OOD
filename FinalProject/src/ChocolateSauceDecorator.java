public class ChocolateSauceDecorator extends ToppingDecorator{

    public ChocolateSauceDecorator(IceCream1 iceCream1){
        super(iceCream1);
    }

    @Override
    public String getDescription(){
        return super.getDescription() + ", Chocolate Sauce";
    }

    @Override
    public double getPrice(){
        return super.iceCream1.getPrice() + 0.50;
    }

}
