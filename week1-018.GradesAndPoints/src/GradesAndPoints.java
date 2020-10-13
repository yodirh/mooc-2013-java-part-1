
import java.util.Scanner;

public class GradesAndPoints {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter the points [0-60]: ");
        int points = Integer.parseInt(reader.nextLine());
        
        if (0<=points && points <=29 ){       
            System.out.println("grade: Failed");
        }
        else if (30<=points && points <=34){       
            System.out.println("grade: 1");
        }
        else if (35<=points && points <=39 ){       
            System.out.println("grade: 2");
        }
        else if (40<=points && points <=44 ){       
            System.out.println("grade: 3");
        }
        else if (45<=points && points <=49 ){       
            System.out.println("grade: 4");
        }
        else if (50<=points && points <=60 ){       
            System.out.println("grade: 5");
        }
        
        
        
                 
    }
        
                

    
}
