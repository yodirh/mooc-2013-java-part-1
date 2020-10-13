
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        NumberStatistics stats = new NumberStatistics();
        NumberStatistics even = new NumberStatistics();
        NumberStatistics odd = new NumberStatistics();
        
        System.out.println("Type numbers: ");
        while (true){
            int num = Integer.parseInt(reader.nextLine());
            if (num == -1){
                break;
            }
            else if (num % 2 == 0){
                even.addNumber(num);
                stats.addNumber(num);
            }else if(num % 2!= 0){
                odd.addNumber(num);
                stats.addNumber(num);
            }
            
        }
               
        //System.out.println("Amount: " + stats.amountofNumbers());
        System.out.println("sum: " + stats.sum());
        System.out.println("sum of even: " + even.sum());
        System.out.println("sum of odd: " + odd.sum());
        
        
    }
}
