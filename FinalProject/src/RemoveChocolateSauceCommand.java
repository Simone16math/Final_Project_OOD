/*
    Author: Simone Charles
    Purpose: The RemoveChocolateSauceCommand is a command that removes the chocolate sauce on the ice cream in the order
 */

public class RemoveChocolateSauceCommand implements Command{

    private IceCream iceCream;

    public RemoveChocolateSauceCommand(IceCream iceCream){
        this.iceCream = iceCream;
    }

    @Override
    public void execute(){

    }
}
