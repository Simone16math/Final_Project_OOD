
import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class CafeMenuUI extends JFrame implements Observer {
    private JTextArea outputArea;
    private JPanel parent;
    private int startTime = -1;
    Customer order = new Customer();
    private java.util.List<Menu> orderList = new ArrayList();
    BasicIceCream basicIceCream = new BasicIceCream();
    Cookie basicCookie = new Cookie();
    Drinks drinks = new Drinks();
    MenuAbstractFactory menuFactory = new BasicMenuFactory();
    CookiesNCreamIceCream cookiesNCreamIceCream = new CookiesNCreamIceCream();

    @Override
    public void update(String Order) {
        log("---Order Update---");
        log(Order);
    }

    public CafeMenuUI() {
        setTitle("Café");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800, 800);
        setLocationRelativeTo(null);


        this.order.registerObserver(this); //register user as customer


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
        //JTextField is String, JPasswordField is char[], JTextArea is String, JFormattedTextField for Date is Object
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
        JCheckBox plain = new JCheckBox("plain");
        sprinkles.addActionListener(e -> log("Sprinkles " + sprinkles.isSelected()));
        chocolateSauce.addActionListener(e -> log("Chocolate Sauce " + chocolateSauce.isSelected()));
        plain.addActionListener(e -> log("Plain Ice Cream " + plain.isSelected()));
        iceCream.add(sprinkles);
        iceCream.add(chocolateSauce);
        iceCream.add(plain);
        JButton addIceCreamBtn = new JButton("Add Ice Cream" + "+ $" + basicIceCream.getPrice());

        addIceCreamBtn.addActionListener(e -> {
            Menu flavor = null;
            Object[] flavors = {"Chocolate", "Vanilla", "Cookies N' Cream + $0.50" };
            int choice = JOptionPane.showOptionDialog(parent, "Choose Flavor:", "Available flavors",
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
            Object[] options = {"Scoop", "Cup"};
            int choice1 = JOptionPane.showOptionDialog(parent, "Choose:", "Available options",
                    JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
            if (choice1 >= 0) {
                if(options[choice1].equals("Scoop")){
                    log("in a Scoop");
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
        Menu orderedIceCream = iceCream1;
        if (sprinkles.isSelected()) {
            orderedIceCream = new SprinklesDecoratorIceCream((IceCream) orderedIceCream);

        }
        if (chocolateSauce.isSelected()) {
            orderedIceCream = new ChocolateSauceDecoratorIceCream((IceCream) orderedIceCream);

        }
        if (plain.isSelected()) {
            orderedIceCream = new BasicIceCream();

        }
        log(orderedIceCream.getDescription());
        orderList.add(orderedIceCream);

    });
        add(iceCream,gbc);

        // Option Dialog
        gbc.gridy = 3;
        gbc.gridx = 0;
        JButton Cookie = new JButton("Cookie " + "$" +  basicCookie.getPrice());
        Cookie.addActionListener(e -> {
            Object[] options = {"Large", "Small"};
            int choice = JOptionPane.showOptionDialog(parent, "Choose a size:", "Available Sizes",
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
        JButton Drinks = new JButton("Drinks Dialog " + "$" +   drinks.getPrice());
        Drinks.addActionListener(e -> {
            Object[] options = {"Vanilla Shake", "Strawberry-Banana", "Chocolate Shake"};
            int choice = JOptionPane.showOptionDialog(parent, "Choose a flavor:", "Flavors",
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
        gbc.gridy = 5;
        gbc.gridx = 0;
        JButton confirmButton = new JButton("Confirm Order");
        confirmButton.addActionListener(e -> {
            int result = JOptionPane.showConfirmDialog(parent, "Do you want to place your order?",
                    "Confirm", JOptionPane.YES_NO_CANCEL_OPTION);
            log("Confirm order: " + result);
            if (result == JOptionPane.YES_OPTION) {
                order.orderStatus("Order Placed");
                simulateProgress();
                double total= 0;
                for (Menu orderedfood: orderList) {
                    total += orderedfood.getPrice();
                }
                log("Total price: " + total);
            }else if (result == JOptionPane.NO_OPTION){
                order.orderStatus("Order Cancelled");
                for (Menu orderedfood: orderList) {
                    orderList.remove(orderedfood);

                }
                order.removeObserver(this);
                log("Please type in your Name again.");
            }
        });
        add(confirmButton,gbc);


        //Output box
        gbc.gridy = 6;
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
}
