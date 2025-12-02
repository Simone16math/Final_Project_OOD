public class AddChocolateSauceCommand implements Command{
    private IceCream iceCream;

    public AddChocolateSauceCommand(IceCream iceCream){
        this.iceCream = iceCream;
    }

    @Override
    public void execute(){

    }

}
