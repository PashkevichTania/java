import by.gsu.pms.BuisnessTripExpenses;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.*;

public class Runner {
    public static void main(String[] args) {
        final String INPUT_FILE = "E:\\programming\\java\\java\\pr3\\src\\in.txt";

        final String RATE_KEY = "rate";
        final String INDICES_KEY = "indices";
        final String ACCOUNT_KEY = "account%02d";
        final String TRANSPORT_KEY = "transport%02d";
        final String DAYS_KEY = "days%02d";

        try (FileInputStream fileInputStream = new FileInputStream(INPUT_FILE)) {
            ResourceBundle resourceBundle = new PropertyResourceBundle(fileInputStream);

            String[] indices = resourceBundle.getString(INDICES_KEY).split("\\s*;\\s*");
            BuisnessTripExpenses[] buisnessTripExpenses = new BuisnessTripExpenses[indices.length];

            String rate = resourceBundle.getString(RATE_KEY);

            BuisnessTripExpenses.setRate(Integer.parseInt(rate));

            for (int i = 0; i < buisnessTripExpenses.length; i++) {
                int index = Integer.parseInt(indices[i]);
                buisnessTripExpenses[i] = new BuisnessTripExpenses(resourceBundle.getString(String.format(ACCOUNT_KEY, index)),
                        Integer.parseInt(resourceBundle.getString(String.format(TRANSPORT_KEY, index))),
                        Integer.parseInt(resourceBundle.getString(String.format(DAYS_KEY, index))));

            }

            Arrays.sort(buisnessTripExpenses);

            for (BuisnessTripExpenses businessTrip: buisnessTripExpenses) {
                System.out.println(businessTrip);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}