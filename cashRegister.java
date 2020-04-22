package candy;

import javax.swing.*;
import java.awt.event.ActionEvent;

class cashRegister {

    private int cashOnHand;

    public cashRegister() {
        cashOnHand = 500;
    }

    public void set(int x) {
        cashOnHand = x;
    }

    public int getCurrentBalance() {
        return cashOnHand;
    }

    public int acceptAmount(int x) {
        cashOnHand = cashOnHand + x;
        return cashOnHand;
    }
}