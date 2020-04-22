package candy;

import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

class buy {

    void set(dispenserType PROD, cashRegister CASH, String str1, String str2) {
        String str = "" + PROD.getCost();
        JFrame frame = new JFrame(str1);
        JLabel label1 = new JLabel("Price of one " + str1 + ": ");
        JLabel label2 = new JLabel(str);
        JLabel piec = new JLabel("How many " + str2 + "??");
        JTextField piece = new JTextField();
        JLabel pri = new JLabel("Enter the amount");
        JTextField pric = new JTextField();
        JLabel ureg = new JLabel("Updated register:");
        JLabel uregi = new JLabel();
        JLabel pai = new JLabel("Amount paid by user:");
        JLabel amou = new JLabel("Amount to be paid:");
        JLabel amoun = new JLabel();
        JLabel last1 = new JLabel("Amount added to the register:");
        JLabel last2 = new JLabel();
        JButton butt = new JButton("Submit");
        JButton butt2 = new JButton("Pay");

        label1.setBounds(10, 48, 220, 20);
        label2.setBounds(250, 48, 50, 20);
        piec.setBounds(10, 100, 220, 20);
        piece.setBounds(250, 100, 90, 20);
        pri.setBounds(10, 180, 220, 20);
        pric.setBounds(250, 180, 90, 20);
        ureg.setBounds(10, 300, 220, 20);
        uregi.setBounds(250, 300, 50, 20);
        pai.setBounds(10, 220, 220, 20);
        amou.setBounds(10, 140, 220, 20);
        amoun.setBounds(250, 140, 70, 20);
        last1.setBounds(10, 260, 220, 20);
        last2.setBounds(250, 260, 50, 20);
        butt.setBounds(140, 230, 90, 30);
        butt2.setBounds(140, 220, 90, 30);
        frame.setBounds(80, 80, 350, 380);

        butt.addActionListener((ActionEvent e1) -> {
            int money, pieces;
            String mon = "";

            pieces = Integer.parseInt(piece.getText());

            if (PROD.getNoOfItems() >= pieces) {
                money = PROD.getCost() * pieces;
                mon = "" + money;

            } else {
                JOptionPane.showMessageDialog(frame, "Out of stock. Please buy another product.");
                frame.dispose();
            }

            amoun.setText(mon);

            frame.remove(butt);
            frame.add(amou);
            frame.add(amoun);
            frame.add(pri);
            frame.add(pric);

            frame.add(butt2);
            frame.repaint();
        });

        butt2.addActionListener((ActionEvent e) -> {
            int amount = Integer.parseInt(pric.getText());
            String out = "" + amount;
            JLabel paid = new JLabel(out);
            paid.setBounds(250, 220, 70, 20);
            int money, n, amount2;
            int pieces = Integer.parseInt(piece.getText());
            if (PROD.getNoOfItems() >= pieces) {
                money = PROD.getCost() * pieces;
                if (amount == money) {
                    CASH.acceptAmount(amount);
                    PROD.makeSale(pieces);
                    String str3 = "" + CASH.getCurrentBalance();
                    uregi.setText(str3);
                    String fmoney = "" + amount;
                    last2.setText(fmoney);
                } else if (money < amount) {
                    n = amount - money;
                    CASH.acceptAmount(money);
                    PROD.makeSale(pieces);
                    String str4 = "" + CASH.getCurrentBalance();
                    String fmoney = "" + money;
                    uregi.setText(str4);
                    last2.setText(fmoney);
                    out = "Customer paid Rs." + amount + ". Here's your extra money Rs." + n;
                    JOptionPane.showMessageDialog(frame, out);
                } else if (money > amount) {
                    String str5;
                    n = money - amount;
                    str5 = "Please pay Rs." + n + " more";
                    String fmoney = "" + money;
                    amount2 = (int) Integer.parseInt(JOptionPane.showInputDialog(frame, str5));
                    amount = amount2 + amount;
                    out = "" + amount;
                    paid.setText(out);
                    CASH.acceptAmount(amount);
                    PROD.makeSale(pieces);
                    last2.setText(fmoney);
                    String str6 = "" + CASH.getCurrentBalance();
                    uregi.setText(str6);
                }
            } else {
                JOptionPane.showMessageDialog(frame, "Out of stock. Please buy another product.");
                frame.dispose();
            }
            frame.remove(butt2);
            frame.add(pai);
            frame.add(paid);
            frame.add(ureg);
            frame.add(uregi);
            frame.add(last1);
            frame.add(last2);
            frame.repaint();
        });

        frame.add(label1);
        frame.add(label2);
        frame.add(piec);
        frame.add(piece);
        frame.add(butt);

        frame.setLayout(null);
        frame.setVisible(true);
    }

}

