import javax.swing.*;
import java.awt.*;

public class ParlorUITest extends JFrame{

    public ParlorUITest(){
        setTitle("Ice Cream Parlor");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(1000, 1000);
        setLocationRelativeTo(null);

        setLayout(new GridLayout(4, 2, 10, 10));



        JLabel title = new JLabel("Ice Cream Parlor");
        Font bigFont = new Font("Serif", Font.BOLD, 20);
        title.setFont(bigFont);
        add(title);



        JButton iceCream = new JButton("Ice Cream Options");
        add(iceCream);

        JTextArea menuItems = new JTextArea(10,10);
        menuItems.setLineWrap(true);
        menuItems.setWrapStyleWord(true);
        JScrollPane scrollPane = new JScrollPane(menuItems);
        add(scrollPane);

    }

}
