package Command;

import AbstractFactory.*;
import Command.*;
import Decorator.*;
import Observer.*;


public class TestingCommands {

    public static void main(String[] args){
        IceCream testIceCream = new BasicIceCream();
        Command addSprinkles = new AddSprinklesCommand(testIceCream);
        Command removeSprinkles = new RemoveSprinklesCommand(testIceCream);
        Command addChocolateSauce = new AddChocolateSauceCommand(testIceCream);
        Command removeChocolateSauce = new RemoveChocolateSauceCommand(testIceCream);

        CommandInvoker commandInvoker = new CommandInvoker();
        commandInvoker.addCommand(addSprinkles);
        commandInvoker.addCommand(removeSprinkles);
        commandInvoker.addCommand(addChocolateSauce);
        commandInvoker.addCommand(removeChocolateSauce);



        commandInvoker.executeCommand(addSprinkles,testIceCream);
        testIceCream = (IceCream) commandInvoker.getMenuItem();
        commandInvoker.executeCommand(addChocolateSauce, testIceCream);
        testIceCream = (IceCream) commandInvoker.getMenuItem();
        //System.out.println(testIceCream.getDescription());

        commandInvoker.executeCommand(removeSprinkles,testIceCream);
        testIceCream = (IceCream) commandInvoker.getMenuItem();
        commandInvoker.executeCommand(removeChocolateSauce,testIceCream);
        testIceCream = (IceCream) commandInvoker.getMenuItem();
        //System.out.println(testIceCream.getDescription());




    }
}
