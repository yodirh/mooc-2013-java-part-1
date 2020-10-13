
import java.util.Scanner;


public class TheSumBetweenTwoNumbers {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("First: ");
        int number1 = Integer.parseInt(reader.nextLine());
        System.out.println("Last: ");
        int number2 = Integer.parseInt(reader.nextLine());
        //int i = 1;
        int sum = 0;
        while (number1 <= number2){
            sum = sum + number1;
            number1 ++;
            
        }
        System.out.println(sum);
        
    }
}
