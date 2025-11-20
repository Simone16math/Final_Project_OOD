
import javax.swing.*;
import java.awt.*;

/*public class CafeMenuUI extends JPanel{
    private JavaSwingUI parent;
    // Input Dialog
    JButton inputButton = new JButton("Input Dialog");
        inputButton.addActionListener(e -> {
        String input = JOptionPane.showInputDialog(parent, "Enter your name:");
        if (input != null) parent.log("Input: " + input);
    });

    // Option Dialog
    JButton iceCream = new JButton("IceCream");
        iceCream.addActionListener(e -> {
        Object[] options = {"Sprinkles", "Chocolate sauce", "plain"};
        int choice = JOptionPane.showOptionDialog(parent, "Choose a topping:", "Toppings",
                JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
        if (choice >= 0) parent.log("Option selected: " + options[choice]);
    });
    // Option Dialog
    JButton Cookie = new JButton("Cookie");
        Cookie.addActionListener(e -> {
        Object[] options = {"Large", "Small"};
        int choice = JOptionPane.showOptionDialog(parent, "Choose a size:", "Options",
                JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
        if (choice >= 0) parent.log("Option selected: " + options[choice]);
    });
    // Option Dialog
    JButton Drinks = new JButton("Drinks Dialog");
        Drinks.addActionListener(e -> {
        Object[] options = {"Vanilla Shake", "Strawberry-Banana Smoothie", "Chocolate Shake"};
        int choice = JOptionPane.showOptionDialog(parent, "Choose an option:", "Options",
                JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
        if (choice >= 0) parent.log("Option selected: " + options[choice]);
    });

    // Confirm Dialog
    JButton confirmButton = new JButton("Confirm Dialog");
        confirmButton.addActionListener(e -> {
        int result = JOptionPane.showConfirmDialog(parent, "Do you want to continue?",
                "Confirm", JOptionPane.YES_NO_CANCEL_OPTION);
        parent.log("Confirm result: " + result);
    });
}
*/