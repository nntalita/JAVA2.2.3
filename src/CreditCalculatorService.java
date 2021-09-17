public class CreditCalculatorService {
    public long calculate(long creditAmount, double interestRate, long sumOfMonths) {
        double interestRateMonth = interestRate / (12 * 100);
        return (long) Math.round((creditAmount * interestRateMonth) / (1 - Math.pow((1 + interestRateMonth), -sumOfMonths)));
    }
}