//@MoFo

import java.util.ArrayList;
import java.util.Random;

public class LotteryNumbers {
    private ArrayList<Integer> numbers;
    private Random random = new Random();

    public LotteryNumbers() {
        // Draw numbers as LotteryNumbers is created
        this.drawNumbers();   
    }

    public ArrayList<Integer> numbers() {
        return this.numbers;
    }

    public void drawNumbers() {
        // We'll format a list for the numbers
        this.numbers = new ArrayList<Integer>();
        // Write the number drawing here using the method containsNumber()

        while (numbers.size() < 7){
            int num = random.nextInt(39)+1;
            if(numbers.size() == 7){
                break;
            }
            else if (!numbers.contains(num)){
               numbers.add(num); 
            }   
        }
    }

    public boolean containsNumber(int number) {
        // Test here if the number is already in the drawn numbers
        if (!numbers.contains(number)){
            return false;
        }
        else{
            return true;
        }
        
        
    }
}
