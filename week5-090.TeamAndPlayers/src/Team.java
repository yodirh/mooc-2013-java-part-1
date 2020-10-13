// @MoFo

import java.util.ArrayList;

public class Team {

    private String name;
    private ArrayList<Player> list;
    private int maxsize;
    
    //Constructor
    public Team(String name) {
        this.name = name;
        this.list = new ArrayList<Player>();
        this.maxsize = 16;
    }

    public String getName() {
        return name;
    }
    
    //add players to arraylist as long as it doesnt exceed the limit.
    public void addPlayer(Player player) {
        if (list.size() == this.maxsize) {
            ;
        } else {
            this.list.add(player);
        }
    }

    public void printPlayers() {
        for (Player w : list) {
            System.out.println(w);
        }
    }
    
    //set maximum size of the arraylist
    public void setMaxSize(int maxsize) {
        list.ensureCapacity(maxsize);
        this.maxsize = maxsize;  
    }

    //size of the team
    public int size() {
        return list.size();
    }
    
    //total number of goals by all players in the team.
    public int goals() {
        int sum = 0;
        for (Player w : list) {
            sum = sum + w.goals();
        }
        return sum;
    }
}
