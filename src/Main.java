public class Main {
    public static void main(String[] args) {
        CreditCalculatorService service = new CreditCalculatorService();
        double percentPerYear = 9.99;

        long creditPaymetn1Year = service.calculate(1_000_000, percentPerYear, 1 * 12);
        System.out.println("ежемесячный платеж по кредиту на 1 000 000 руб. сроком на 1 год " + creditPaymetn1Year + " руб под " + percentPerYear + "% годовых");

        long creditPaymetn2Year = service.calculate(1_000_000, 9.99, 2 * 12);
        System.out.println("ежемесячный платеж по кредиту на 1 000 000 руб. сроком на 1 год " + creditPaymetn2Year + " руб под " + percentPerYear + "% годовых");

        long creditPaymetn3Year = service.calculate(1_000_000, 9.99, 3 * 12);
        System.out.println("ежемесячный платеж по кредиту на 1 000 000 руб. сроком на 1 год " + creditPaymetn3Year + " руб под " + percentPerYear + "% годовых");
    }
}