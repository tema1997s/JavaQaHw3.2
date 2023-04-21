public class BmiService {
    public int calculate(int weight, double height) {
        double result = weight / Math.pow(height, 2);
        int index = (int) result;
        return index;

    }
}
