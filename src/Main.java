public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int weight = 77;
        double height = 1.95;
        System.out.println("Индекс массы тела: " + (service.calculate(weight, height)));
    }
}