
import java.util.Scanner;

public class SumOfTheAges {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        // Implement your program here
        System.out.println("Type your Name: ");
        String name1 = reader.nextLine();
        System.out.println("Enter your age: ");
        int age1 = Integer.parseInt(reader.nextLine());
        System.out.println("Type your Name: ");
        String name2 = reader.nextLine();
        System.out.println("Enter your age: ");
        int age2 = Integer.parseInt(reader.nextLine());
        
        System.out.println(name1 +" and "+ name2+ " are "+ (age1+age2) + " years old in total");
        
        
    }
}
