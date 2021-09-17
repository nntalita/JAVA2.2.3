public class CreditCalculatorService {
    public long calculate(long creditAmount, double interestRate, long sumOfMonths) {
        double interestRateMonth = interestRate / (12 * 100);
        long monthlyPayment = (long) Math.round((creditAmount * interestRateMonth) / (1 - Math.pow((1 + interestRateMonth), 0 - sumOfMonths)));
        return monthlyPayment;
    }
}