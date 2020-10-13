//@MoFo

public class StringUtils {
    
    //to check searched word contained in the word(in the title or publisher)
    public static boolean included(String word, String searched){
        
        if (word.toLowerCase().contains(searched.trim().toLowerCase()))
            return true;
        else{
            return false;
        }
    }
}
