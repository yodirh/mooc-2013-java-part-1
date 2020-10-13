
import java.util.Scanner;

public class BiggerNumber {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        // Implement your program here. Remember to ask the input from user
        System.out.println("Enter first number: ");
        int num1 = Integer.parseInt(reader.nextLine());
        System.out.println("Enter second number: ");
        int num2 = Integer.parseInt(reader.nextLine());
        System.out.println("The bigger number of the two numbers given was: " + Math.max(num1, num2));
        /*
        if(num1 > num2) {
            System.out.println("The bigger number of the two numbers given was: " + num1);
        }
        else {
            System.out.println("The bigger number of the two numbers given was: " + num2);
        }*/
    }
}
