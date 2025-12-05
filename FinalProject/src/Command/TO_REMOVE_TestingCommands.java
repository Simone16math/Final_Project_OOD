package Command;

import AbstractFactory.*;
import Decorator.*;

import java.util.ArrayList;
import java.util.List;


public class TO_REMOVE_TestingCommands {

    public static void main(String[] args){
        IceCream testIceCream = new BasicIceCream();
        LavaCake lava = new LavaCake();
        List<Menu> orderList = new ArrayList<>();
        Command addSprinkles = new AddSprinklesCommand(testIceCream);
        Command removeSprinkles = new RemoveSprinklesCommand(testIceCream);
        Command addChocolateSauce = new AddChocolateSauceCommand(testIceCream);
        Command removeChocolateSauce = new RemoveChocolateSauceCommand(testIceCream);
        Command addMenuItem = new AddMenuItemCommand();
        Command removeMenuItem = new RemoveMenuItemCommand();


        CommandInvoker commandInvoker = new CommandInvoker();
        commandInvoker.addCommand(addSprinkles);
        commandInvoker.addCommand(removeSprinkles);
        commandInvoker.addCommand(addChocolateSauce);
        commandInvoker.addCommand(removeChocolateSauce);
        commandInvoker.addCommand(addMenuItem);
        commandInvoker.addCommand(removeMenuItem);


        commandInvoker.executeOrderUpdate(addMenuItem,testIceCream,orderList);
        testIceCream = (IceCream) commandInvoker.getMenuItem();

        commandInvoker.executeOrderUpdate(addMenuItem, lava, orderList);
        System.out.println(orderList.size());


        commandInvoker.executeDecoratorCommand(addSprinkles,testIceCream);
        testIceCream = (IceCream) commandInvoker.getMenuItem();
        commandInvoker.executeDecoratorCommand(addChocolateSauce, testIceCream);
        testIceCream = (IceCream) commandInvoker.getMenuItem();
        //System.out.println(testIceCream.getDescription());

        commandInvoker.executeDecoratorCommand(removeSprinkles,testIceCream);
        testIceCream = (IceCream) commandInvoker.getMenuItem();
        commandInvoker.executeDecoratorCommand(removeChocolateSauce,testIceCream);
        testIceCream = (IceCream) commandInvoker.getMenuItem();
        //System.out.println(testIceCream.getDescription());

        commandInvoker.executeDecoratorCommand(addSprinkles,testIceCream);
        testIceCream = (IceCream) commandInvoker.getMenuItem();
        commandInvoker.executeDecoratorCommand(addChocolateSauce, testIceCream);
        testIceCream = (IceCream) commandInvoker.getMenuItem();

        commandInvoker.executeOrderUpdate(removeMenuItem,lava,orderList);

        System.out.println(orderList.size());




    }
}
