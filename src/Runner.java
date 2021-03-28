import by.gsu.pms.*;

import java.util.Arrays;

public class Runner {

    public static void main(String[] args) {
        Commodity commodity = new Commodity("Milky Way",3000);

        AbstractPurchase[] purchases = {
                new PriceDiscountPurchase(commodity, 10, 60),
                new PriceDiscountPurchase(commodity, 12, 50),
                new PercentDiscountPurchase(commodity, 1, 5),
                new PercentDiscountPurchase(commodity, 6, 30),
                new TransportExpensesPurchase(commodity, 40, 300),
                new TransportExpensesPurchase(commodity, 200, 150),
        };

        for (AbstractPurchase purchase: purchases) {
            System.out.println(purchase);
        }

        Arrays.sort(purchases);
        AbstractPurchase minCostPurchase = purchases[0];

        System.out.println("sorted:");
        for (AbstractPurchase purchase: purchases) {
            System.out.println(purchase);
            if(minCostPurchase.compareTo(purchase) < 0){
                minCostPurchase = purchase;
            }
        }
        System.out.println("minCostPurchase:");
        System.out.println(minCostPurchase);
        purchases[0].view();
    }
}
