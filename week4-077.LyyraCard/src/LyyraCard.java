/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yodirh
 */
public class LyyraCard {

    private double balance;
    
    //constructor
    public LyyraCard(double balanceAtStart) {
        this.balance = balanceAtStart;

    }
    
    //pay for meal
    public void payEconomical() {
        if (balance >= 2.50) {
            balance = balance - 2.50;
        }
    }
    public void payGourmet() {
        if (balance >= 4) {
            balance = balance - 4.00;
        }
    }
    
    //loading money to card
    public void loadMoney(double amount) {
        if (amount >0 ){
            balance = balance + amount;
        }
        
        
        if (balance > 150){
            balance = 150;
        }
    }

    public String toString() {
        return "The card has " + this.balance + " euros";
    }

}
