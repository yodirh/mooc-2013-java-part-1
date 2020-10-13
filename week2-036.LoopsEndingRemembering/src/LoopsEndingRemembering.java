import java.util.Scanner;

public class LoopsEndingRemembering {
    public static void main(String[] args) {
        // program in this project exercises 36.1-36.5
        // actually this is just one program that is split in many parts
        
        Scanner reader = new Scanner(System.in);
        System.out.println("Type numbers: ");
        int sum = 0;
        int i = 0;
        int even = 0;
        int odd = 0;
        
        while (true){
            //System.out.println("Type numbers: ");
            i++;
            int num = Integer.parseInt(reader.nextLine());
            if (num != -1&& num%2==0){
                even ++;                
            }else if(num != -1&& num%2!=0) {
                odd ++;
            }if (num == -1) {
                System.out.println("Thank you and see you later!");
                break;     
            }           
            
            sum = sum + num;
            
        }        
        System.out.println("The sum is " + sum);
        i = i -1;
        System.out.println("How many numbers: " + i);
        //double avg = (double)sum/i;
        System.out.println("Average: "+ (double)sum/i);
        System.out.println("Even number: " + even);
        System.out.println("odd number: " + odd);
        

    }
}
