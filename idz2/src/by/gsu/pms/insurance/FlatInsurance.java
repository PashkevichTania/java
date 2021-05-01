package by.gsu.pms.insurance;

import java.time.Year;

public class FlatInsurance extends AbstractInsurance {

    private String address;
    private double area;

    public FlatInsurance(String address, double area) {
        this.address = address;
        this.area = area;
    }

    public FlatInsurance(String address, double area, String id, Year year, int cost, double risk) {
        super(id, year, cost, risk);
        this.address = address;
        this.area = area;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return this.address + ";" + this.area + ";" + this.getYear() + ";" + this.getCost() + ";" + this.getRisk();
    }

}
