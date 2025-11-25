import javax.swing.*;

public class Main {
    public static void main(String[] args){
        SwingUtilities.invokeLater(() -> {
            try {
                UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            } catch (Exception e) {
                e.printStackTrace();
            }

//            JavaSwingUI1 cafe = new JavaSwingUI1();
//            cafe.setVisible(true);
            // testing using a new UI
            ParlorUITest test = new ParlorUITest();
            test.setVisible(true);

        });
    }
}
