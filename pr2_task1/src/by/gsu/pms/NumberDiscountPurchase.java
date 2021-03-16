package by.gsu.pms;

public class NumberDiscountPurchase extends Purchase{
    public static final int NUMBER_DISCOUNT = 10;
    private double discount;

    //constructors
    public NumberDiscountPurchase(String name, double price, int number, double discount){
        super(name,price,number);
        if (super.number>NUMBER_DISCOUNT){
            this.discount = discount;
        }else {
            this.discount = 0;
        }
    }
    public NumberDiscountPurchase(){
        this("",0,0,0);
    }
    //getters and setters


    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }
    //methods

    public double getCost(){
        return super.price*this.number*(1-this.discount/100);
    }


}
