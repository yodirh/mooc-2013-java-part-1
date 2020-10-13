
public class NumberStatistics {
    private int amountOfNumbers;
    private int sum;
    
    public NumberStatistics(){
        //this.amountOfNumbers = amountOfNumbers;
        //this.sum = 0;
    }
    
    public void addNumber(int number){
        sum = sum + number;
        amountOfNumbers ++;
    }
    
    public int amountOfNumbers(){
        return amountOfNumbers;
    }
    
    public int sum(){
        
        return sum;
    }
    public double average(){
        double average=0;
        if (amountOfNumbers > 0){
           average = (double)sum/amountOfNumbers;
        }
        
        return average; 
        
         
    }
}
