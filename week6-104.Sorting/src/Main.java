
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        // write testcode here

        int[] values = {8, 3, 7, 9, 1, 2, 4};
        sort(values);
    }

    public static int smallest(int[] array) {

        int min = array[0];

        for (int l = 0; l < array.length; l++) {
            if (array[l] < min) {
                min = array[l];
            }
        }
        return min;

    }

    public static int indexOfTheSmallest(int[] array) {
        int k = 0;
        for (int i = 0; i < array.length; i++) {
            if (smallest(array) == array[i]) {
                k = i;
            }
        }
        return k;
    }

    public static int indexOfTheSmallestStartingFrom(int[] array, int index) {
        int k = 0;

        for (int i = index; i < array.length; i++) {
            if (index == array.length - 1) {
                k = index;
            } else if (smallest(Arrays.copyOfRange(array, index, array.length)) == array[i]) {
                k = i;
            }
        }
        return k;
    }

    public static void swap(int[] array, int index1, int index2) {
        int k = array[index1];
        array[index1] = array[index2];
        array[index2] = k;
    }
    
    public static void sort(int[] array){
        System.out.println(Arrays.toString(array));
        for(int i = 0; i <array.length; i++){
            int k = indexOfTheSmallestStartingFrom(array, i);
            swap(array, i, k);
            System.out.println(Arrays.toString(array));
        }
        
       
    }

}
