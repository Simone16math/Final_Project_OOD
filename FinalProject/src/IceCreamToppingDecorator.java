/*
    Author: Simone Charles
    Purpose:
 */

abstract class IceCreamToppingDecorator extends IceCream {
    // Attributes
    protected IceCream iceCream;

    // Constructor
    public IceCreamToppingDecorator(IceCream iceCream){
      this.iceCream = iceCream;
    }

    // return the description of the ice cream
     String getIceCreamDescription(){
        return iceCream.getDescription();
    }

}
