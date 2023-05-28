public class BmiService {
    public int calculate(double heightMeter, int weightKg) {

        double bmi = weightKg / (heightMeter * heightMeter);
        int x = (int) bmi;
        return x;
    }
}
