/*
    Author: Simone Charles
    Purpose: The RemoveChocolateSauceCommand is a command that removes the chocolate sauce on the ice cream in the order
 */

public class RemoveChocolateSauceCommand implements Command{
    // Attribute
    private IceCream iceCream;

    // Constructor
    public RemoveChocolateSauceCommand(IceCream iceCream){
        this.iceCream = iceCream;
    }

    @Override
    public void setMenuItem(Menu menuItem){
        this.iceCream = (IceCream) menuItem;
    }

    @Override
    public void execute(Menu menuItem){

    }

    @Override
    public Menu getMenuItem(){
        return iceCream;
    }
}
