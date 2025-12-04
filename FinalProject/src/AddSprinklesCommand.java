/*
    Author: Simone Charles
    Purpose: The AddSprinklesCommand is a command that adds chocolate sauce to the ice cream in the order
 */


public class AddSprinklesCommand implements Command{
    private IceCream iceCream;

    public AddSprinklesCommand(IceCream iceCream){
        this.iceCream = iceCream;
    }

    @Override
    public void execute(){

    }

}
