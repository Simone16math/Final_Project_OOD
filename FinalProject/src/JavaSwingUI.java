import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class JavaSwingUI extends JFrame implements Observer{
    private JTextArea outputArea;
    private JPanel parent;
    private int startTime = -1;
    Customer order = new Customer();
    private java.util.List<Menu>  orderList = new ArrayList();


    @Override
    public void update(String Order) {
        log("---Order Update---");
        log(Order);
    }
    public JavaSwingUI() {
        setTitle("Café");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800, 800);
        setLocationRelativeTo(null);

        Customer order= new Customer();
        order.registerObserver(this); //register user as customer


        // Layout
        setLayout(new GridLayout(3, 2, 10, 10));

        // Input Dialog
        JButton inputButton = new JButton("Customer Name");
        inputButton.addActionListener(e -> {
            String input = JOptionPane.showInputDialog(parent, "Enter your name:");
            if (input != null) log("Customer: " + input);
            order.setName(input);

            order.notifyObservers("New Customer registered: "+ input);
            log("Customer: " + order.getName());
            log("----Order----");
        });
        add(inputButton);

        // Option Dialog
        JButton iceCream = new JButton("IceCream");
        MenuAbstractFactory menuFactory = new BasicMenuFactory();
        iceCream.addActionListener(e -> {
            // add factory ice cream
            Menu iceCream1 = menuFactory.createIceCream();
            String[] options = {"Sprinkles", "Chocolate sauce", "plain"};
            int choice = JOptionPane.showOptionDialog(parent, "Choose a topping:", "Toppings",JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
            if (choice >= 0) {
                Menu orderedIceCream = iceCream1;

                if(options[choice].equals("Sprinkles")) {
                    orderedIceCream = new SprinklesDecoratorIceCream((IceCream) orderedIceCream);
                    log(orderedIceCream.getDescription());
                }else if(options[choice].equals("Chocolate sauce")) {
                    orderedIceCream = new ChocolateSauceDecoratorIceCream((IceCream) orderedIceCream);
                    log(orderedIceCream.getDescription());
                } else if(options[choice].equals("plain")) {
                    orderedIceCream = new BasicIceCream();
                    log(orderedIceCream.getDescription());
                }

                log("Topping selected: " + options[choice]);
                orderList.add(orderedIceCream);}
        });
        add(iceCream);

        // Option Dialog
        JButton Cookie = new JButton("Cookie");
        Cookie.addActionListener(e -> {
            Menu cookie = menuFactory.createCookie();
            Object[] options = {"Large", "Small"};
            int choice = JOptionPane.showOptionDialog(parent, "Choose a size:", "Available Sizes",
                    JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
            if (choice >= 0) {
                Menu orderedCookie = cookie;
                if(options[choice].equals("Large")) {
                    orderedCookie = new Cookie();
                    log(orderedCookie.getDescription());
                } else if(options[choice].equals("Small")) {
                    orderedCookie = new Cookie();
                    log(orderedCookie.getDescription());
                }
                log("Size selected: " + options[choice]);
                orderList.add(orderedCookie);
            }

        });
        add(Cookie);
        // Option Dialog
        JButton Drinks = new JButton("Drinks Dialog");
        Drinks.addActionListener(e -> {
            Menu drinks = menuFactory.createDrink();
            Object[] options = {"Vanilla Shake", "Strawberry-Banana Smoothie", "Chocolate Shake"};
            int choice = JOptionPane.showOptionDialog(parent, "Choose a flavor:", "Flavors",
                    JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
            if (choice >= 0){
                Menu orderedDrinks = drinks;
                if(options[choice].equals("Vanilla Shake")) {
                    orderedDrinks = new Drinks();
                    log(orderedDrinks.getDescription());
                }else if(options[choice].equals("Strawberry-Banana")) {
                    orderedDrinks = new Drinks();
                    log(orderedDrinks.getDescription());
                }else if(options[choice].equals("Chocolate Shake")) {
                    orderedDrinks = new Drinks();
                    log(orderedDrinks.getDescription());
                }
                log("Flavor selected: " + options[choice]);
                orderList.add(orderedDrinks);
            }
        });
        add(Drinks);

        // Confirm Dialog
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
                }
        });
        add(confirmButton);


        //Output box
        outputArea = new JTextArea(5,50);
        outputArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(outputArea);
        add(scrollPane);


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

