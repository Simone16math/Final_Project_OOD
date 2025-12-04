/*
    Author: Simone Charles
    Purpose: This file represents the base decorator class for the ice cream in which it serves as a baseline for all
            decorators to follow
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
