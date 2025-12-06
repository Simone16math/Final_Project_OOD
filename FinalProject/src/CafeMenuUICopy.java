/* Annika Maringer
Simone Charles

implements Observer
sets up the main gui frame
 */
import AbstractFactory.*;
import AbstractFactory.Menu;
import Command.*;
import Command.Command;
import Command.CommandInvoker;
import Decorator.*;
import Observer.*;
import Observer.Observer;

import javax.swing.*;
import javax.swing.Timer;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class CafeMenuUICopy extends JFrame implements Observer {
    private final String message = null;
    private JTextArea outputArea;
    private JPanel parent;
    Order order = new Order();
    private java.util.List<Menu> orderList = new ArrayList();
    IceCream icecream = new BasicIceCream();
    BasicIceCream basicIceCream = new BasicIceCream();
    Cookie basicCookie = new Cookie();
    Drinks drinks = new Drinks();
    MenuAbstractFactory menuFactory = new DessertsFactory();
    private String path;
    private String imagePath;

    @Override
    public void update(String Order) {
        log("---Order Update---");
        log(Order);
    }

    public CafeMenuUICopy() {
        setTitle("Café");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(1200, 800);
        setLocationRelativeTo(null);
        getContentPane().setBackground(new Color(111, 78, 55));

        imagePath =  "FinalProject\\src\\imagesOfMenu\\CafeLogo.jpg";
        //image3 ="C:\Users\annik\OneDrive\Documents\College\NCF\Java\finalProject\Final_Project_OOD\FinalProject\src\background.jpg";
        this.setIconImage(new ImageIcon(imagePath).getImage());


        order.registerObserver(this); //register user as customer

        setLayout(new BorderLayout());

        JPanel main = new JPanel(new GridBagLayout());
        main.setBackground(new Color(111, 78, 55));
        add(main, BorderLayout.CENTER);

        JPanel SidePanel = new JPanel(new GridLayout(0, 1));
        SidePanel.setBackground(new Color(196, 164, 132));
        SidePanel.setPreferredSize(new Dimension(300, 800));
        add(SidePanel, BorderLayout.WEST);

        JLabel menu = new JLabel("Menu");
        menu.setFont(new Font("Broadway", Font.BOLD, 35));
        menu.setForeground(new Color(111, 78, 55));
        SidePanel.add(menu);

        path = "src/imagesOfMenu/underline.png";
        JLabel image = new JLabel(new ImageIcon(path));
        image.setPreferredSize(new Dimension(200, 100));
        SidePanel.add(image);

        JLabel plank = new JLabel(" ");
        SidePanel.add(plank);

        IceCream ic = new BasicIceCream();
        JLabel IceCreamMenu = new JLabel("Ice Cream $" + ic.getPrice());
        IceCreamMenu.setFont(new Font("Broadway", Font.BOLD, 20));
        IceCreamMenu.setForeground(new Color(111, 78, 55));
        SidePanel.add(IceCreamMenu);


        JLabel flavorM = new JLabel("Flavors: ");
        flavorM.setFont(new Font("Broadway", Font.BOLD, 15));
        flavorM.setForeground(new Color(111, 78, 55));
        SidePanel.add(flavorM);

        JLabel vanillaM = new JLabel("Vanilla");
        vanillaM.setFont(new Font("Broadway", Font.BOLD, 10));
        vanillaM.setForeground(new Color(111, 78, 55));
        SidePanel.add(vanillaM);

        JLabel chocolateM = new JLabel("Chocolate");
        chocolateM.setFont(new Font("Broadway", Font.BOLD, 10));
        chocolateM.setForeground(new Color(111, 78, 55));
        SidePanel.add(chocolateM);

        JLabel CNCM = new JLabel("Cookies N' Cream + $0.50");
        CNCM.setFont(new Font("Broadway", Font.BOLD, 10));
        CNCM.setForeground(new Color(111, 78, 55));
        SidePanel.add(CNCM);

        JLabel toppinsM = new JLabel("Toppings: ");
        toppinsM.setFont(new Font("Broadway", Font.BOLD, 15));
        toppinsM.setForeground(new Color(111, 78, 55));
        SidePanel.add(toppinsM);

        JLabel SprinklesM = new JLabel("Sprinkles + $0.25");
        SprinklesM.setFont(new Font("Broadway", Font.BOLD, 10));
        SprinklesM.setForeground(new Color(111, 78, 55));
        SidePanel.add(SprinklesM);

        JLabel ChocolateSauceM = new JLabel("Chocolate Sauce + $0.50");
        ChocolateSauceM.setFont(new Font("Broadway", Font.BOLD, 10));
        ChocolateSauceM.setForeground(new Color(111, 78, 55));
        SidePanel.add(ChocolateSauceM);

        JLabel plank2 = new JLabel(" ");
        SidePanel.add(plank2);

        Cookie c = new Cookie();
        LargeCookie lc = new LargeCookie();
        JLabel CookieM = new JLabel("Cookie ");
        CookieM.setFont(new Font("Broadway", Font.BOLD, 20));
        CookieM.setForeground(new Color(111, 78, 55));
        SidePanel.add(CookieM);

        JLabel sizes = new JLabel("Sizes");
        sizes.setFont(new Font("Broadway", Font.BOLD, 15));
        sizes.setForeground(new Color(111, 78, 55));
        SidePanel.add(sizes);

        JLabel small = new JLabel("small + $" + c.getPrice());
        small.setFont(new Font("Broadway", Font.BOLD, 10));
        small.setForeground(new Color(111, 78, 55));
        SidePanel.add(small);

        JLabel large = new JLabel("Large + $" + lc.getPrice());
        large.setFont(new Font("Broadway", Font.BOLD, 10));
        large.setForeground(new Color(111, 78, 55));
        SidePanel.add(large);

        JLabel plank3 = new JLabel(" ");
        SidePanel.add(plank3);

        JLabel CakeM = new JLabel("Cake ");
        CakeM.setFont(new Font("Broadway", Font.BOLD, 20));
        CakeM.setForeground(new Color(111, 78, 55));
        SidePanel.add(CakeM);
        JLabel flavorM2 = new JLabel("Flavors: ");
        flavorM2.setFont(new Font("Broadway", Font.BOLD, 15));
        flavorM2.setForeground(new Color(111, 78, 55));
        SidePanel.add(flavorM2);

        LavaCake lavac = new LavaCake();
        JLabel lava = new JLabel("Lava Cake + $" + lavac.getPrice());
        lava.setFont(new Font("Broadway", Font.BOLD, 10));
        lava.setForeground(new Color(111, 78, 55));
        SidePanel.add(lava);

        RedVelvetCake rvc = new RedVelvetCake();
        JLabel rvcM = new JLabel("Red Velvet Cake + $" + rvc.getPrice());
        rvcM.setFont(new Font("Broadway", Font.BOLD, 10));
        rvcM.setForeground(new Color(111, 78, 55));
        SidePanel.add(rvcM);

        JLabel plank4 = new JLabel(" ");
        SidePanel.add(plank4);

        JLabel IceCreamPM = new JLabel("Ice Cream Pints ");
        IceCreamPM.setFont(new Font("Broadway", Font.BOLD, 20));
        IceCreamPM.setForeground(new Color(111, 78, 55));
        SidePanel.add(IceCreamPM);
        JLabel flavorM3 = new JLabel("Flavors: ");
        flavorM3.setFont(new Font("Broadway", Font.BOLD, 15));
        flavorM3.setForeground(new Color(111, 78, 55));
        SidePanel.add(flavorM3);

        VanillaIceCreamPint vicp = new VanillaIceCreamPint();
        JLabel vicM = new JLabel("Vanilla Ice Cream Pint + $" + vicp.getPrice());
        vicM.setFont(new Font("Broadway", Font.BOLD, 10));
        vicM.setForeground(new Color(111, 78, 55));
        SidePanel.add(vicM);

        ChocolateIceCreamPint cicp = new ChocolateIceCreamPint();
        JLabel cicM = new JLabel("Vanilla Ice Cream Pint + $" + cicp.getPrice());
        cicM.setFont(new Font("Broadway", Font.BOLD, 10));
        cicM.setForeground(new Color(111, 78, 55));
        SidePanel.add(cicM);

        CookiesNCreamIceCreamPint cncicp = new CookiesNCreamIceCreamPint();
        JLabel cncicM = new JLabel("Vanilla Ice Cream Pint + $" + cncicp.getPrice());
        cncicM.setFont(new Font("Broadway", Font.BOLD, 10));
        cncicM.setForeground(new Color(111, 78, 55));
        SidePanel.add(cncicM);

        JLabel plank5 = new JLabel(" ");
        SidePanel.add(plank5);

        JLabel drinksM = new JLabel("Shakes and Smoothies ");
        drinksM.setFont(new Font("Broadway", Font.BOLD, 20));
        drinksM.setForeground(new Color(111, 78, 55));
        SidePanel.add(drinksM);
        JLabel flavorM4 = new JLabel("Flavors: ");
        flavorM4.setFont(new Font("Broadway", Font.BOLD, 15));
        flavorM4.setForeground(new Color(111, 78, 55));
        SidePanel.add(flavorM4);

        Drinks vanilla = new Drinks();
        JLabel vanillaD = new JLabel("Vanilla Shake + $" + vanilla.getPrice());
        vanillaD.setFont(new Font("Broadway", Font.BOLD, 10));
        vanillaD.setForeground(new Color(111, 78, 55));
        SidePanel.add(vanillaD);

        ChocolateShake scM = new ChocolateShake();
        JLabel scDM = new JLabel("Chocolate + $" + scM.getPrice());
        scDM.setFont(new Font("Broadway", Font.BOLD, 10));
        scDM.setForeground(new Color(111, 78, 55));
        SidePanel.add(scDM);

        StrawberryBananaShake stBS = new StrawberryBananaShake();
        JLabel stBSM = new JLabel("StrawBerry and Banana Shake + $" + stBS.getPrice());
        stBSM.setFont(new Font("Broadway", Font.BOLD, 10));
        stBSM.setForeground(new Color(111, 78, 55));
        SidePanel.add(stBSM);

        //Commands
        Menu iceCreamPlaceholder = menuFactory.createIceCream();
        Menu menuItemPlaceholder = null;
        CommandInvoker commandInvoker = new CommandInvoker();
        Command addSprinkles = new AddSprinklesCommand((IceCream) iceCreamPlaceholder);
        Command removeSprinkles = new RemoveSprinklesCommand((IceCream) iceCreamPlaceholder);
        Command addChocolateSauce = new AddChocolateSauceCommand((IceCream) iceCreamPlaceholder);
        Command removeChocolateSauce = new RemoveChocolateSauceCommand((IceCream) iceCreamPlaceholder);
        Command addMenuItem = new AddMenuItemCommand();
        Command removeMenuItem = new RemoveMenuItemCommand();
        commandInvoker.addCommand(addSprinkles);
        commandInvoker.addCommand(removeSprinkles);
        commandInvoker.addCommand(addChocolateSauce);
        commandInvoker.addCommand(removeChocolateSauce);
        commandInvoker.addCommand(addMenuItem);
        commandInvoker.addCommand(removeMenuItem);




        // Creates a GridBagConstraints object to define layout rules
        // (like position, spacing, alignment, and fill behavior) for components
        // in a GridBagLayout
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5);
        gbc.anchor = GridBagConstraints.WEST;
        gbc.fill = GridBagConstraints.HORIZONTAL;

        gbc.gridx = 0;
        gbc.gridy = 0;
        JLabel customer = new JLabel("Customer:");
        customer.setFont(new Font("Broadway", Font.BOLD, 25));
        customer.setForeground(new Color(255, 182, 193));
        main.add(customer, gbc);
        JTextField textField = new JTextField(20);
        textField.setFont(new Font("Broadway", Font.BOLD, 10));
        textField.setForeground(new Color(111, 78, 55));
        // Add action listener to log text field input when Enter is pressed
        textField.addActionListener(e -> {
            if(textField == null){
                log("Please enter name for your order: ");//idk why not working
            } else{
            log("Customer: " + textField.getText());
            log("---Receipt---");
            }
        });
        gbc.gridx = 1;
        main.add(textField, gbc);

        // submit button
        gbc.gridx = 2;
        JButton submitButton = new JButton("Submit");
        submitButton.setForeground(new Color(111, 78, 55));
        submitButton.setFont(new Font("Broadway", Font.BOLD, 10));
        // Action listener to log all input values when the button is clicked
        submitButton.addActionListener(e -> {
            String text = textField.getText();
            log("Customer: " + text);
            log("---Receipt---");
        });

        //Add this button to the panel, and use these layout constraints (gbc) to decide where and how to place it.”
        main.add(submitButton, gbc);

        // Option Dialog
        gbc.gridy = 1;
        gbc.gridx = 0;
        JLabel iceCreamLabel = new JLabel("Ice Cream:");
        iceCreamLabel.setFont(new Font("Broadway", Font.BOLD, 15));
        iceCreamLabel.setForeground(new Color(255, 182, 193));
        main.add(iceCreamLabel, gbc);
        gbc.gridy = 1;
        gbc.gridx = 1;
        //JPanel iceCreamPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        JPanel iceCreamPanel = new JPanel(new GridLayout(3,3,3,3));
        iceCreamPanel.setBackground(new Color(111, 78, 55));

        JRadioButton vanillaIceCreamCheckBox = new JRadioButton("Vanilla");
        vanillaIceCreamCheckBox.setFont(new Font("Broadway", Font.BOLD, 10));
        vanillaIceCreamCheckBox.setForeground(new Color(255, 182, 193));
        vanillaIceCreamCheckBox.setBackground(new Color(111, 78, 55));
        JRadioButton chocolateIceCreamCheckBox = new JRadioButton("Chocolate");
        chocolateIceCreamCheckBox.setFont(new Font("Broadway", Font.BOLD, 10));
        chocolateIceCreamCheckBox.setForeground(new Color(255, 182, 193));
        chocolateIceCreamCheckBox.setBackground(new Color(111, 78, 55));
        JRadioButton cookiesNCreamIceCreamCheckBox = new JRadioButton("Cookies N Cream");
        cookiesNCreamIceCreamCheckBox.setFont(new Font("Broadway", Font.BOLD, 10));
        cookiesNCreamIceCreamCheckBox.setForeground(new Color(255, 182, 193));
        cookiesNCreamIceCreamCheckBox.setBackground(new Color(111, 78, 55));
        ButtonGroup iceCreamFlavors = new ButtonGroup();
        iceCreamFlavors.add(vanillaIceCreamCheckBox);
        iceCreamFlavors.add(chocolateIceCreamCheckBox);
        iceCreamFlavors.add(cookiesNCreamIceCreamCheckBox);

        /*vanillaIceCreamCheckBox.addActionListener( new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                   if (vanillaIceCreamCheckBox.isSelected()){
                       log("Ice cream flavor is vanilla");

                   }
            }
        });
        chocolateIceCreamCheckBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (chocolateIceCreamCheckBox.isSelected()){
                    log("Ice cream flavor is chocolate");
                }
            }
        });
        cookiesNCreamIceCreamCheckBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (cookiesNCreamIceCreamCheckBox.isSelected()){
                    log("Ice cream flavor is cookies n cream");
                }

            }
        });*/
        iceCreamPanel.add(vanillaIceCreamCheckBox);
        iceCreamPanel.add(chocolateIceCreamCheckBox);
        iceCreamPanel.add(cookiesNCreamIceCreamCheckBox);

        JRadioButton iceCreamCone = new JRadioButton("Cone");
        iceCreamCone.setFont(new Font("Broadway", Font.BOLD, 10));
        iceCreamCone.setForeground(new Color(255, 182, 193));
        iceCreamCone.setBackground(new Color(111, 78, 55));
        JRadioButton iceCreamCup = new JRadioButton("Cup");
        iceCreamCup.setFont(new Font("Broadway", Font.BOLD, 10));
        iceCreamCup.setForeground(new Color(255, 182, 193));
        iceCreamCup.setBackground(new Color(111, 78, 55));
        ButtonGroup iCFlavors = new ButtonGroup();
        iCFlavors.add(iceCreamCone);
        iCFlavors.add(iceCreamCup);

        JPanel blank =new JPanel();
        blank.setBackground(new Color(111, 78, 55));


        /*iceCreamCup.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (iceCreamCup.isSelected()){
                    icecream.cup();
                }
            }
        });
        iceCreamCone.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (iceCreamCone.isSelected()){
                    icecream.cone();
                }
            }
        });*/

        iceCreamPanel.add(iceCreamCup);
        iceCreamPanel.add(iceCreamCone);
        iceCreamPanel.add(blank);


        JCheckBox sprinkles = new JCheckBox("Sprinkles");
        sprinkles.setFont(new Font("Broadway", Font.BOLD, 10));
        sprinkles.setBackground(new Color(111, 78, 55));
        sprinkles.setForeground(new Color(255, 182, 193));
        JCheckBox chocolateSauce = new JCheckBox("Chocolate Sauce");
        chocolateSauce.setBackground(new Color(111, 78, 55));
        chocolateSauce.setForeground(new Color(255, 182, 193));
        chocolateSauce.setFont(new Font("Broadway", Font.BOLD, 10));
        //sprinkles.addActionListener(e -> log("Sprinkles added to ice cream" + sprinkles.isSelected()));

        /*sprinkles.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (sprinkles.isSelected()) {
                    log("Sprinkles added to ice cream.");
                } else {
                    log("Sprinkles removed from ice cream.");
                }
            }
        });
        //chocolateSauce.addActionListener(e -> log("Chocolate Sauce added to ice cream" + chocolateSauce.isSelected()));
        chocolateSauce.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (chocolateSauce.isSelected()) {
                    log("Chocolate Sauce added to ice cream.");
                } else {
                    log("Chocolate Sauce removed from ice cream.");
                }
            }
        });*/
        JPanel blank2 =new JPanel();
        blank2.setBackground(new Color(111, 78, 55));

        iceCreamPanel.add(sprinkles);
        iceCreamPanel.add(chocolateSauce);
        iceCreamPanel.add(blank2);
        main.add(iceCreamPanel, gbc);





        gbc.gridy = 1;
        gbc.gridx = 2;
        JButton addIceCreamBtn = new JButton("Add Ice Cream");
        addIceCreamBtn.setForeground(new Color(111, 78, 55));
        addIceCreamBtn.setFont(new Font("Broadway", Font.BOLD, 10));
        addIceCreamBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Menu iceCreamChosen = null;
                if (vanillaIceCreamCheckBox.isSelected()){
                    iceCreamChosen = menuFactory.createVanillaIceCream();

                }
                if (chocolateIceCreamCheckBox.isSelected()){
                    iceCreamChosen = menuFactory.createChocolateIceCream();
                }
                if (cookiesNCreamIceCreamCheckBox.isSelected()){
                    iceCreamChosen = menuFactory.createCookiesNCreamIceCream();
                }

                if(iceCreamChosen == null){
                    log("please choose a flavor");
                } else{
                    log(iceCreamChosen.getDescription());
                    Menu fullOrder= iceCreamChosen;
                    if(sprinkles.isSelected()){
                        log("Sprinkles added to ice cream.");
                        //fullOrder = new SprinklesDecoratorIceCream((IceCream) fullOrder);
                        commandInvoker.executeDecoratorCommand(addSprinkles, fullOrder);
                        fullOrder = commandInvoker.getMenuItem();
                    }
                    if(chocolateSauce.isSelected()){
                        log("Chocolate Sauce added to ice cream.");
                        //fullOrder = new ChocolateSauceDecoratorIceCream((IceCream) fullOrder);
                        commandInvoker.executeDecoratorCommand(addChocolateSauce, fullOrder);
                        fullOrder = commandInvoker.getMenuItem();
                    }

                    if(iceCreamCone.isSelected()){
                        log(icecream.cone());
                    }
                    if(iceCreamCup.isSelected()){
                        log(icecream.cup());
                    }
                    commandInvoker.executeOrderUpdate(addMenuItem, fullOrder, orderList);
                    System.out.println(fullOrder.getDescription());
                    orderList = commandInvoker.getOrderList();
                    System.out.println(orderList.size());
                    //orderList.add(fullOrder);
                }

            }
        });
        //iceCreamPanel.add(addIceCreamBtn);
        main.add(addIceCreamBtn,gbc);






        // Option Dialog
        gbc.gridy = 3;
        gbc.gridx = 0;
        JLabel cookieLabel = new JLabel("Cookie :");
        cookieLabel.setFont(new Font("Broadway", Font.BOLD, 15));
        cookieLabel.setForeground(new Color(255, 182, 193));
        main.add(cookieLabel, gbc);
        gbc.gridy = 3;
        gbc.gridx = 1;
        JButton Cookie = new JButton("Cookie ");
        Cookie.setForeground(new Color(111, 78, 55));
        Cookie.setFont(new Font("Broadway", Font.BOLD, 10));
        Cookie.addActionListener(e -> {
            Object[] options = {"Large", "Small"};
            int choice = JOptionPane.showOptionDialog(this, "Choose a size:", "Available Sizes",
                    JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
            if (choice >= 0) {
                AbstractFactory.Menu cookie = null;
                if (options[choice].equals("Large")) {
                    cookie = menuFactory.createLargeCookie();

                } else if (options[choice].equals("Small")) {
                    cookie = menuFactory.createCookie();
                }
                log(cookie.getDescription());
                commandInvoker.executeOrderUpdate(addMenuItem,cookie,orderList);
                orderList = commandInvoker.getOrderList();
                //orderList.add(cookie);

            }
        });
        main.add(Cookie, gbc);

        // Option Dialog
        gbc.gridy = 4;
        gbc.gridx = 0;
        JLabel CakeLabel = new JLabel("Cake :");
        CakeLabel.setFont(new Font("Broadway", Font.BOLD, 15));
        CakeLabel.setForeground(new Color(255, 182, 193));
        main.add(CakeLabel, gbc);
        gbc.gridx = 1;
        gbc.gridy = 4;
        JButton Cake = new JButton("Cake ");
        Cake.setForeground(new Color(111, 78, 55));
        Cake.setFont(new Font("Broadway", Font.BOLD, 10));
        Cake.addActionListener(e -> {
            Object[] options = {"Lava Cake $6", "Red Velvet Cake $7"};
            int choice = JOptionPane.showOptionDialog(this, "Choose a flavor:", "Available Flavors",
                    JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
            if (choice >= 0) {
                AbstractFactory.Menu cake = null;
                if (options[choice].equals("Lava Cake $6")) {
                    cake = menuFactory.createLavaCake();

                } else if (options[choice].equals("Red Velvet Cake $7")) {
                    cake = menuFactory.createRedVelvetCake();
                }
                log(cake.getDescription());
                //orderList.add(cake);
                commandInvoker.executeOrderUpdate(addMenuItem, cake, orderList);
                orderList = commandInvoker.getOrderList();
            }
        });
        main.add(Cake, gbc);

        // Option Dialog
        gbc.gridy = 5;
        gbc.gridx = 0;
        JLabel IceCreamPintLabel = new JLabel("Ice Cream Pints :");
        IceCreamPintLabel.setFont(new Font("Broadway", Font.BOLD, 15));
        IceCreamPintLabel.setForeground(new Color(255, 182, 193));
        main.add(IceCreamPintLabel, gbc);
        gbc.gridx = 1;
        gbc.gridy = 5;
        JButton pint = new JButton("Ice Cream Pints ");
        pint.setForeground(new Color(111, 78, 55));
        pint.setFont(new Font("Broadway", Font.BOLD, 10));
        pint.addActionListener(e -> {
            Object[] options = {"Vanilla Ice Cream Pint $7", "Chocolate Ice Cream Pint $7", "Cookies N' Cream Ice Cream Pint $8"};
            int choice = JOptionPane.showOptionDialog(this, "Choose a flavor:", "Available Flavors",
                    JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
            if (choice >= 0) {
                AbstractFactory.Menu pints = null;
                if (options[choice].equals("Vanilla Ice Cream Pint $7")) {
                    pints = menuFactory.createVanillaIceCreamPint();
                } else if (options[choice].equals("Chocolate Ice Cream Pint $7")) {
                    pints = menuFactory.createChocolateIceCreamPInt();
                } else if (options[choice].equals("Cookies N' Cream Ice Cream Pint $8")) {
                    pints = menuFactory.createCookiesNCreamIceCreamPint();
                }
                log(pints.getDescription());
                //orderList.add(pints);
                commandInvoker.executeOrderUpdate(addMenuItem, pints, orderList);
                orderList = commandInvoker.getOrderList();
            }
        });
        main.add(pint, gbc);

        // Option Dialog
        gbc.gridy = 6;
        gbc.gridx = 0;
        JLabel DrinksLabel = new JLabel("Drinks :");
        DrinksLabel.setFont(new Font("Broadway", Font.BOLD, 15));
        DrinksLabel.setForeground(new Color(255, 182, 193));
        main.add(DrinksLabel, gbc);
        gbc.gridx = 1;
        gbc.gridy = 6;
        JButton Drinks = new JButton("Drinks Dialog ");
        Drinks.setForeground(new Color(111, 78, 55));
        Drinks.setFont(new Font("Broadway", Font.BOLD, 10));
        Drinks.addActionListener(e -> {
            Object[] options = {"Vanilla Shake", "Strawberry-Banana", "Chocolate Shake"};
            int choice = JOptionPane.showOptionDialog(this, "Choose a flavor:", "Flavors",
                    JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
            if (choice >= 0) {
                AbstractFactory.Menu orderedDrinks = null;
                if (options[choice].equals("Vanilla Shake")) {
                    orderedDrinks = menuFactory.createDrink();

                } else if (options[choice].equals("Strawberry-Banana")) {
                    orderedDrinks = menuFactory.createStrawberryBananaShake();

                } else if (options[choice].equals("Chocolate Shake")) {
                    orderedDrinks = menuFactory.createChocolateShake();

                }
                log(orderedDrinks.getDescription());
                //orderList.add(orderedDrinks);
                commandInvoker.executeOrderUpdate(addMenuItem, orderedDrinks, orderList);
                orderList = commandInvoker.getOrderList();
            }
        });
        main.add(Drinks, gbc);

        // Confirm Dialog
        gbc.gridy = 9;
        gbc.gridx = 1;

        JButton confirmButton = new JButton("Confirm Order");
        confirmButton.setForeground(new Color(111, 78, 55));
        confirmButton.setFont(new Font("Broadway", Font.BOLD, 18));
        confirmButton.addActionListener(e -> {
            //se
            int result = JOptionPane.showConfirmDialog(this, "Do you want to place your order?",
                    "Confirm", JOptionPane.YES_NO_CANCEL_OPTION);
            if (result == JOptionPane.YES_OPTION) {
                System.out.println(orderList.size());
                if (orderList.size() <= 0) {

                    log("No Order found");
                } else {
                    order.orderStatus("Order Placed for " + textField.getText());
                    simulateProgress();
                    double total = 0;
                    for (AbstractFactory.Menu orderedfood : orderList) {
                        total += orderedfood.getPrice();
                    }

                    log("Total price: $" + total);
                }
            } else if (result == JOptionPane.NO_OPTION) {
                if (orderList.size() <= 0) {
                    log("No Order found");
                } else {
                    order.orderStatus("Order Cancelled");
                    orderList.clear();
                    simulateProgress();
                    this.dispose();
                }
            }
        });
        main.add(confirmButton, gbc);

        gbc.gridy = 9;
        gbc.gridx = 2;

        JButton backToMenuButton = new JButton("Back to Homepage");
        backToMenuButton.setForeground(new Color(111, 78, 55));
        backToMenuButton.setFont(new Font("Broadway", Font.BOLD, 18));
        backToMenuButton.addActionListener(e -> {
            this.dispose();
        });
        main.add(backToMenuButton, gbc);

        //Output box
        gbc.gridy = 8;
        gbc.gridx = 0;
        gbc.gridwidth = 3;
        gbc.gridheight = 1;// output spans full row
        gbc.weightx = 1;
        gbc.weighty = 1;
        gbc.fill = GridBagConstraints.BOTH;
        outputArea = new JTextArea(5, 50);
        outputArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(outputArea);
        outputArea.setFont(new Font("Broadway", Font.BOLD, 15));
        outputArea.setForeground(new Color(111, 78, 55));
        outputArea.setBackground(new Color(255, 182, 193));
        main.add(scrollPane, gbc);

    }

    public void getReceipt() {
        ImagesFrame getPictures = new ImagesFrame((ArrayList<Menu>) orderList);

    }


    void simulateProgress() {
        java.util.List<Integer> count = new ArrayList<>();
        count.add(4000);
        Timer timer = new Timer(50, null);

        timer.addActionListener(e -> {
            count.set(0, count.get(0) - 50);
            if (count.get(0) <= 0) {
                timer.stop();
                order.orderStatus("Order ready for Pickup!");
                getReceipt();
            }

        });
        timer.start();
    }

    void log(String message) {
        outputArea.append(message + "\n");
        outputArea.setCaretPosition(outputArea.getDocument().getLength());
    }
}