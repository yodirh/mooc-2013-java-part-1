
/**
 * @MoFo
 */
// overloaded Counter

public class Counter {

    private int value;
    private boolean check;

    public Counter(int startingValue, boolean check) {
        this.value = startingValue;
        this.check = check;
    }
    
    // constructor overloading
    public Counter(int startingValue) {
        this(startingValue, false);
    }

    public Counter(boolean check) {
        this(0, check);
    }

    public Counter() {
        this(0, false);
    }
    
    //Methodes
    public int value() {
        return this.value;
    }

    public void increase() {
        value++;

    }

    public void decrease() {

        if (value == 0 && check == true) {
            ;
        } else {
            value--;
        }

    }
    
    //Methodes overloading
    public void increase(int increaseAmount) {
        if (increaseAmount >= 0) {
            value = value + increaseAmount;
        }
    }

    public void decrease(int decreaseAmount) {
        if (decreaseAmount < 0) {
            ;
        } else if (decreaseAmount > value && check == true) {
            value = 0;

        } else if (decreaseAmount > value && check == false) {
            value = value - decreaseAmount;
        } else if (value >= 0 && check == true) {
            value = value - decreaseAmount;
        } else {
            value = value - decreaseAmount;
        }
    }
}
