import javax.swing.*;

import AbstractFactory.*;
import Command.*;
import Decorator.*;
import Observer.*;

public class ParlorMain {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            try {
                UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            } catch (Exception e) {
                e.printStackTrace();
            }

            WelcomeWindow window = new WelcomeWindow("FinalProject/src/imagesOfMenu/CafeLogo.jpg");
            window.setVisible(true);
            //CafeMenuUI cafeMenuUI = new CafeMenuUI();
            //cafeMenuUI.setVisible(true);
            //JavaSwingUI cafe = new JavaSwingUI();
            //cafe.setVisible(true);

        });
    }
}
