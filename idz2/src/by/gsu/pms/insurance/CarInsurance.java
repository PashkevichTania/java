package by.gsu.pms.insurance;

import java.time.Year;

public class CarInsurance extends AbstractInsurance{

    private String carMark;

    public CarInsurance(String carMark) {
        this.carMark = carMark;
    }
    public CarInsurance(String carMark, String id, Year year, int cost, double risk) {
        super(id, year, cost, risk);
        this.carMark = carMark;
    }

    public String getCarMark() {
        return carMark;
    }

    public void setCarMark(String carMark) {
        this.carMark = carMark;
    }

    @Override
    public String toString() {
        return this.carMark + ";" +  this.getYear() + ";" + this.getCost() + ";" + this.getRisk();
    }
}
