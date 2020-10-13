import java.util.ArrayList;

public class Variance {
    // Copy here sum from exercise 63 
    public static int sum(ArrayList<Integer> list) {
        int sum = 0;
        for (int w:list){
            sum = sum + w;
        }
        return sum;
        
    }
    
    // Copy here average from exercise 64 
    public static double average(ArrayList<Integer> list) {
        double average = sum(list) /(double)list.size();
        return average;
    }

    public static double variance(ArrayList<Integer> list) {
        // write code here
        double avg = average(list);
        double sqrsum = 0;
        for (int w: list){
           sqrsum = sqrsum + Math.pow((w-avg), 2);
        }
        double var = sqrsum /(list.size()-1) ;
        return var;
    }
    
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(3);
        list.add(2);
        list.add(7);
        list.add(2);
        //list.add(1);
       // list.add(3);
        System.out.println("The variance is: " + variance(list));
    }

}
