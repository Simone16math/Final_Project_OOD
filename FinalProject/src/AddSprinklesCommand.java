/*
    Author: Simone Charles
    Purpose: The AddSprinklesCommand is a command that adds chocolate sauce to the ice cream in the order
 */


public class AddSprinklesCommand implements Command{
    // Attribute
    private IceCream iceCream;

    // Constructor
    public AddSprinklesCommand(IceCream iceCream){
        this.iceCream = iceCream;
    }

    @Override
    public void setMenuItem(Menu menuItem){
        this.iceCream = (IceCream) menuItem;
    }

    @Override
    public void execute(Menu menuItem){
        setMenuItem(menuItem);
        iceCream = new SprinklesDecoratorIceCream(iceCream);
        //System.out.println(iceCream.getDescription());
        setMenuItem(iceCream);
    }

    @Override
    public Menu getMenuItem(){
        return iceCream;
    }


}
