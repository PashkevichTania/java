package by.gsu.mslab;

public class Material {
    //fields

    private String name;
    private double density;

    //constructors

    public Material() {
        this("",0);
    }
    public Material(String name, double density) {
        super();
        this.name = name;
        this.density = density;
    }

    //getters and setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getDensity() {
        return density;
    }

    public void setDensity(double density) {
        this.density = density;
    }

    @Override
    public String toString() {
        return name + ";" + density;
    }
}
