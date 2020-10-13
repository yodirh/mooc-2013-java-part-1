//@MoFo
 
public class Player {
    private String playername;
    private int goal;
    
    public Player(String playername){
        this.playername = playername;
    }
    public Player(String playername, int goal){
        this.playername = playername;
        this.goal = goal;
    }
    
    public String getName(){
        return this.playername;
    }
    public int goals(){
        return this.goal;
    }
    
    public String toString(){
        return this.playername + ", goals "+ this.goal;
    }
}
