/*
    Author: Simone Charles
    Purpose: The RemoveSprinklesCommand is a command that removes sprinkles on the ice cream in the order
 */

public class RemoveSprinklesCommand implements Command{
    // Attribute
    private IceCream iceCream;

    // Constructor
    public RemoveSprinklesCommand(IceCream iceCream){
        this.iceCream = iceCream;
    }

    @Override
    public void setMenuItem(Menu menuItem){
        this.iceCream = (IceCream) menuItem;
    }

    @Override
    public void execute(Menu menuItem){
        setMenuItem(menuItem);
        String previousItemName = iceCream.getItemName();
        String newItemName = previousItemName.replace(", Sprinkles", "");

        IceCream newIceCream = new BasicIceCream();
        newIceCream.setPrice(iceCream.getPrice()-0.25);
        newIceCream.setItemName(newItemName);

        iceCream = newIceCream;
        //System.out.println(iceCream.getDescription());
        setMenuItem(iceCream);
    }

    @Override
    public Menu getMenuItem(){
        return iceCream;
    }

}
