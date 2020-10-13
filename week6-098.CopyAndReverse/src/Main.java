
import java.util.Arrays;



public class Main {
    
    public static int[] copy(int[] array){
        int[] copied = new int[array.length];
        for(int i = 0 ; i<array.length; i++){
            copied[i] = array[i];
        }
        return copied;
    }
    
    public static int[] reverseCopy(int[] array){
        int m = array.length -1;
        int [] rvscpy = new int[array.length];
        for ( int i = 0; i<array.length; i ++ ){
            rvscpy[i] = array[m];
            m--;
        }
        return rvscpy;
    }

    public static void main(String[] args) {
        // write testcode here
        int[] original = {1, 2, 3};
        int [] copied = copy(original);
        int [] reversed = reverseCopy(original);
        
        System.out.println("original: " + Arrays.toString(original));
        System.out.println("reversed: " + Arrays.toString(reversed));
    }
    
}
