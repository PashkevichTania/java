import by.gsu.pms.*;
import java.io.*;
import java.util.Locale;
import java.util.Scanner;

public class Runner {
    public static void main(String[] args){

        Purchase[] purchases = {

            new Purchase("milk",30,1),
            new Purchase("milk",30,3),
            new Purchase("milk",40,1),
            new Purchase("almond milk",230,1),

    };
        DiscountPurchase pringles = new DiscountPurchase("pringles",250,1,10);
        NumberDiscountPurchase nutella = new NumberDiscountPurchase("nutella",500,20,5.825);

    for (Purchase purchase : purchases) {
        if (purchase != null){
            System.out.println(purchase);
        }
    }
    System.out.println(purchases[0].equals(purchases[1]));
    System.out.println(purchases[0].equals(purchases[2]));
    System.out.println(pringles);
    System.out.println(nutella);

        try(Scanner scanner = new Scanner(new FileReader("E:\\programming\\java\\java\\pr2_task1\\src\\in.txt"))){
            scanner.useLocale(Locale.ENGLISH);
            System.out.println(MyScanner.getClassFromFile(scanner));
        }
        catch (FileNotFoundException e){
            System.err.println("File not found");
        }

}
}
