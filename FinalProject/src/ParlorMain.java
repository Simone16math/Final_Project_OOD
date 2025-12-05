import javax.swing.*;

public class ParlorMain {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            try {
                UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            } catch (Exception e) {
                e.printStackTrace();
            }

            WelcomeWindow window = new WelcomeWindow("C:\\Users\\annik\\OneDrive\\Documents\\College\\NCF\\Java\\finalProject\\Final_Project_OOD\\FinalProject\\src\\background.jpg");
            window.setVisible(true);
            //CafeMenuUI cafeMenuUI = new CafeMenuUI();
            //cafeMenuUI.setVisible(true);
            //JavaSwingUI cafe = new JavaSwingUI();
            //cafe.setVisible(true);

        });
    }
}
