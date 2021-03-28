package by.gsu.pms;

import java.util.Scanner;

public class DiscountPurchase extends Purchase{
    private int discount;

    //constructors
    public DiscountPurchase(String name, double price, int number, int discount){
        super(name,price,number);
        this.discount = discount;
    }
    public DiscountPurchase(){
        this("",0,0,0);
    }

    public DiscountPurchase(Scanner sc) {
        this(sc.next(), sc.nextDouble(), sc.nextInt(), sc.nextInt());
    }
    //getters and setters


    public int getDiscount() {
        return discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }
    //methods

    public double getCost(){
        return (this.price-this.discount)*this.number;
    }


}
