import javax.swing.*;
import java.awt.*;

public class JavaSwingUI extends JFrame{
    private JTextArea outputArea;

    public JavaSwingUI(JavaSwingUI javaSwingUI) {
        setTitle("Café:");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800, 800);
        setLocationRelativeTo(null);


        // Main panel with tabs
        JTabbedPane tabbedPane = new JTabbedPane();
        tabbedPane.addTab("Café", new JavaSwingUI(this));


        // Layout
        setLayout(new BorderLayout());
        add(tabbedPane, BorderLayout.CENTER);
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

            JavaSwingUI cafe = new JavaSwingUI(this);
            cafe.setVisible(true);

        });
    }
}

