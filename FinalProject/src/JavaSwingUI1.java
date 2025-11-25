import javax.swing.*;
import java.awt.*;

public class JavaSwingUI1 extends JFrame{
    private JTextArea outputArea;
    private JPanel parent;

    public JavaSwingUI1() {
        setTitle("Café");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800, 800);
        setLocationRelativeTo(null);


        // Main panel with tabs
        /*JTabbedPane tabbedPane = new JTabbedPane();
        tabbedPane.addTab("Café", new JavaSwingUI(this));*/


        // Layout
        setLayout(new GridLayout(5, 2, 10, 10));

        // Input Dialog
        JButton inputButton = new JButton("Input Dialog");
        inputButton.addActionListener(e -> {
            String input = JOptionPane.showInputDialog( "Enter your name:");
            if (input != null) log("Input: " + input);
        });
        add(inputButton);

        // Option Dialog
        JButton iceCream = new JButton("IceCream");
        iceCream.addActionListener(e -> {
            Object[] options = {"Sprinkles", "Chocolate Sauce", "Plain"};
            int choice = JOptionPane.showOptionDialog(parent, "Choose a topping:", "Toppings",
                    JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
            if (choice >= 0) log("Option selected: " + options[choice]);
        });
        add(iceCream);

        // Option Dialog
        JButton Cookie = new JButton("Cookie");
        Cookie.addActionListener(e -> {
            Object[] options = {"Large", "Small"};
            int choice = JOptionPane.showOptionDialog(parent, "Choose a size:", "Options",
                    JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
            if (choice >= 0) log("Option selected: " + options[choice]);
        });
        add(Cookie);

        // Option Dialog
        JButton Drinks = new JButton("Drinks Dialog");
        Drinks.addActionListener(e -> {
            Object[] options = {"Vanilla Shake", "Strawberry-Banana Smoothie", "Chocolate Shake"};
            int choice = JOptionPane.showOptionDialog(parent, "Choose an option:", "Options",
                    JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
            if (choice >= 0) log("Option selected: " + options[choice]);
        });
        add(Drinks);

        // Confirm Dialog
        JButton confirmButton = new JButton("Confirm Dialog");
        confirmButton.addActionListener(e -> {
            int result = JOptionPane.showConfirmDialog(parent, "Do you want to continue?",
                    "Confirm", JOptionPane.YES_NO_CANCEL_OPTION);
            log("Confirm result: " + result);
        });
        add(confirmButton);


        //Output box
        outputArea = new JTextArea(5,50);
        outputArea.setEditable(false);
        add(outputArea, BorderLayout.SOUTH);

        //Menu


        //add(new JScrollPane(outputArea), BorderLayout.CENTER);

    }

    public void log(String message) {
        outputArea.append(message + "\n");
        outputArea.setCaretPosition(outputArea.getDocument().getLength());
    }


}

