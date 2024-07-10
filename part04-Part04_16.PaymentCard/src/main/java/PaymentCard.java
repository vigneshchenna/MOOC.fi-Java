/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Vignesh
 */
public class PaymentCard {

    private double balance;

    public PaymentCard(double openingBalance) {
        this.balance = openingBalance;
    }

    public void eatAffordably() {
        if (this.balance >= 2.60) {
            this.balance -= 2.60;
        }
    }

    public void eatHeartily() {
        if (this.balance >= 4.60) {
            this.balance -= 4.60;
        }

    }

    public void addMoney(double money) {
        
        if(money>0){
            this.balance+=money;
        }
        
        if(this.balance>150.0){
            this.balance = 150.0;
        }
    }

    @Override
    public String toString() {
        return "The card has a balance of " + String.valueOf(this.balance) + " euros";
    }
}
