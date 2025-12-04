import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class TestUI extends JFrame implements Observer{
    private JTextArea outputArea;
    private JPanel parent;
    Order order = new Order();
    private java.util.List<Menu> orderList = new ArrayList();
    BasicIceCream basicIceCream = new BasicIceCream();
    Cookie basicCookie = new Cookie();
    Drinks drinks = new Drinks();
    MenuAbstractFactory menuFactory = new BasicMenuFactory();

    @Override
    public void update(String Order) {
        log("---Order Update---");
        log(Order);
    }

    public TestUI() {
        setTitle("Café");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800, 800);
        setLocationRelativeTo(null);







        order.registerObserver(this); //register user as customer


        setLayout(new GridBagLayout());
        // Creates a GridBagConstraints object to define layout rules
        // (like position, spacing, alignment, and fill behavior) for components
        // in a GridBagLayout
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5);
        gbc.anchor = GridBagConstraints.WEST;
        gbc.fill = GridBagConstraints.HORIZONTAL;

        gbc.gridx = 0;
        gbc.gridy = 0;
        add(new JLabel("Customer:"), gbc);
        JTextField textField = new JTextField(20);
        // Add action listener to log text field input when Enter is pressed
        textField.addActionListener(e -> log("Customer" + textField.getText()));
        gbc.gridx = 1;
        add(textField, gbc);

        // submit button
        gbc.gridx = 2;
        JButton submitButton = new JButton("Submit");
        // Action listener to log all input values when the button is clicked
        submitButton.addActionListener(e -> {
            String text = textField.getText();
            log("Customer: " + text);
        });

        //Add this button to the panel, and use these layout constraints (gbc) to decide where and how to place it.”
        add(submitButton, gbc);

        // Option Dialog
        gbc.gridy = 1;
        gbc.gridx = 0;
        add(new JLabel(" IceCream:"), gbc);
        gbc.gridx = 1;
        gbc.gridy = 2;
        JPanel iceCream = new JPanel(new FlowLayout(FlowLayout.LEFT));
        JCheckBox sprinkles = new JCheckBox("Sprinkles + $0.25");
        JCheckBox chocolateSauce = new JCheckBox("Chocolate sauce + $0.50");
        //sprinkles.addActionListener(e -> log("Sprinkles added to ice cream" + sprinkles.isSelected()));
        sprinkles.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (sprinkles.isSelected()){
                    log("Sprinkles added to ice cream");
                } else{
                    log("Sprinkles removed from ice cream");
                }
            }
        });
        //chocolateSauce.addActionListener(e -> log("Chocolate Sauce added to ice cream" + chocolateSauce.isSelected()));
        chocolateSauce.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (chocolateSauce.isSelected()){
                    log("Chocolate Sauce added to ice cream");
                } else{
                    log("Chocolate Sauce removed from ice cream");
                }
            }
        });

        iceCream.add(sprinkles);
        iceCream.add(chocolateSauce);
        JButton addIceCreamBtn = new JButton("Add Ice Cream" + "+ $" + basicIceCream.getPrice());

        addIceCreamBtn.addActionListener(e -> {
            Menu flavor = null;
            Object[] flavors = {"Chocolate", "Vanilla", "Cookies N' Cream + $0.50" };
            int choice = JOptionPane.showOptionDialog(this, "Choose Flavor:", "Available flavors",
                    JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, flavors, flavors[0]);
            if (choice >= 0) {
                if(flavors[choice].equals("Vanilla")) {
                    flavor = menuFactory.createVanillaIceCream();

                } else if(flavors[choice].equals("Chocolate")) {
                    flavor = menuFactory.createChocolateIceCream();

                }else if(flavors[choice].equals("Cookies N' Cream + $0.50")) {
                    flavor = menuFactory.createCookiesNCreamIceCream();

                }
            }
            log(flavor.getDescription());
            orderList.add(flavor);
            Object[] options = {"Cone", "Cup"};
            int choice1 = JOptionPane.showOptionDialog(this, "Choose:", "Available options",
                    JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
            if (choice1 >= 0) {
                if(options[choice1].equals("Cone")){
                    log("in a Cone");
                }   if(options[choice1].equals("Cup")){
                    log("in a Cup");}
            }
        });
        add(addIceCreamBtn, gbc);

        // Action listener for adding ice cream to cart
        gbc.gridy = 1;
        gbc.gridx = 1;
        addIceCreamBtn.addActionListener(e -> {
            Menu iceCream1 = menuFactory.createIceCream();
            IceCream iceCream34 = new BasicIceCream();
            boolean stateSprinkles = false;
            boolean stateChocolateSauce = false;

            // Commands
            CommandInvoker commandInvoker = new CommandInvoker();
            Command addSprinkles = new AddSprinklesCommand(iceCream34);
            Command removeSprinkles = new RemoveSprinklesCommand(iceCream34);
            Command addChocolateSauce = new AddChocolateSauceCommand(iceCream34);
            Command removeChocolateSauce = new RemoveChocolateSauceCommand(iceCream34);
            commandInvoker.addCommand(addSprinkles);
            commandInvoker.addCommand(removeSprinkles);
            commandInvoker.addCommand(addChocolateSauce);
            commandInvoker.addCommand(removeChocolateSauce);

            Menu orderedIceCream = iceCream1;
            if (sprinkles.isSelected()) {
                orderedIceCream = new SprinklesDecoratorIceCream((IceCream) orderedIceCream);
                commandInvoker.executeCommand(addSprinkles,iceCream34);
                iceCream34 = (IceCream) commandInvoker.getMenuItem();
                stateSprinkles = true;
            } else{
                if (stateSprinkles){
                    commandInvoker.executeCommand(removeSprinkles,iceCream34);
                    iceCream34 = (IceCream) commandInvoker.getMenuItem();
                    stateSprinkles = false;
                }
            }
            if (chocolateSauce.isSelected()) {
                orderedIceCream = new ChocolateSauceDecoratorIceCream((IceCream) orderedIceCream);
                commandInvoker.executeCommand(addChocolateSauce,iceCream34);
                iceCream34 = (IceCream) commandInvoker.getMenuItem();
                stateChocolateSauce = true;
            } else{
                if (stateChocolateSauce){
                    commandInvoker.executeCommand(removeChocolateSauce,iceCream34);
                    iceCream34 = (IceCream) commandInvoker.getMenuItem();
                    stateChocolateSauce = false;
                }
            }
            //log(orderedIceCream.getDescription());
            log(iceCream34.getDescription());
            //orderList.add(orderedIceCream);
            orderList.add(iceCream34);

        });
        add(iceCream,gbc);

        // Option Dialog
        gbc.gridy = 3;
        gbc.gridx = 0;
        JButton Cookie = new JButton("Cookie " + "$" +  basicCookie.getPrice());
        Cookie.addActionListener(e -> {
            Object[] options = {"Large", "Small"};
            int choice = JOptionPane.showOptionDialog(this, "Choose a size:", "Available Sizes",
                    JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
            if (choice >= 0) {
                Menu cookie = null;
                if(options[choice].equals("Large")) {
                    cookie = menuFactory.createLargeCookie();

                } else if(options[choice].equals("Small")) {
                    cookie = menuFactory.createCookie();
                }
                log(cookie.getDescription());
                orderList.add(cookie);
            }
        });
        add(Cookie,gbc);

        // Option Dialog
        gbc.gridy = 4;
        gbc.gridx = 0;
        JButton Cake = new JButton("Cake ");
        Cake.addActionListener(e -> {
            Object[] options = {"Lava Cake $6", "Red Velvet Cake $7"};
            int choice = JOptionPane.showOptionDialog(this, "Choose a flavor:", "Available Flavors",
                    JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
            if (choice >= 0) {
                Menu cake = null;
                if(options[choice].equals("Lava Cake $6")) {
                    cake = menuFactory.createLavaCake();

                } else if(options[choice].equals("Red Velvet Cake $7")) {
                    cake = menuFactory.createRedVelvetCake();
                }
                log(cake.getDescription());
                orderList.add(cake);
            }
        });
        add(Cake,gbc);

        // Option Dialog
        gbc.gridy = 5;
        gbc.gridx = 0;
        JButton pint = new JButton("Ice Cream Pints ");
        pint.addActionListener(e -> {
            Object[] options = {"Vanilla Ice Cream Pint $10", "Chocolate Ice Cream Pint $10", "Cookies N' Cream Ice Cream Pint $11"};
            int choice = JOptionPane.showOptionDialog(this, "Choose a flavor:", "Available Flavors",
                    JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
            if (choice >= 0) {
                Menu pints = null;
                if(options[choice].equals("Vanilla Ice Cream Pint $5")) {
                    pints = menuFactory.createVanillaIceCreamPint();
                } else if(options[choice].equals("Chocolate Ice Cream Pint $5")) {
                    pints = menuFactory.createChocolateIceCreamPInt();
                } else if(options[choice].equals("Cookies N' Cream Ice Cream Pint $6")) {
                    pints = menuFactory.createCookiesNCreamIceCreamPint();
                }
                log(pints.getDescription());
                orderList.add(pints);
            }
        });
        add(pint,gbc);

        // Option Dialog
        gbc.gridy = 6;
        gbc.gridx = 0;
        JButton Drinks = new JButton("Drinks Dialog " + "$" +   drinks.getPrice());
        Drinks.addActionListener(e -> {
            Object[] options = {"Vanilla Shake", "Strawberry-Banana", "Chocolate Shake"};
            int choice = JOptionPane.showOptionDialog(this, "Choose a flavor:", "Flavors",
                    JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
            if (choice >= 0){
                Menu orderedDrinks = null;
                if(options[choice].equals("Vanilla Shake")) {
                    orderedDrinks = menuFactory.createDrink();

                }else if(options[choice].equals("Strawberry-Banana")) {
                    orderedDrinks = menuFactory.createStrawberryBananaShake();

                }else if(options[choice].equals("Chocolate Shake")) {
                    orderedDrinks = menuFactory.createChocolateShake();

                }
                log(orderedDrinks.getDescription());
                orderList.add(orderedDrinks);
            }
        });
        add(Drinks,gbc);

        // Confirm Dialog
        gbc.gridy = 7;
        gbc.gridx = 0;
        JButton confirmButton = new JButton("Confirm Order");
        confirmButton.addActionListener(e -> {
            //se
            int result = JOptionPane.showConfirmDialog(this, "Do you want to place your order?",
                    "Confirm", JOptionPane.YES_NO_CANCEL_OPTION);
            if (result == JOptionPane.YES_OPTION) {
                order.orderStatus("Order Placed for " + textField.getText());
                simulateProgress();
                double total= 0;
                for (Menu orderedfood: orderList) {
                    total += orderedfood.getPrice();
                }

                log("Total price: $" + total);
            }else if (result == JOptionPane.NO_OPTION){
                order.orderStatus("Order Cancelled");
                orderList.clear();
                log("Please type in your Name again.");
            }
        });
        add(confirmButton,gbc);

        //Output box
        gbc.gridy = 8;
        gbc.gridx = 0;
        gbc.gridwidth = 3;             // output spans full row
        gbc.weightx = 1;
        gbc.weighty = 1;
        gbc.fill = GridBagConstraints.BOTH;
        outputArea = new JTextArea(5,50);
        outputArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(outputArea);
        add(scrollPane,gbc);



    }

    private void getReceipt(){
        JFrame receipt = new JFrame();
        receipt.setTitle("Receipt");
        receipt.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        receipt.setSize(800, 800);
        receipt.setLocationRelativeTo(null);

        receipt.setLayout(new GridBagLayout());
        GridBagConstraints gbc1 = new GridBagConstraints();
        gbc1.insets = new Insets(5, 5, 5, 5);
        gbc1.anchor = GridBagConstraints.WEST;
        gbc1.fill = GridBagConstraints.HORIZONTAL;



        ImageIcon smoothie = new ImageIcon("testing.jpeg");
        JLabel smothie = new JLabel(smoothie);
        receipt.add(smothie);
        receipt.setVisible(true);

    }


    private void simulateProgress() {
        java.util.List<Integer> count = new ArrayList<>();
        count.add(4000);
        Timer timer = new Timer(50, null);

        timer.addActionListener(e -> {
            count.set(0,count.get(0)-50);
            if (count.get(0)<=0) {
                timer.stop();
                order.orderStatus("Order ready for Pickup!");
            }
        });
        timer.start();
    }

    public void log(String message) {
        outputArea.append(message + "\n");
        outputArea.setCaretPosition(outputArea.getDocument().getLength());
    }


    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            try {
                UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            } catch (Exception e) {
                e.printStackTrace();
            }
            TestUI cafeMenuUI = new TestUI();
            cafeMenuUI.setVisible(true);
            //JavaSwingUI cafe = new JavaSwingUI();
            //cafe.setVisible(true);

        });
    }
}
