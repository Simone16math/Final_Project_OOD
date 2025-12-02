abstract class ToppingDecorator extends IceCream {
    protected IceCream iceCream;

    public ToppingDecorator(IceCream iceCream){
        this.iceCream = iceCream;
    }

    String getIceCreamDescription(){
        return iceCream.item();
    }

}
