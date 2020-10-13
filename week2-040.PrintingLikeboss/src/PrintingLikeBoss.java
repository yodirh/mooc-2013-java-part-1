public class PrintingLikeBoss {

    // copy or rewrite the method of Assignment 39.1 here
    public static void printStars(int amount) {
        while(amount>0){
            System.out.print("*");
            amount -- ;
        }
        System.out.print("\n");
    }

    public static void printWhitespaces(int amount) {
        // 40.1
        while(amount>0){
            System.out.print(" ");
            amount -- ;
        }   
    }

    public static void printTriangle(int size) {
        // 40.2
        int space = size - 1;
        int star= size - space;
        while (size > 0){
            printWhitespaces(space);
            printStars(star);
            space -- ;
            star ++;
            size --;
        }
    }

    public static void xmasTree(int height) {
        // 40.3
        // tolal number of star in final step
        int i = 1;
        int element = 1;
        while (i < height){
            i ++;
            element += 2;   
        }    
        
        // printing the tree
        int space = (element - 1)/2;
        int star= 1;
        while (height >0) {
            printWhitespaces(space);
            printStars(star);
            space -- ;
            star += 2;
            height -- ;
        }
        // printing stand
        int stantStep = 0;
        int stanSpace= (element-3)/2;
        int standStar = 3;
        while(stantStep < 2){
           printWhitespaces(stanSpace);
           printStars(standStar);
           stantStep ++;
           
        }
        
    }

    public static void main(String[] args) {
        // Tests do not use main, yo can write code here freely!
        
        printTriangle(6);
        System.out.println("---");
        xmasTree(4);
        System.out.println("---");
        xmasTree(10);
    }
}
