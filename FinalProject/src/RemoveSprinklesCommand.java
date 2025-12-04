/*
    Author: Simone Charles
    Purpose: The RemoveSprinklesCommand is a command that removes sprinkles on the ice cream in the order
 */

public class RemoveSprinklesCommand implements Command{
    private IceCream iceCream;

    public RemoveSprinklesCommand(IceCream iceCream){
        this.iceCream = iceCream;
    }

    @Override
    public void execute(){

    }

}
