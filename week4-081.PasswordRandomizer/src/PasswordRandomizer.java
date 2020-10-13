//@MoFo

import java.util.Random;

public class PasswordRandomizer {

    // Define the variables
    private int length;
    private Random random;

    public PasswordRandomizer(int length) {
        // Initialize the variable
        this.length = length;
        random = new Random();
    }
    
    //Create random password, while password length can't be negative. 
    public String createPassword() {
        
        String S = "";
        while (length > 0) {
            int number = random.nextInt(26);
            char symbol = "abcdefghijklmnopqrstuvwxyz".charAt(number);
            String s1 = Character.toString(symbol);
            S = S + s1;
            if (S.length() == length){
                break;
            }
        } 
        return S;
    }
}
