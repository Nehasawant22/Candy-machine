package candy;

import javax.swing.*;

class register {

    void set(cashRegister CASH, dispenserType GUM, dispenserType CHIPS, dispenserType COOK, dispenserType CANDY) {

        String regis, candi_q, candi_a, cook_q, cook_a, gum_a, gum_q, chip_a, chip_q;

        regis = "" + CASH.getCurrentBalance();
        candi_q = "" + CANDY.getNoOfItems();
        candi_a = "" + CANDY.getCost();
        cook_q = "" + COOK.getNoOfItems();
        cook_a = "" + COOK.getCost();
        gum_q = "" + GUM.getNoOfItems();
        gum_a = "" + GUM.getCost();
        chip_q = "" + CHIPS.getNoOfItems();
        chip_a = "" + CHIPS.getCost();

        JFrame frame = new JFrame("Register");
        JLabel reg = new JLabel("Register: ");
        JLabel cand = new JLabel("Candies: ");
        JLabel cook = new JLabel("Cookies: ");
        JLabel gum = new JLabel("Gums: ");
        JLabel chip = new JLabel("Chips: ");
        JLabel qnty = new JLabel("Quantity: ");
        JLabel amnt = new JLabel("Amount: ");
        JLabel regi = new JLabel(regis);
        JLabel cand_q = new JLabel(candi_q);
        JLabel cand_a = new JLabel(candi_a);
        JLabel coo_q = new JLabel(cook_q);
        JLabel coo_a = new JLabel(cook_a);
        JLabel gu_q = new JLabel(gum_q);
        JLabel gu_a = new JLabel(gum_a);
        JLabel chi_q = new JLabel(chip_q);
        JLabel chi_a = new JLabel(chip_a);

        reg.setBounds(10, 20, 190, 30);
        cand.setBounds(10, 70, 250, 30);
        cook.setBounds(10, 110, 250, 30);
        gum.setBounds(10, 150, 250, 30);
        chip.setBounds(10, 190, 250, 30);
        qnty.setBounds(300, 48, 70, 30);
        amnt.setBounds(400, 48, 70, 30);
        regi.setBounds(370, 25, 80, 25);
        cand_q.setBounds(325, 75, 80, 25);
        cand_a.setBounds(423, 75, 80, 25);
        coo_q.setBounds(325, 115, 80, 25);
        coo_a.setBounds(423, 115, 80, 25);
        gu_q.setBounds(325, 155, 80, 25);
        gu_a.setBounds(423, 155, 80, 25);
        chi_q.setBounds(325, 195, 80, 25);
        chi_a.setBounds(420, 195, 80, 25);
        frame.setBounds(80, 80, 500, 300);

        frame.add(reg);
        frame.add(cand);
        frame.add(cook);
        frame.add(gum);
        frame.add(chip);
        frame.add(qnty);
        frame.add(regi);
        frame.add(cand_q);
        frame.add(cand_a);
        frame.add(coo_q);
        frame.add(coo_a);
        frame.add(gu_q);
        frame.add(gu_a);
        frame.add(chi_q);
        frame.add(coo_a);
        frame.add(chi_a);
        frame.add(amnt);

        frame.setLayout(null);
        frame.setVisible(true);
    }

}

