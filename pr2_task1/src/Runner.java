import by.gsu.pms.*;

public class Runner {
    public static void main(String[] args) {

        Purchase[] purchases = {

            new Purchase("milk",30,1),
            new Purchase("milk",30,3),
            new Purchase("milk",40,1),
            new Purchase("almond milk",230,1),

    };

    for (Purchase purchase : purchases) {
        if (purchase != null){
            System.out.println(purchase);
        }
    }
    System.out.println(purchases[0].equals(purchases[1]));
    System.out.println(purchases[0].equals(purchases[2]));
}
}
