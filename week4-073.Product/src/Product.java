/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yodirh
 */
public class Product {
    private double price;
    private int amount;
    private String name;
    
    public Product(String nameATStart, double priceAtStart, int amountAtStart){
        this.price= priceAtStart;
        this.amount = amountAtStart;
        this.name= nameATStart;
    }
    public void printProduct(){
        System.out.println(this.name + ", price "+ this.price + ", amount "+ this.amount);
    }
    
}
