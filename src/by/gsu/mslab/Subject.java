package by.gsu.mslab;

public class Subject {

    private String name;
    private int volume;

    //HAS A relation
    private Material material;

    public Subject(){
        this.material=new Material();
    }

}
