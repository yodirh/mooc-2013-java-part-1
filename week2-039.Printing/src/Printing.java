public class Printing {

    public static void printStars(int amount) {
        // 39.1
        // you can print one star with the command
        //System.out.print("*");
        // call this command amount times
        while(amount>0){
            System.out.print("*");
            amount -- ;
        }
        System.out.print("\n");
        
    }

    public static void printSquare(int sideSize) {
        // 39.2
        int i = sideSize;
        while(sideSize > 0) {
            printStars(i);
            sideSize --;
        }
    }

    public static void printRectangle(int width, int height) {
        // 39.3
        while(height> 0){
            printStars(width);
            height--;
        }
            
            
        
    }

    public static void printTriangle(int size) {
        // 39.4
        int star = 1;
        while (size>0) {
            printStars(star);
            star ++;
            size --;
   
        }
    }

    public static void main(String[] args) {
        // Tests do not use main, yo can write code here freely!
        // if you have problems with tests, please try out first 
        // here to see that the printout looks correct

        printStars(5);
        printStars(3);
        printStars(9);
        System.out.println("\n---");  // printing --- to separate the figures
        printSquare(3);
        System.out.println("\n---");
        printRectangle(17, 3);
        System.out.println("\n---");
        printTriangle(3);
        System.out.println("\n---");
    }

}
