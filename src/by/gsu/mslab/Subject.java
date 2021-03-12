package by.gsu.mslab;

public class Subject {

    private String name;
    private int volume;

    //HAS A relation
    private Material material;

    public Subject(String name, int volume, Material material){
        this.material = material;
        this.name = name;
        this.volume =volume;
    }

    //getters / setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public Material getMaterial() {
        return material;
    }

    public void setMaterial(Material material) {
        this.material = material;
    }

    public int getMass(){
        return material.getDensity()*this.volume;
    }
    @Override
    public String toString() {
        return name + ";" + material + ";" + volume + ";" + getMass();
    }
}
