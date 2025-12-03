import javax.swing.*;

public class ParlorMain {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            try {
                UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            } catch (Exception e) {
                e.printStackTrace();
            }
            CafeMenuUI cafeMenuUI = new CafeMenuUI();
            cafeMenuUI.setVisible(true);
            //JavaSwingUI cafe = new JavaSwingUI();
            //cafe.setVisible(true);

        });
    }
}
