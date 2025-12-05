import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

import AbstractFactory.*;
import AbstractFactory.Menu;
import Command.*;
import Decorator.*;
import Observer.*;

public class ImagesFrame {

    public ImagesFrame(ArrayList<Menu> orderList){
        JFrame receipt = new JFrame();
        receipt.setTitle("Receipt");
        receipt.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        receipt.setSize(800, 800);
        receipt.setLocationRelativeTo(null);

        receipt.setLayout(new GridBagLayout());
        GridBagConstraints gbc1 = new GridBagConstraints();
        gbc1.insets = new Insets(5, 5, 5, 5);
        gbc1.anchor = GridBagConstraints.WEST;
        gbc1.fill = GridBagConstraints.HORIZONTAL;

        String[] imagePaths1 = new String[16];
        imagePaths1[0] = "FinalProject/src/ImagesOfMenu/largeCookie.jpg";
        imagePaths1[1] = "FinalProject/src/ImagesOfMenu/smallCookie.jpg";
        imagePaths1[2] = "FinalProject/src/ImagesOfMenu/redvelvetcake.jpg";
        imagePaths1[3] = "FinalProject/src/ImagesOfMenu/lavaCake.jpg";
        imagePaths1[4] = "FinalProject/src/ImagesOfMenu/vanillaPint.jpg";
        imagePaths1[5] = "FinalProject/src/ImagesOfMenu/chocolatePint.jpg";
        imagePaths1[6] = "FinalProject/src/ImagesOfMenu/cookiesncreamPint.jpg";
        imagePaths1[7] = "FinalProject/src/ImagesOfMenu/vanilla-milkshake.jpg";
        imagePaths1[8] = "FinalProject/src/ImagesOfMenu/strawbanshake.jpg";
        imagePaths1[9] = "FinalProject/src/ImagesOfMenu/chocolateshake.jpg";
        imagePaths1[10] = "FinalProject/src/ImagesOfMenu/conechocolate.jpg";
        imagePaths1[11] = "FinalProject/src/ImagesOfMenu/cupchocolate.jpg";
        imagePaths1[12] = "FinalProject/src/ImagesOfMenu/conevanilla.jpg";
        imagePaths1[13] = "FinalProject/src/ImagesOfMenu/cupvanilla.jpg";
        imagePaths1[14] = "FinalProject/src/ImagesOfMenu/CookiesNCreamCone.jpg";
        imagePaths1[15] = "FinalProject/src/ImagesOfMenu/cookiencreamcup.jpg";

        // the image for the large cookie
        ImageIcon LargeCookieI = new ImageIcon(imagePaths1[0]);
        Image largeCookieEdit = LargeCookieI.getImage().getScaledInstance(100,100,Image.SCALE_SMOOTH);
        LargeCookieI.setImage(largeCookieEdit);
        JLabel LargeCookie = new JLabel(LargeCookieI);

        // the image for the small cookie
        ImageIcon SmallCookieI = new ImageIcon(imagePaths1[1]);
        Image smallCookieEdit = SmallCookieI.getImage().getScaledInstance(100,100,Image.SCALE_SMOOTH);
        SmallCookieI.setImage(smallCookieEdit);
        JLabel SmallCookie = new JLabel(SmallCookieI);

        // the image for the redvelvet cake
        ImageIcon RedVelvetCakeI = new ImageIcon(imagePaths1[2]);
        Image redVelvetCakeEdit = RedVelvetCakeI.getImage().getScaledInstance(100,100,Image.SCALE_SMOOTH);
        RedVelvetCakeI.setImage(redVelvetCakeEdit);
        JLabel RedVelvetCake = new JLabel(RedVelvetCakeI);

        // the image for the lava cake
        ImageIcon LavaCakeI = new ImageIcon(imagePaths1[3]);
        Image lavaCakeEdit = LavaCakeI.getImage().getScaledInstance(100,100,Image.SCALE_SMOOTH);
        LavaCakeI.setImage(lavaCakeEdit);
        JLabel LavaCake = new JLabel(LavaCakeI);

        // the image for the vanilla pint
        ImageIcon VanillaPintI = new ImageIcon(imagePaths1[4]);
        Image vanillaPintEdit = VanillaPintI.getImage().getScaledInstance(100,100,Image.SCALE_SMOOTH);
        VanillaPintI.setImage(vanillaPintEdit);
        JLabel VanillaPint = new JLabel(VanillaPintI);

        // the image for the chocolate pint
        ImageIcon ChocolatePintI = new ImageIcon(imagePaths1[5]);
        Image chocolatePintEdit = ChocolatePintI.getImage().getScaledInstance(100,100,Image.SCALE_SMOOTH);
        ChocolatePintI.setImage(chocolatePintEdit);
        JLabel ChocolatePint = new JLabel(ChocolatePintI);

        // the image for the cookies n cream pint
        ImageIcon CookiesNCreamPintI = new ImageIcon(imagePaths1[6]);
        Image cookiesNCreamPintEdit = CookiesNCreamPintI.getImage().getScaledInstance(100,100,Image.SCALE_SMOOTH);
        CookiesNCreamPintI.setImage(cookiesNCreamPintEdit);
        JLabel CookiesNCreamPint = new JLabel(CookiesNCreamPintI);

        // the image for the vanilla shake
        ImageIcon VanillaShakeI = new ImageIcon(imagePaths1[7]);
        Image vanillaShakeEdit = VanillaShakeI.getImage().getScaledInstance(100,100,Image.SCALE_SMOOTH);
        VanillaShakeI.setImage(vanillaShakeEdit);
        JLabel VanillaShake = new JLabel(VanillaShakeI);

        // the image for the strawberry and banana shake
        ImageIcon StrawberryBananaShakeI = new ImageIcon(imagePaths1[8]);
        Image strawberryBananaShakeEdit = StrawberryBananaShakeI.getImage().getScaledInstance(100,100,Image.SCALE_SMOOTH);
        StrawberryBananaShakeI.setImage(strawberryBananaShakeEdit);
        JLabel StrawberryBananaShake = new JLabel(StrawberryBananaShakeI);

        // the image for the chocolate shake
        ImageIcon ChocolateShakeI = new ImageIcon(imagePaths1[9]);
        Image chocolateShakeEdit = ChocolateShakeI.getImage().getScaledInstance(100,100,Image.SCALE_SMOOTH);
        ChocolateShakeI.setImage(chocolateShakeEdit);
        JLabel ChocolateShake = new JLabel(ChocolateShakeI);

        // the image for the chocolate ice cream in cone
        ImageIcon ChocolateConeI = new ImageIcon(imagePaths1[10]);
        Image chocolateConeEdit = ChocolateConeI.getImage().getScaledInstance(100,100,Image.SCALE_SMOOTH);
        ChocolateConeI.setImage(chocolateConeEdit);
        JLabel ChocolateCone = new JLabel(ChocolateConeI);

        // the image for the chocolate ice cream in cup
        ImageIcon ChocolateCupI = new ImageIcon(imagePaths1[11]);
        Image chocolateCupEdit = ChocolateCupI.getImage().getScaledInstance(100,100,Image.SCALE_SMOOTH);
        ChocolateConeI.setImage(chocolateConeEdit);
        JLabel ChocolateCup = new JLabel(ChocolateCupI);

        // the image for the vanilla ice cream in cone
        ImageIcon VanillaConeI = new ImageIcon(imagePaths1[12]);
        Image vanillaConeEdit = VanillaConeI.getImage().getScaledInstance(100,100,Image.SCALE_SMOOTH);
        VanillaConeI.setImage(vanillaConeEdit);
        JLabel VanillaCone = new JLabel(VanillaConeI);

        // the image for the vanilla ice cream in cup
        ImageIcon VanillaCupI = new ImageIcon(imagePaths1[13]);
        Image vanillaCupEdit = VanillaCupI.getImage().getScaledInstance(100,100,Image.SCALE_SMOOTH);
        VanillaCupI.setImage(vanillaCupEdit);
        JLabel VanillaCup = new JLabel(VanillaCupI);

        // the image for the cookies and cream ice cream in cone
        ImageIcon CookiesNCreamConeI = new ImageIcon(imagePaths1[14]);
        Image cookiesNCreamConeEdit = CookiesNCreamConeI.getImage().getScaledInstance(100,100,Image.SCALE_SMOOTH);
        CookiesNCreamConeI.setImage(cookiesNCreamConeEdit);
        JLabel CookiesNCreamCone = new JLabel(CookiesNCreamConeI);

        // the image for the cookies and cream ice cream in cup
        ImageIcon CookiesNCreamCupI = new ImageIcon(imagePaths1[15]);
        Image cookiesNCreamCupEdit = CookiesNCreamCupI.getImage().getScaledInstance(100,100,Image.SCALE_SMOOTH);
        CookiesNCreamCupI.setImage(cookiesNCreamCupEdit);
        JLabel CookiesNCreamCup = new JLabel(CookiesNCreamCupI);

        for (AbstractFactory.Menu item : orderList) {
            if (item.getDescription().contains("Large Cookie")) {
                receipt.add(LargeCookie);

            }
            if (item.getDescription().contains("Small Cookie")) {
                receipt.add(SmallCookie);

            }
            if (item.getDescription().contains("Red Velvet Cake")) {
                receipt.add(RedVelvetCake);

            }
            if (item.getDescription().contains("Lava Cake")) {
                receipt.add(LavaCake);

            }
            if (item.getDescription().contains("Vanilla Ice Cream Pint")) {
                receipt.add(VanillaPint);

            }
            if (item.getDescription().contains("Chocolate Ice Cream Pint")) {
                receipt.add(ChocolatePint);

            }
            if (item.getDescription().contains("Cookies N Cream Ice Cream Pint")) {
                receipt.add(CookiesNCreamPint);

            }
            if (item.getDescription().contains("Vanilla Shake")) {
                receipt.add(VanillaShake);

            }
            if (item.getDescription().contains("Strawberry-Banana Smoothie")) {
                receipt.add(StrawberryBananaShake);

            }
            if (item.getDescription().contains("Chocolate Shake")) {
                receipt.add(ChocolateShake);

            }
            if (item.getDescription().contains("Chocolate Ice Cream")) {
                if (item.getDescription().contains("Cone")) {
                    receipt.add(ChocolateCone);
                }
                //receipt.add(ChocolateCone);

            }
            if (item.getDescription().contains("Chocolate Ice Cream")) {
                if (item.getDescription().contains("Cup")) {
                    receipt.add(ChocolateCup);
                }
                //receipt.add(ChocolateCup);

            }
            if (item.getDescription().contains("Vanilla Ice Cream")) {
                if (item.getDescription().contains("Cone")) {
                    receipt.add(VanillaCone);
                }
                //receipt.add(VanillaCone);

            }
            if (item.getDescription().contains("Vanilla Ice Cream")) {
                if (item.getDescription().contains("Cup")) {
                    receipt.add(VanillaCup);
                }
                //receipt.add(VanillaCup);

            }
            if (item.getDescription().contains("Cookies N' Cream Ice Cream")) {
                if (item.getDescription().contains("Cone")) {
                    receipt.add(CookiesNCreamCone);
                }
                //receipt.add(CookiesNCreamCone);

            }
            if (item.getDescription().contains("Cookies N' Cream Ice Cream")) {
                if (item.getDescription().contains("Cup")) {
                    receipt.add(CookiesNCreamCup);
                }
                //receipt.add(CookiesNCreamCup);

            }
        }

        //receipt.pack();
        receipt.setVisible(true);
    }

}
