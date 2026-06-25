public class FinancialForecastIterative {

    public static double forecast(double value, double rate, int years) {
        for (int i = 0; i < years; i++) {
            value = value * (1 + rate);
        }
        return value;
    }
    public static void main(String[] args) {
        double initialValue = 1000;
        double growthRate = 0.10;
        int years = 5;

        double result = forecast(initialValue, growthRate, years);
        System.out.println(result);
    }
}