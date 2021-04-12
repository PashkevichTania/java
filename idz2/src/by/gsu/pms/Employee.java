package by.gsu.pms;

import java.io.Serializable;
import java.util.Scanner;

public class Employee implements Serializable {

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

    public Employee(Scanner scanner){
        this(scanner.next(), scanner.nextInt(), scanner.nextBoolean());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPayment() {
        return payment;
    }

    public void setPayment(int payment) {
        this.payment = payment;
    }

    public boolean haveKids() {
        return kids;
    }

    public void setKids(boolean kids) {
        this.kids = kids;
    }

    @Override
    public String toString() {
        return name + ";" + payment + ";" + kids + ";";
    }
}
