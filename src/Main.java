public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int kilogramWeight = 98;
        double metersHeight = 1.87;
        int index = service.calculate (kilogramWeight, metersHeight);
        System.out.println(index);
    }
}