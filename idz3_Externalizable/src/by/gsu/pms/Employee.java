package by.gsu.pms;

import java.io.*;
import java.util.Scanner;

public class Employee implements Externalizable {

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

    @Override
    public void writeExternal(ObjectOutput objectOutput) throws IOException {
        objectOutput.writeObject(this.name);
        objectOutput.writeObject(this.payment);
        objectOutput.writeObject(this.kids);
    }

    @Override
    public void readExternal(ObjectInput objectInput) throws IOException, ClassNotFoundException {
        this.name = (String)objectInput.readObject();
        this.payment = (Integer) objectInput.readObject();
        this.kids = (Boolean) objectInput.readObject();
    }
}