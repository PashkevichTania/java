import by.gsu.pms.insurance.*;
import by.gsu.pms.insurance.AbstractInsurance;
import by.gsu.pms.client.Client;

import java.time.Year;
import java.util.Arrays;


public class Runner {
    public static void main(String[] args) {
        AbstractInsurance[] insurances = {
                new CarInsurance("Touota", "1111", Year.of(2021), 5000, 0.6),
                new CarInsurance("Smart", "4232", Year.of(2021), 15000, 0.3),
                new FlatInsurance("Ogorenko7",400, "8775", Year.of(2020), 30000, 0.5),
                new FlatInsurance("Sviridova8",600, "4338", Year.of(2020), 10000, 0.2),
        };
        Client[] clients = {
                new Client("Ivanov Ivan Ivanovich", Year.of(1960)),
                new Client("Petrov Ivan Ivanovich", Year.of(1970)),
                new Client("Slivcev Ivan Ivanovich", Year.of(1980)),
                new Client("Yakovlev Ivan Ivanovich", Year.of(1990)),
        };
        Derivative[] derivatives = {
                new Derivative(clients[0], insurances[0]),
                new Derivative(clients[1], insurances[1]),
                new Derivative(clients[2], insurances[2]),
                new Derivative(clients[3], insurances[3]),
        };
        Arrays.sort(insurances);
        for (AbstractInsurance insurance: insurances) {
            System.out.println(insurance);
        }
        for (Derivative derivative: derivatives) {
            System.out.println(derivative);
        }
        System.out.println("derivatives that cost more than 6000 and with risk more than 0.3: ");
        for (Derivative derivative: derivatives) {
            if (derivative.getInsurance().getRisk()>0.3 && derivative.getInsurance().getCost()>6000 ){
                System.out.println(derivative);
            }
        }
        }
    }