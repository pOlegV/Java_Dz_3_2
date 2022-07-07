public class BmiService {
    public double calculate(double rost, double ves) {
        double index = ves / (rost * rost);
        return index;
    }
}
