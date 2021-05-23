package by.gsu.pms;


public class Car {

    private int id;
    private String mark;
    private String model;
    private int year;
    private String color;
    private int price;
    private int registrationNumber;

    public Car() {
        this.id = 0;
        this.mark = "";
        this.model = "";
        this.year = 0;
        this.color = "";
        this.price = 0;
        this.registrationNumber = 0;
    }

    public Car(int id, String mark, String model, int year, String color, int price, int registrationNumber) {
        this.id = id;
        this.mark = mark;
        this.model = model;
        this.year = year;
        this.color = color;
        this.price = price;
        this.registrationNumber = registrationNumber;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if (year > 0) {
            this.year = year;
        } else System.out.println("Год выпуска не может быть отрицательным или нулевым");
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        if (price > 0) {
            this.price = price;
        } else System.out.println("Цена не может быть отрицательной или нулевой");
    }

    public int getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(int registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    @Override
    public String toString() {
        return "Машина " +
                "id=" + id +
                ", Марка=" + mark +
                ", Модель=" + model +
                ", Год выпуска=" + year +
                ", Цвет=" + color +
                ", Цена=" + price +
                ", Регистрационный норм=" + registrationNumber;
    }
}