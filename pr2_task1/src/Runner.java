import by.gsu.pms.*;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Runner {
    public static void main(String[] args) throws IOException{

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
        String token1 = "";

        // create Scanner inFile1
        Scanner inFile1 = new Scanner(new File("in.txt")).useDelimiter(",\\s*");

        // Original answer used LinkedList, but probably preferable to use ArrayList in most cases
        // List<String> temps = new LinkedList<String>();
        List<String> temps = new ArrayList<String>();

        // while loop
        while (inFile1.hasNext()) {
            // find next line
            token1 = inFile1.next();
            temps.add(token1);
        }
        inFile1.close();

        String[] tempsArray = temps.toArray(new String[0]);

        for (String s : tempsArray) {
            System.out.println(s);
        }
    }
}
