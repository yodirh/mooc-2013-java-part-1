
import java.util.Scanner;

public class AgeCheck {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("How old are you: ");
        int age = Integer.parseInt(reader.nextLine());
        
        if (0<=age && age <=120 ){       
            System.out.println("ok");
        }
        else{
            System.out.println("Impossible!");
        }
    }
}
