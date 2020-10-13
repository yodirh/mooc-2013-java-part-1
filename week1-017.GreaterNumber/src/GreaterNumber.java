import java.util.Scanner;

public class GreaterNumber {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int num1 = Integer.parseInt(reader.nextLine());
        
        System.out.println("Enter second number: ");
        int num2 = Integer.parseInt(reader.nextLine());
        
        if (num1 == num2) {
            System.out.println("The numbers are equal!");
            
        }
        else{
            System.out.println("Greater number: " + Math.max(num1, num2));
        }

    }
}
