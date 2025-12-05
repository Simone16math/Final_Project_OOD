
import javax.swing.*;
import java.awt.*;

public class WelcomeWindow extends JFrame {
    private String imagePath;
    private String imagePathFlower;
    private String image3;
    private JPanel panel1;
    private JPanel panel2;

    public WelcomeWindow(String image3) {
        //JFrame frame = new JFrame("Cafe Menu");

        setLayout(new BorderLayout(5, 5));
        JPanel panel = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 2, 5, 2);
        gbc.anchor = GridBagConstraints.WEST;
        gbc.fill = GridBagConstraints.HORIZONTAL;


        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setSize(800,800);
        this.setVisible(true);
        imagePath = "C:\\Users\\annik\\OneDrive\\Documents\\College\\NCF\\Java\\finalProject\\Final_Project_OOD\\FinalProject\\src\\imagesOfMenu\\CafeLogo.jpg";
        //image3 ="C:\Users\annik\OneDrive\Documents\College\NCF\Java\finalProject\Final_Project_OOD\FinalProject\src\background.jpg";
        this.setIconImage(new ImageIcon(imagePath).getImage());
        //getContentPane().add(new WelcomeWindow(this.image3));
        panel.setBackground(new Color(111, 78, 55));

        imagePathFlower = "C:\\Users\\annik\\OneDrive\\Documents\\College\\NCF\\Java\\finalProject\\Final_Project_OOD\\FinalProject\\src\\imagesOfMenu\\flower-watercolor-painting-watercolor-flowers-shading-3f019ca7729f8e6fdf71019d6d26fe53.png";
        /*gbc.gridx = 2;
        gbc.gridy = 3;
        JLabel design =new JLabel(new ImageIcon(imagePath));
        design.setPreferredSize(new Dimension(800,800));
        design.setForeground(new Color(255, 182, 193));
        panel.add(design,gbc);*/

        gbc.gridx = 3;
        gbc.gridy = 2;
        JLabel design2 = new JLabel(new ImageIcon(imagePath));
        design2.setPreferredSize(new Dimension(100,200));

        panel.add(design2,gbc);

        gbc.gridx = 3;
        gbc.gridy = 3;
        JLabel welcomeLabel = new JLabel("Welcome to Bresso!");
        welcomeLabel.setForeground(new Color(255, 182, 193));
        welcomeLabel.setFont(new Font("Broadway", Font.BOLD, 25));
        //welcomeLabel.setAlignmentX(Component.CENTER_ALIGNMENT);

        panel.add(welcomeLabel,gbc);

        gbc.gridx = 3;
        gbc.gridy = 4;
        JButton button = new JButton("Start Order");
        button.setForeground(new Color(111, 78, 55));
        button.setFont(new Font("Broadway", Font.BOLD,18));
        button.addActionListener(e -> {
           CafeMenuUI cafeMenuUI = new CafeMenuUI();
           cafeMenuUI.setVisible(true);
        });


        panel.add(button,gbc);

        gbc.gridx = 3;
        gbc.gridy = 5;
        JButton cancel = new JButton("Cancel");
        cancel.setForeground(new Color(111, 78, 55));
        cancel.setFont(new Font("Broadway", Font.BOLD,18));
        cancel.addActionListener(e -> {
            this.dispose();
        });

        panel.add(cancel,gbc);

        add(panel, BorderLayout.CENTER);



    }

}
