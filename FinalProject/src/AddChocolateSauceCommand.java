/*
    Author: Simone Charles
    Purpose: The AddChocolateSauceCommand is a command that adds chocolate sauce to the ice cream in the order
 */

public class AddChocolateSauceCommand implements Command{
    // Attribute
    private IceCream iceCream;

    // Constructor
    public AddChocolateSauceCommand(IceCream iceCream){
        this.iceCream = iceCream;
    }

    @Override
    public void setMenuItem(Menu menuItem){
        this.iceCream = (IceCream) menuItem;
    }

    @Override
    public void execute(Menu menuItem){
        setMenuItem(menuItem);
        iceCream = new ChocolateSauceDecoratorIceCream(iceCream);
        System.out.println(iceCream.getDescription());
        setMenuItem(iceCream);
    }
    @Override
    public Menu getMenuItem(){
        return iceCream;
    }

}
