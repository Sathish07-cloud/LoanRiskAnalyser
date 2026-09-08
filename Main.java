import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("RISK PREDICTION SYSTEM");

        System.out.print("Enter customer name: ");
        String name = sc.nextLine();

        System.out.print("Enter age: ");
        int age = sc.nextInt();

        System.out.print("Enter monthly income: ");
        double income = sc.nextDouble();

        System.out.print("Enter credit score: ");
        int creditScore = sc.nextInt();

        System.out.print("Enter number of loans: ");
        int loans = sc.nextInt();

        System.out.print("Enter missed payments: ");
        int missedPayments = sc.nextInt();

        Customer customer = new Customer(
            name, age, income, creditScore, loans, missedPayments
        );

        RiskCalculator calculator = new RiskCalculator();

        int riskScore = calculator.calculateRisk(customer);
        String riskLevel = calculator.getRiskLevel(riskScore);

        System.out.println();
        System.out.println("Risk Score: " + riskScore);
        System.out.println("Risk Level: " + riskLevel);

        sc.close();
    }
}