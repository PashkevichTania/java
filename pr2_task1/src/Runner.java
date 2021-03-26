import by.gsu.pms.*;
import java.io.*;
import java.util.Locale;
import java.util.Scanner;

public class Runner {
    public static void main(String[] args){
        Purchase maxCostPurchase = new Purchase();
        boolean isAllEqual= true;

        try(Scanner scanner = new Scanner(new FileReader("E:\\programming\\java\\java\\pr2_task1\\src\\in.txt"))){
            scanner.useLocale(Locale.ENGLISH);
            Purchase[] purchases = {

                    new Purchase("milk",30,1),
                    new Purchase("milk",30,3),
                    new Purchase("milk",40,1),
                    new Purchase("almond milk",230,1),
                    new DiscountPurchase("pringles",250,1,10),
                    new NumberDiscountPurchase("nutella",500,20,5.825),
                    MyScanner.getClassFromFile(scanner),
            };
            for (Purchase purchase : purchases) {
                if (purchase != null){
                    System.out.println(purchase);
                    if (maxCostPurchase.getCost() < purchase.getCost()) {
                        maxCostPurchase = purchase;
                    }
                    if (!purchase.equals(purchases[0])) {
                        isAllEqual = false;
                    }
                }
            }
            if (isAllEqual) {
                System.out.println("All equal");
            } else {
                System.out.println("All not equal");
            }
            System.out.println("Max cost = "+ maxCostPurchase);
        }
        catch (FileNotFoundException e){
            System.err.println("File not found");
        }

}
}
