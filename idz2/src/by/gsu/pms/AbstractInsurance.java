package by.gsu.pms;

import java.time.Year;

public class AbstractInsurance implements Comparable<AbstractInsurance> {

    private Year year;
    private int cost;
    private double risk;

    protected AbstractInsurance() {

    }

    protected AbstractInsurance(Year year, int cost, double risk) {
        this.year = year;
        this.cost = cost;
        this.risk = risk;
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
        return this.year + ";" + this.cost + ";" + this.risk;
    }

}
