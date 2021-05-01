package by.gsu.pms.client;

import java.time.Year;

public class Client {

    private String name;
    private Year yearOfBirth;

    public Client(String name, Year yearOfBirth) {
        this.name = name;
        this.yearOfBirth = yearOfBirth;
    }

    public Client() {
        this("", Year.of(0));
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Year getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(Year yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    @Override
    public String toString() {
        return this.name + ";" + this.yearOfBirth;
    }
}
