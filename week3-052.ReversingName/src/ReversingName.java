import java.util.Scanner;

public class ReversingName {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = reader.nextLine();
        //System.out.println(name.charAt(name.length()-3));
        int i = name.length();
        //System.out.println(i);
        String reverse = "";
        while(i >= 1){
            reverse = reverse + name.charAt(i-1);
            //System.out.println(name.charAt(i-1));
            i --;
        }
        System.out.println(reverse);
        
    }
}
