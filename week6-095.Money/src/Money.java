
public class Money {

    private final int euros;
    private final int cents;
    

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros += cents / 100;
            cents %= 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return euros;
    }

    public int cents() {
        return cents;
    }

    @Override
    public String toString() {
        String zero = "";
        if (cents < 10) {
            zero = "0";
        }

        return euros + "." + zero + cents + "e";
    }
    
    public Money plus(Money added){
        Money sum = new Money ((euros()+added.euros), (cents()+ added.cents));
        return sum;
    }
    
    public boolean less(Money Compared){
        if(euros()< Compared.euros){
            return true;
        }
        if(euros()== Compared.euros && cents()< Compared.cents){
            return true;
        }else{
            return false;
        }
    }
    
    public Money minus(Money decremented){
        Money min = new Money((euros()-decremented.euros),(cents()- decremented.cents));
        if (cents() == 0 && decremented.cents>0){
           min = new Money((euros()-decremented.euros-1),(100- decremented.cents));  
        }
  
        if (min.euros< 0 ){
            min = new Money (0, 0);
        }
        return min;
    }

}
