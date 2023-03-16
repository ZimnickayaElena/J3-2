public class BmiService {
    public int calculate (int kilogramWeight, double metersHeight) {
        double result = kilogramWeight / (metersHeight * metersHeight);

        return (int)result;
    }
}
