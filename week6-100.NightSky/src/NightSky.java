
//@MoFo

import java.util.Random;

public class NightSky {
    
    private double density;
    private int width;
    private int height;
    private int starInLastPrint;
    
    public NightSky(double density){
        this.density = density;
        this.width= 20;
        this.height = 10;
    }
    
    public NightSky(int width, int height){
        this.density= 0.1;
        this.width = width;
        this.height= height;
    }
    
    public NightSky(double density, int width, int height){
        this.density= density;
        this.width= width;
        this.height= height;
    }
    
    //Print one line of stars
    public void printLine(){
        Random random = new Random();
        for(int i = 0; i <this.width; i++){
            if (random.nextDouble() <= this.density){
                System.out.print("*");
                this.starInLastPrint ++;
            }else {
               System.out.print(" "); 
            }
        }
        System.out.println();
    }
    
    //nightsky of given height
    public  void print(){
        this.starInLastPrint = 0;
        for(int i = 0; i < this.height; i ++){
            printLine();
        }         
    }
    
    //count stars in last print
    public int starsInLastPrint() {
        return this.starInLastPrint;
    }
}
