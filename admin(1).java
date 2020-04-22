package candy;

import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;

class admin extends cashRegister {

    void set(cashRegister CASH, dispenserType GUM, dispenserType CHIPS, dispenserType COOK, dispenserType CANDY) {

        JFrame frame = new JFrame("ADMIN");
        JLabel label = new JLabel("Set money in the register:");
        JLabel label1 = new JLabel("Set quantity & amount of candies:");
        JLabel label2 = new JLabel("Set quantity & amount of cookies:");
        JLabel label3 = new JLabel("Set quantity & amount of gums:");
        JLabel label4 = new JLabel("Set quantity & amount of chips:");
        JLabel qnty = new JLabel("Quantity:");
        JLabel amnt = new JLabel("Amount:");
        JFormattedTextField reg = new JFormattedTextField();
        JFormattedTextField cand_q = new JFormattedTextField();
        JFormattedTextField cand_a = new JFormattedTextField();
        JFormattedTextField coo_q = new JFormattedTextField();
        JFormattedTextField coo_a = new JFormattedTextField();
        JFormattedTextField gu_q = new JFormattedTextField();
        JFormattedTextField gu_a = new JFormattedTextField();
        JFormattedTextField chi_q = new JFormattedTextField();
        JFormattedTextField chi_a = new JFormattedTextField();
        JButton but = new JButton("Submit");

        reg.setValue(CASH.getCurrentBalance());
        cand_q.setValue(CANDY.getNoOfItems());
        cand_a.setValue(CANDY.getCost());
        coo_q.setValue(COOK.getNoOfItems());
        coo_a.setValue(COOK.getCost());
        gu_q.setValue(GUM.getNoOfItems());
        gu_a.setValue(GUM.getCost());
        chi_q.setValue(CHIPS.getNoOfItems());
        chi_a.setValue(CHIPS.getCost());

        but.addActionListener((ActionEvent e) -> {
            int regi, candy_q, candy_a, gum_q, gum_a, chip_q, chip_a, cook_q, cook_a;
            regi = (int) reg.getValue();
            candy_q = (int) cand_q.getValue();
            candy_a = (int) cand_a.getValue();
            gum_q = (int) gu_q.getValue();
            gum_a = (int) gu_a.getValue();
            chip_q = (int) chi_q.getValue();
            chip_a = (int) chi_a.getValue();
            cook_q = (int) coo_q.getValue();
            cook_a = (int) coo_a.getValue();
            CASH.set(regi);
            CANDY.set(candy_q, candy_a);
            GUM.set(gum_q, gum_a);
            CHIPS.set(chip_q, chip_a);
            COOK.set(cook_q, cook_a);
            reg.setValue(CASH.getCurrentBalance());
            cand_q.setValue(CANDY.getNoOfItems());
            cand_a.setValue(CANDY.getCost());
            coo_q.setValue(COOK.getNoOfItems());
            coo_a.setValue(COOK.getCost());
            gu_q.setValue(GUM.getNoOfItems());
            gu_a.setValue(GUM.getCost());
            chi_q.setValue(CHIPS.getNoOfItems());
            chi_a.setValue(CHIPS.getCost());
            frame.dispose();
        });

        label.setBounds(10, 20, 190, 30);
        label1.setBounds(10, 70, 250, 30);
        label2.setBounds(10, 110, 250, 30);
        label3.setBounds(10, 150, 250, 30);
        label4.setBounds(10, 190, 250, 30);
        qnty.setBounds(300, 48, 70, 30);
        amnt.setBounds(400, 48, 70, 30);
        reg.setBounds(290, 25, 80, 25);
        cand_q.setBounds(290, 75, 80, 25);
        cand_a.setBounds(390, 75, 80, 25);
        coo_q.setBounds(290, 115, 80, 25);
        coo_a.setBounds(390, 115, 80, 25);
        gu_q.setBounds(290, 155, 80, 25);
        gu_a.setBounds(390, 155, 80, 25);
        chi_q.setBounds(290, 195, 80, 25);
        chi_a.setBounds(390, 195, 80, 25);
        but.setBounds(200, 250, 90, 30);
        frame.setBounds(80, 70, 500, 300);

        frame.add(label);
        frame.add(label1);
        frame.add(label2);
        frame.add(label3);
        frame.add(label4);
        frame.add(amnt);
        frame.add(qnty);
        frame.add(reg);
        frame.add(cand_q);
        frame.add(cand_a);
        frame.add(coo_q);
        frame.add(coo_a);
        frame.add(gu_q);
        frame.add(gu_a);
        frame.add(chi_q);
        frame.add(coo_a);
        frame.add(chi_a);
        frame.add(but);

        frame.setLayout(null);
        frame.setVisible(true);
    }

}

