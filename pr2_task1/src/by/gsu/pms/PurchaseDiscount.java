package by.gsu.pms;

public class PurchaseDiscount extends Purchase{
    private int discount;

    //constructors
    public PurchaseDiscount(String name, double price, int number, int discount){
        super(name,price,number);
        this.discount = discount;
    }
    public PurchaseDiscount(){
        this("",0,0,0);
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
        return super.price*this.number*this.discount/100;
    }

    @Override
    public String toString(){
        return (name + ";" + price + ";" + number + ";" + getCost());
    }

}
