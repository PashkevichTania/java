import by.gsu.pms.*;
import java.util.Arrays;
import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Car[] carList = Methods.carsList();
        
        // Car[] carList = Methods.car();
        System.out.println("a)Вывести список автомобилей заданной марки.");
        System.out.print("Введите марку автомобиля: ");
        Methods.checkMark(carList, scanner.next());

        System.out.println("b)Введите список автомобилей заданной модели, которые эксплуатируются больше n лет.");
        System.out.print("Введите модель автомобиля: ");
        String model = scanner.next();
        System.out.print("Введите количетво лет эксплуатации: ");
        Methods.checkModel(carList, model, scanner.nextInt());

        System.out.println("c)Вывести список автомобилей заданного года выпуска, цена которых больше указанной.");
        System.out.print("Введите год выпуска: ");
        int year = scanner.nextInt();
        System.out.print("Введите цену: ");
        Methods.checkYear(carList, year, scanner.nextInt());
    }

}