
import java.util.Scanner;

public class SumOfThePowers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = Integer.parseInt(reader.nextLine());
        int i = 0;
        int sum = 0;
        while(i <= num) {
            int result = (int)Math.pow(2, i);
            sum = sum + result;
            i++;
            
            
        }
        
        System.out.println("The result is "+ sum);

    }
}
