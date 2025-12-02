abstract class IceCreamToppingDecorator extends IceCream {
    protected IceCream iceCream;

    public IceCreamToppingDecorator(IceCream iceCream){
        this.iceCream = iceCream;
    }

    String getIceCreamDescription(){
        return iceCream.item();
    }

}
