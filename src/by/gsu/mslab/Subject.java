package by.gsu.mslab;

public class Subject {

    private String name;
    private float volume;

    //HAS A relation
    private Material material;

    public Subject(String name, float volume, Material material){
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

    public float getVolume() {
        return volume;
    }

    public void setVolume(float volume) {
        this.volume = volume;
    }

    public Material getMaterial() {
        return material;
    }

    public void setMaterial(Material material) {
        this.material = material;
    }

    public float getMass(){
        return material.getDensity()*this.volume;
    }
    @Override
    public String toString() {
        return name + ";" + material + ";" + volume + ";" + getMass();
    }
}
