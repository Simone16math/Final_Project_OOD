import javax.swing.*;
import java.awt.*;

public class JavaSwingUI extends JFrame{
    private JTextArea outputArea;

    public JavaSwingUI() {
        setTitle("Café");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800, 800);
        setLocationRelativeTo(null);


        // Main panel with tabs
        /*JTabbedPane tabbedPane = new JTabbedPane();
        tabbedPane.addTab("Café", new JavaSwingUI(this));*/


        // Layout
        //setLayout(new BorderLayout());
        //add(tabbedPane, BorderLayout.CENTER);

        setLayout(new GridLayout(5, 2, 10, 10));

        //Output box
        outputArea = new JTextArea(5,50);
        outputArea.setEditable(false);
        add(outputArea, BorderLayout.SOUTH);

        //Menu
        //add(new JScrollPane(outputArea), BorderLayout.CENTER);


        // Input Dialog

        JButton inputButton = new JButton("InoutDialog");
        inputButton.addActionListener(e ->{
            String input = JOptionPane.showInputDialog("Enter your name");
            if (input != null){
                log("Input: " + input);
            }
        });
        add(inputButton);

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

            JavaSwingUI cafe = new JavaSwingUI();
            cafe.setVisible(true);

        });
    }
}

