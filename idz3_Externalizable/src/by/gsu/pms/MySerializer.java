package by.gsu.pms;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class MySerializer {
    private MySerializer(){}

    public static void serialize(Employee[] employees, String file) {
        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(file))) {
            outputStream.writeObject(employees);
        } catch (Exception e) {
        }
    }
}
