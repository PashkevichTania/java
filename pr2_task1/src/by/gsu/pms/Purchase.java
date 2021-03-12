package by.gsu.pms;

public class Purchase {
    private String name;
    private double price;
    private int number;

    public Purchase(String name, double price, int number){
        super();
        this.name = name;
        this.number = number;
        this.price = price;
    }
    public Purchase(){
        this("",0,0);
    }
}
