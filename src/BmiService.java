public class BmiService {
    public int calculate (int m, double h) {
        double c = h * h;
        double result = m / c;
        int index = (int) result;
        return index;

    }
}
