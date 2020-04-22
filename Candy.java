package candy;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JFrame;

public class Candy {

    public static void main(String[] args) {
        cashRegister CASH = new cashRegister();
        dispenserType CANDY = new dispenserType(10, 3);
        dispenserType COOK = new dispenserType(10, 5);
        dispenserType CHIPS = new dispenserType(10, 10);
        dispenserType GUM = new dispenserType(10, 2);

        JFrame mainFrame = new JFrame("Candy Machine");
        JButton admin_b = new JButton("Admin");
        JButton register_b = new JButton("Register");
        JButton but1 = new JButton("Candy");
        JButton but2 = new JButton("Cookie");
        JButton but3 = new JButton("Gum");
        JButton but4 = new JButton("Chips");

        but1.setBounds(50, 50, 90, 30);
        but2.setBounds(200, 50, 90, 30);
        but3.setBounds(50, 135, 90, 30);
        but4.setBounds(200, 135, 90, 30);
        register_b.setBounds(50, 230, 95, 30);
        admin_b.setBounds(200, 230, 90, 30);
        mainFrame.setBounds(50, 50, 350, 320);

        admin_b.addActionListener((ActionEvent e) -> {
            admin ad = new admin();
            ad.set(CASH, GUM, CHIPS, COOK, CANDY);
        });

        register_b.addActionListener((ActionEvent e) -> {
            register re = new register();
            re.set(CASH, GUM, CHIPS, COOK, CANDY);
        });

        but1.addActionListener((ActionEvent e) -> {
            String str, str1;
            str = "Candy";
            str1 = "pieces of candies";
            buy cd = new buy();
            cd.set(CANDY, CASH, str, str1);
        });

        but2.addActionListener((ActionEvent e) -> {
            String str, str1;
            str = "Cookie";
            str1 = "pieces of cookies";
            buy co = new buy();
            co.set(COOK, CASH, str, str1);
        });

        but3.addActionListener((ActionEvent e) -> {
            String str, str1;
            str = "Gum";
            str1 = "pieces of gums";
            buy gu = new buy();
            gu.set(GUM, CASH, str, str1);
        });

        but4.addActionListener((ActionEvent e) -> {
            String str, str1;
            str = "Chips";
            str1 = "packets of chips";
            buy ch = new buy();
            ch.set(CHIPS, CASH, str, str1);
        });

        mainFrame.add(but1);
        mainFrame.add(but2);
        mainFrame.add(but3);
        mainFrame.add(but4);
        mainFrame.add(register_b);
        mainFrame.add(admin_b);

        mainFrame.setLayout(null);
        mainFrame.setVisible(true);
    }
}

