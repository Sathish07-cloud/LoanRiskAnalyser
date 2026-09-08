public class RiskCalculator {
    int calculateRisk(Customer customer) {

        int score = 0;

        if (customer.age < 25) {
            score += 10;
        } else if (customer.age >= 60) {
            score += 15;
        }

        if (customer.income < 20000) {
            score += 25;
        } else if (customer.income < 40000) {
            score += 15;
        } else {
            score += 5;
        }

        if (customer.creditScore < 500) {
            score += 30;
        } else if (customer.creditScore < 700) {
            score += 15;
        } else {
            score += 5;
        }

        if (customer.loans >= 3) {
            score += 20;
        } else if (customer.loans == 2) {
            score += 10;
        } else if (customer.loans == 1) {
            score += 5;
        }

        if (customer.missedPayments >= 5) {
            score += 25;
        } else if (customer.missedPayments >= 2) {
            score += 15;
        } else if (customer.missedPayments == 1) {
            score += 5;
        }

        return score;
    }

    String getRiskLevel(int score) {

        if (score >= 70) {
            return "HIGH RISK";
        } else if (score >= 40) {
            return "MEDIUM RISK";
        } else {
            return "LOW RISK";
        }
    }

    
}
