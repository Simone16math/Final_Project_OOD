abstract class ToppingDecorator  implements IceCream{
    protected IceCream iceCream;

    public ToppingDecorator(IceCream iceCream){
        this.iceCream = iceCream;
    }

    String getDescription(){
        return iceCream.item();
    }

}
