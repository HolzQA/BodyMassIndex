public class BmiService {
    public double calculate(int mass, double height) {
        double result = (double) mass / Math.pow((height/100), 2);
        return (int) result;
    }
}
