package by.gsu.mslab;

public class Material {
    //fields

    private String name;
    private int density;

    //constructors

    public Material() {
        this("",0);
    }
    public Material(String name, int density) {
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

    public int getDensity() {
        return density;
    }

    public void setDensity(int density) {
        this.density = density;
    }
}
