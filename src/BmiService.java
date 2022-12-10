public class BmiService {
    public double calculate(int m, double h) {
        double result = (double) m / Math.pow((h/100), 2);
        return (int) result;
    }
}
