package gsu;

public class Employee {

    private String name;
    private int payment;
    private boolean kids;

    public Employee() {
        this("",0, false);
    }
    public Employee(String name, int payment, boolean kids) {
        super();
        this.name = name;
        this.payment = payment;
        this.kids = kids;
    }
    public Employee(String name, int payment) {
        this.name = name;
        this.payment = payment;
        this.kids = false;
    }

}
