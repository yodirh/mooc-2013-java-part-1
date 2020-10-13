
public class Greatest {

    public static int greatest(int number1, int number2, int number3) {
        int grt1 = Math.max(number1, number2);
        int grt2 = Math.max(number3, grt1);

        return grt2;
    }

    public static void main(String[] args) {
        int result = greatest(2, 7, 3);
        System.out.println("Greatest: " + result);
    }
}
