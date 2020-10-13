
import java.util.Scanner;

public class SeparatingCharacters {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = reader.nextLine();
        //System.out.println("name length: "+ name.length());
        int length = name.length();
        int i = 0;
        int j = 1;
        while(i < length){
            System.out.println(j+". " + "character: " + name.charAt(i));
            i++;
            j++;
        }
    }
}
