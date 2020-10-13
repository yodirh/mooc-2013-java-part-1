
public class BoundedCounter {
    // copy here the class BoundedCounter from last weeks assignment 78 
    
     private int value;
    private int upperLimit;
    
    public BoundedCounter(int UpperLimit) {
        this.upperLimit = UpperLimit;
    }
    
    public int getValue(){
        return value;
    }
    
    public void setValue(int value){
        if (value >= 0 && value <= upperLimit){
            this.value = value;
        }
        
    }
    
    public void next(){
        value++;
        if (value > upperLimit){
            value = 0;
        }
    }
    
    public String toString(){
        if (value < 10){
            return "" + "0"+value;
        }
        else {
           return "" + value; 
        }
        
    }


}
