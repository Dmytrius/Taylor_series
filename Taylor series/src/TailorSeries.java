public class TailorSeries {


    public double getTailorSeries(int fact, double sum, double start, int iter) {
        double term;
        for (int i = 1; i < iter; i++) {
            fact *= i;
            term = Math.pow(start, i) / fact;
            sum += term;
        }
        return sum;
    }
}
