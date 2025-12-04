public class TestingCommands {

    public static void main(String[] args){
        IceCream testIceCream = new BasicIceCream();
        Command addSprinkles = new AddSprinklesCommand(testIceCream);
        Command removeSprinkles = new RemoveSprinklesCommand(testIceCream);

        CommandInvoker commandInvoker = new CommandInvoker();
        commandInvoker.addCommand(addSprinkles);
        commandInvoker.addCommand(removeSprinkles);

        commandInvoker.executeCommand(addSprinkles);

    }
}
