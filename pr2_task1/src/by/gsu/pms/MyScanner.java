package by.gsu.pms;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class MyScanner {
    public enum PurchasesKinds {
        GENERAL_PURCHASE, DISCOUNT_PURCHASE, NUMBER_DISCOUNT_PURCHASE
    }
    List<String> temps = new ArrayList<String>();


    public Purchase getClassFromFile(Scanner sc) {


        String id = sc.next();

        PurchasesKinds kind = PurchasesKinds.valueOf(id);

        return switch (kind) {
            case GENERAL_PURCHASE -> new Purchase();
            case DISCOUNT_PURCHASE -> new DiscountPurchase();
            case NUMBER_DISCOUNT_PURCHASE -> new NumberDiscountPurchase();
        };

    }

}
