import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class ReceiptPanel extends JFrame{

//    public enum MenuItemsList{
//        LargeCookie, SmallCookie, RedVelvetCake, LavaCake, VanillaPint, ChocolatePint, CookiesNCreamPint,
//        VanillaShake, StrawberryBananaShake, ChocolateShake, ChocolateCone, ChocolateCup, VanillaCone, VanillaCup,
//        CookiesNCreamCone, CookiesNCreamCup
//    }
//
//   private ArrayList<String> imagePaths = new ArrayList<String>();
//
//    public void loadPaths(){
//
//    }


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


        ArrayList<String> imagePaths = new ArrayList<String>();
        imagePaths.add("FinalProject/src/imagesOfMenu/largeCookie.jpg");
        imagePaths.add("FinalProject/src/imagesOfMenu/smallCookie.jpg");
        imagePaths.add("FinalProject/src/imagesOfMenu/redvelvetcake.jpg");
        imagePaths.add("FinalProject/src/imagesOfMenu/lavaCake.jpg");
        imagePaths.add("FinalProject/src/imagesOfMenu/vanillaPint.jpg");
        imagePaths.add("FinalProject/src/imagesOfMenu/chocolatePint.jpg");
        imagePaths.add("FinalProject/src/imagesOfMenu/cookiesncreamPint.jpg");
        imagePaths.add("FinalProject/src/imagesOfMenu/vanilla-milkshake.jpg");
        imagePaths.add("FinalProject/src/imagesOfMenu/strawbanshake.jpg");
        imagePaths.add("FinalProject/src/imagesOfMenu/chocolateshake.jpg");
        imagePaths.add("FinalProject/src/imagesOfMenu/conechocolate.jpg");
        imagePaths.add("FinalProject/src/imagesOfMenu/cupchocolate.jpg");
        imagePaths.add("FinalProject/src/imagesOfMenu/conevanilla.jpg");
        imagePaths.add("FinalProject/src/imagesOfMenu/cupvanilla.jpg");
        imagePaths.add("FinalProject/src/imagesOfMenu/CookiesNCreamCone.jpg");
        imagePaths.add("FinalProject/src/imagesOfMenu/cookiencreamcup.jpg");



        String[] imagePaths1 = new String[16];
        imagePaths1[0] = "FinalProject/src/imagesOfMenu/largeCookie.jpg";
        imagePaths1[1] = "FinalProject/src/imagesOfMenu/smallCookie.jpg";
        imagePaths1[2] = "FinalProject/src/imagesOfMenu/redvelvetcake.jpg";
        imagePaths1[3] = "FinalProject/src/imagesOfMenu/lavaCake.jpg";
        imagePaths1[4] = "FinalProject/src/imagesOfMenu/vanillaPint.jpg";
        imagePaths1[5] = "FinalProject/src/imagesOfMenu/chocolatePint.jpg";
        imagePaths1[6] = "FinalProject/src/imagesOfMenu/cookiesncreamPint.jpg";
        imagePaths1[7] = "FinalProject/src/imagesOfMenu/vanilla-milkshake.jpg";
        imagePaths1[8] = "FinalProject/src/imagesOfMenu/strawbanshake.jpg";
        imagePaths1[9] = "FinalProject/src/imagesOfMenu/chocolateshake.jpg";
        imagePaths1[10] = "FinalProject/src/imagesOfMenu/conechocolate.jpg";
        imagePaths1[11] = "FinalProject/src/imagesOfMenu/cupchocolate.jpg";
        imagePaths1[12] = "FinalProject/src/imagesOfMenu/conevanilla.jpg";
        imagePaths1[13] = "FinalProject/src/imagesOfMenu/cupvanilla.jpg";
        imagePaths1[14] = "FinalProject/src/imagesOfMenu/CookiesNCreamCone.jpg";
        imagePaths1[15] = "FinalProject/src/imagesOfMenu/cookiencreamcup.jpg";

        ImageIcon smoothie = new ImageIcon("FinalProject/src/testing.jpeg");
        JLabel smothie = new JLabel(smoothie);
        add(smothie);

        ImageIcon LargeCookieI  = new ImageIcon(imagePaths1[0]);
        JLabel LargeCookie = new JLabel(LargeCookieI);
        ImageIcon SmallCookieI  = new ImageIcon(imagePaths1[1]);
        JLabel SmallCookie = new JLabel(SmallCookieI);
        ImageIcon RedVelvetCakeI = new ImageIcon(imagePaths1[2]);
        JLabel RedVelvetCake = new JLabel(RedVelvetCakeI);
        ImageIcon LavaCakeI  = new ImageIcon(imagePaths1[3]);
        JLabel LavaCake = new JLabel(LavaCakeI);
        ImageIcon VanillaPintI  = new ImageIcon(imagePaths1[4]);
        JLabel VanillaPint = new JLabel(VanillaPintI);
        ImageIcon ChocolatePintI  = new ImageIcon(imagePaths1[5]);
        JLabel ChocolatePint = new JLabel(ChocolatePintI);
        ImageIcon CookiesNCreamPintI  = new ImageIcon(imagePaths1[6]);
        JLabel CookiesNCreamPint = new JLabel(CookiesNCreamPintI);
        ImageIcon VanillaShakeI  = new ImageIcon(imagePaths1[7]);
        JLabel VanillaShake = new JLabel(VanillaShakeI);
        ImageIcon StrawberryBananaShakeI  = new ImageIcon(imagePaths1[8]);
        JLabel StrawberryBananaShake = new JLabel(StrawberryBananaShakeI);
        ImageIcon ChocolateShakeI  = new ImageIcon(imagePaths1[9]);
        JLabel ChocolateShake = new JLabel(ChocolateShakeI);
        ImageIcon ChocolateConeI  = new ImageIcon(imagePaths1[10]);
        JLabel ChocolateCone = new JLabel(ChocolateConeI);
        ImageIcon ChocolateCupI  = new ImageIcon(imagePaths1[11]);
        JLabel ChocolateCup = new JLabel(ChocolateCupI);
        ImageIcon VanillaConeI  = new ImageIcon(imagePaths1[12]);
        JLabel VanillaCone = new JLabel(VanillaConeI);
        ImageIcon VanillaCupI  = new ImageIcon(imagePaths1[13]);
        JLabel VanillaCup = new JLabel(VanillaCupI);
        ImageIcon CookiesNCreamConeI  = new ImageIcon(imagePaths1[14]);
        JLabel CookiesNCreamCone = new JLabel(CookiesNCreamConeI);
        ImageIcon CookiesNCreamCupI  = new ImageIcon(imagePaths1[15]);
        JLabel CookiesNCreamCup = new JLabel(CookiesNCreamCupI);








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
