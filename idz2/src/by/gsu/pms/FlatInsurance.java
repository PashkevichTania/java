package by.gsu.pms;

import java.time.Year;

public class FlatInsurance extends AbstractInsurance {

    private String name;

    public FlatInsurance(String name) {
        this.name = name;
    }

    public FlatInsurance(Year year, int cost, double risk, String name) {
        super(year, cost, risk);
        this.name = name;
    }

}
