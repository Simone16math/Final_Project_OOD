import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ReceiptPanel extends JFrame{

    public ReceiptPanel(){
        setTitle("Receipt");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800, 800);
        setLocationRelativeTo(null);

        setLayout(new GridBagLayout());
        GridBagConstraints gbc1 = new GridBagConstraints();
        gbc1.insets = new Insets(5, 5, 5, 5);
        gbc1.anchor = GridBagConstraints.WEST;
        gbc1.fill = GridBagConstraints.HORIZONTAL;

        ImageIcon smoothie = new ImageIcon("FinalProject/src/testing.jpeg");
        JLabel smothie = new JLabel(smoothie);
        add(smothie);

        setVisible(true);

    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            try {
                UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            } catch (Exception e) {
                e.printStackTrace();
            }
            ReceiptPanel test = new ReceiptPanel();
            test.setVisible(true);
            //JavaSwingUI cafe = new JavaSwingUI();
            //cafe.setVisible(true);

        });
    }
}
