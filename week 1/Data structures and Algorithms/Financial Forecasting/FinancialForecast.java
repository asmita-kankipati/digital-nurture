public class FinancialForecast {

    public static double forecast(double value, double rate, int years) {
        if (years == 0) {
            return value;
        }
        return forecast(value, rate, years - 1) * (1 + rate);
    }

    public static void main(String[] args) {
        double initialValue = 1000;
        double growthRate = 0.10;
        int years = 5;

        double result = forecast(initialValue, growthRate, years);
        System.out.println(result);
    }
}