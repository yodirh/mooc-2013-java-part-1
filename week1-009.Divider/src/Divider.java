
import java.util.Scanner;

public class Divider {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        // Implement your program here. Remember to ask the input from user.
        System.out.println("Enter first number: ");
        int num1 = Integer.parseInt(reader.nextLine());
        System.out.println("Enter second number: ");
        int num2 = Integer.parseInt(reader.nextLine());
        double num3 = (double)num1 / num2;
        System.out.println("Division: " + num1 +"/"+ num2 +"="+ num3);
    }
}
