# Café Menu System

Cafe Menu System that represents an Order System of a Cafe/IceCream Parler. 

## Authors

Simone Charles\
Annika Maringer


## Description

This program depicts a Menu and a order System using structured sequences of tasks, like adding the name, add an order, remove an Item/Topping and Submitting an Order.
It uses different Design Patterns, like Abstract Factory, Observer, Command and Decorator.

## Design Patterns Implemented

## 1. Abstract Factory

The Abstract Factory is responsible for different Variations of Menu Items and creating those.
### Interfaces
- **Menu**: a set of methods that the product classes need to implement
- **MenuAbstractFactory**: methods to create each Item

### Additional Factory Classes
- **DessertFactory**: implements methods to create each Item

### Concrete Classes
- **IceCream**: abstract class that implements Menu and has methods like cone and cup
- **VanillaIceCream**: class that extends IceCream
- **ChocolateIceCream**: class that extends IceCream
- **CookiesNCreamIceCream**: class that extends IceCream
- all other concrete classes from Cookies to Drinks implement Menu Interface

## 2. Observer

The Observer is responsible for the Order Status being sent to the Customer on the Output Box.

### Interfaces
- **Observer**: update method to update the Customer
- **Subject**: set of methods that add,remove and notifies the customer about the order status

### Concrete Classes
- **Order**: implements Subject methods
- **CaféMenuUICopy**: implements Observer and initializes the order status.


## 3. Command

The Command is responsible for parameterizing objects with operations in which requests are formulated as objects which contain the information desired.
### Interfaces
- **Command**: Interface class that executes specific tasks
- **CommandOrder**: responsible for the baseline of the commands that deal with the orders

### Concrete Classes
- **AddChocolateSauceCommand**: Command concrete class that executes and calls the
- **AddSprinklesCommand**: Command concrete class that executes and calls
- **AddMenuItemCommand**:
- **RemoveChocolateSauceCommand**: Command concrete class that executes and calls
- **RemoveSprinklesCommand**: Command concrete class that executes and calls
- **RemoveMenuItemCommand**: 
### Invoker Class
- **CommandInvoker**: adds commands to list and lets them execute

## 4. Decorator
The Decorator is responsible for wrapping the ice cream objects so that it can dynamically add features at runtime. 
- **IceCreamToppingDecorator**:
- **SprinklesDecoratorIceCream**:
- **ChocolateSauceDecoratorIceCream**:

## Requirements

- Java Development Kit (JDK) 8 or higher
- Imports java.util.ArrayList, java.util.List and java.swing.*;

## Installation

1. Download the FinalProject.java file
2. Save it to your desired directory
3. Open a terminal or command prompt in that directory

## Compilation

Compile the Java file:

```bash
javac FinalProject.java
```

This will generate multiple .class files for all the classes in the system.

## Running the Program

Execute the compiled program:

```bash
java FinalProject
```
## Usage

Link:

## Resources used

- Professor Roy's GitHub examples
- Professor Roy's Presentation Slides
- https://refactoring.guru/design-patterns/java
- https://www.youtube.com/watch?si=McH7-JNR8GYpyyf6&embeds_referring_euri=https%3A%2F%2Fwww.google.com%2Fsearch%3Fsca_esv%3D711d87e2c6f6d006%26rlz%3D1C1CHBD_deDE1093US1094%26sxsrf%3DAE3TifM0obCaVsOc5p_3cbQ-es8Xy-3cSA%3A17648&source_ve_path=MTM5MTE3LDM2ODQyLDI4NjY0LDE2NDUwNg&v=Kmgo00avvEw&feature=youtu.be
- StackOverFlow
- https://htmlcolorcodes.com/colors/light-brown/
- https://stackoverflow.com/questions/2352727/closing-jframe-with-button-click
- https://docs.oracle.com/javase/8/docs/api/javax/swing/JButton.html
- https://docs.oracle.com/javase/tutorial/uiswing/layout/visual.html
- https://www.geeksforgeeks.org/java/fonts-available-in-java-awt/
- https://stackoverflow.com/questions/4219919/how-to-change-the-background-color-on-a-java-panel
- https://docs.oracle.com/javase/tutorial/2d/images/loadimage.html
- https://coderanch.com/t/330964/java/positioning-JFrames-Screen
- https://docs.oracle.com/javase/8/docs/api/javax/swing/ImageIcon.html
- https://docs.oracle.com/javase/tutorial/uiswing/layout/gridbag.html
- https://docs.oracle.com/javase/8/docs/api/java/awt/FlowLayout.html
- https://docs.oracle.com/javase/8/docs/api/java/lang/String.html
- 


