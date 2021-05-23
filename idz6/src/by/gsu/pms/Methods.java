package by.gsu.pms;

import java.util.Scanner;

public class Methods {
    public static Car[] carsList(){
        Scanner scanner1 = new Scanner(System.in);
        System.out.print("Введите количество автомобилей: ");
        Car[] cars = new Car[scanner1.nextInt()];
        for (int i = 0; i < cars.length; i++) {
            cars[i] = new Car();
            System.out.println();
            System.out.print("Введите id: ");
            cars[i].setId(scanner1.nextInt());
            System.out.print("Введите марку: ");
            cars[i].setMark(scanner1.next());
            System.out.print("Введите модель: ");
            cars[i].setModel(scanner1.next());
            System.out.print("Введите год выпуска: ");
            cars[i].setYear(scanner1.nextInt());
            System.out.print("Введите цвет: ");
            cars[i].setColor(scanner1.next());
            System.out.print("Введите цену: ");
            cars[i].setPrice(scanner1.nextInt());
            System.out.print("Введите регистрационный номер: ");
            cars[i].setRegistrationNumber(scanner1.nextInt());
        }

        return cars;
    }

    public static Car[] car(){
        Car[] cars = new Car[3];
        cars[0]= new Car(0,"BMV","X5",2005,"black",2100,2134);
        cars[1]= new Car(1,"Mazda","X2",2001,"white",1500,1649);
        cars[2]= new Car(2,"Toyota","X2",2009,"blue",2990,3452);


        return cars;
    }

    public static void checkMark(Car[] cars,String marka){
        for (Car car : cars) {
            if(car.getMark().equals(marka))
                System.out.println(car.toString());
        }
        System.out.println();
    }

    public static void checkModel(Car[] cars,String model,int n){
        for (Car car : cars) {
            if(car.getModel().equals(model) && (2021-car.getYear())>n){
                System.out.println(car.toString());
            }
        }
        System.out.println();
    }

    public static void checkYear(Car[] cars,int year, int price){
        for (Car car : cars) {
            if(car.getYear()==year && car.getPrice()>price)
                System.out.println(car.toString());
        }
    }
}
