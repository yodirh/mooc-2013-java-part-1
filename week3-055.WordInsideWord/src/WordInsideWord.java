
import java.util.Scanner;

public class WordInsideWord {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type first word: ");
        String word1= reader.nextLine();
        System.out.println("Type second word: ");
        String word2= reader.nextLine();
        int index = word1.indexOf(word2);
        System.out.println(index);
        if (word1.indexOf(word2) >= 0){
            System.out.println("The word "+"'"+word2+"'" + " is found in the word "+ "'"+word1+"'");
        }else {
            System.out.println("The word "+"'"+word2+"'" + " is not found in the word "+ "'"+word1+"'");
        }
    }
}
