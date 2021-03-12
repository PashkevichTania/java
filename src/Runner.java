import by.gsu.mslab.*;

public class Runner {

    public static void main(String[] args) {
	 Material steel = new Material("steel", 100);
	 Subject wire = new Subject("wire",10,steel);
	 System.out.println(wire.toString());
    }
}
