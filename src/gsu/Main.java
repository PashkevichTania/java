package gsu;

public class Main {

    public static void main(String[] args) {
        Employee[] employees = {

                new Employee("Sakovich", 4500, true ),
                null,
                new Employee("Song", 5000, true),
                new Employee("Hudson", 3000, true),
                new Employee("Jhonson", 15000, false),
                new Employee("Kovalchek", 4000, false),
                new Employee("Milka", 7000, false),
                new Employee("Ovalov", 6000, true),
                new Employee("Volchek", 1000, false),
                new Employee(),
        };

        int totalPayment = 0;
        int totalKids = 0;

        for (Employee employee : employees){
            if (employee != null){
                totalPayment+=employee.getPayment();
                if (employee.haveKids()){
                    totalKids+=1;
                }
            }
        }
        int averagePayment = totalPayment/ employees.length;
        System.out.println("Average payment = " + averagePayment);
        System.out.println("Employees with kids = " + totalKids);
    }
}
