
import java.util.Scanner;

public class Adder {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int num1 = Integer.parseInt(reader.nextLine());
        System.out.println("Enter second number: ");
        int num2 = Integer.parseInt(reader.nextLine());
        int num3 = num1 + num2;
        System.out.println("Sum of the numbers: " + num3);

        // Implement your program here. Remember to ask the input from user
    }
}
