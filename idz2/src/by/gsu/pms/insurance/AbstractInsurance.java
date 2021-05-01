package by.gsu.pms.insurance;

import java.time.Year;

public class AbstractInsurance implements Comparable<AbstractInsurance> {


    private String id;
    private Year year;
    private int cost;
    private double risk;

    protected AbstractInsurance() {

    }

    protected AbstractInsurance(String id, Year year, int cost, double risk) {
        this.id = id;
        this.year = year;
        this.cost = cost;
        this.risk = risk;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Year getYear() {
        return year;
    }

    public void setYear(Year year) {
        this.year = year;
    }

    public Integer getCost() {
        return cost;
    }

    public void setCost(Integer cost) {
        this.cost = cost;
    }

    public Double getRisk() {
        return risk;
    }

    public void setRisk(Double risk) {
        this.risk = risk;
    }

    @Override
    public int compareTo(AbstractInsurance insurance) {
        return getRisk().compareTo(insurance.getRisk());
    }

    @Override
    public String toString() {
        return this.id + ";" + this.year + ";" + this.cost + ";" + this.risk;
    }

}
