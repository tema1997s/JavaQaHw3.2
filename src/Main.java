public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int m = 80;
        double h = 1.95;
        System.out.println(service.calculate( m, h));
    }
}