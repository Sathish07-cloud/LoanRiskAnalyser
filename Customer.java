public class Customer {

    String name;
    int age;
    double income;
    int creditScore;
    int loans;
    int missedPayments;

    Customer(String name, int age, double income, int creditScore, int loans, int missedPayments) {
        this.name = name;
        this.age = age;
        this.income = income;
        this.creditScore = creditScore;
        this.loans = loans;
        this.missedPayments = missedPayments;
    }

    void displayCustomer() {
        System.out.println("Customer Name   : " + name);
        System.out.println("Age             : " + age);
        System.out.println("Monthly Income  : " + income);
        System.out.println("Credit Score    : " + creditScore);
        System.out.println("Existing Loans  : " + loans);
        System.out.println("Missed Payments : " + missedPayments);
    }
}