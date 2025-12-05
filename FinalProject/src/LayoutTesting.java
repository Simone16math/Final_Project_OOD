import javax.swing.*;
import java.awt.*;

public class LayoutTesting extends JFrame {

    public LayoutTesting() {
        setTitle("Grid Layout Buttons");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300);

        // Create a JPanel to hold the buttons
        JPanel buttonPanel = new JPanel();

        // Create a GridLayout with 2 rows and 3 columns, and some gaps
        GridLayout gridLayout = new GridLayout(2, 3, 10, 10);
        buttonPanel.setLayout(gridLayout);

        // Add buttons to the panel
        for (int i = 1; i <= 6; i++) {
            buttonPanel.add(new JButton("Button " + i));
        }

        add(buttonPanel); // Add the panel to the frame
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(LayoutTesting::new);
    }
}
