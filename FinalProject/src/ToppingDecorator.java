public abstract class ToppingDecorator implements IceCream1{
    protected IceCream1 iceCream1;

    public ToppingDecorator(IceCream1 iceCream1){
        this.iceCream1 = iceCream1;
    }

    @Override
    public String getDescription(){
        return iceCream1.getDescription();
    }

    @Override
    public double getPrice(){
        return iceCream1.getPrice();
    }

}
