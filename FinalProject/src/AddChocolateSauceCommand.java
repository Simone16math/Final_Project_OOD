/*
    Author: Simone Charles
    Purpose: The AddChocolateSauceCommand is a command that adds chocolate sauce to the ice cream in the order
 */

public class AddChocolateSauceCommand implements Command{
    private IceCream iceCream;

    public AddChocolateSauceCommand(IceCream iceCream){
        this.iceCream = iceCream;
    }

    @Override
    public void execute(){

    }

}
