package by.gsu.pms;

public class Purchase {
    //fields
    private String name;
    private double price;
    private int number;

    //constructors
    public Purchase(String name, double price, int number){
        super();
        this.name = name;
        this.number = number;
        this.price = price;
    }
    public Purchase(){
        this("",0,0);
    }
    //getters and setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    //methods

    public double getCost(){
        return this.price*this.number;
    }

    @Override
    public String toString(){
        return (name + ";" + price + ";" + number + ";" + getCost());
    }

    public boolean equals(Purchase purchase){
        return (this.name == purchase.getName() && this.price == purchase.getPrice());
    }
}
