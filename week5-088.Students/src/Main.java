
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write here the main program
        
        Scanner reader = new Scanner(System.in);
        
        ArrayList<Student> list = new ArrayList<Student>();
        while (true){
            System.out.println("Name: ");
            String name = reader.nextLine();
            if (name.isEmpty()){
                break;
            }
            System.out.println("studentnumber: ");
            String num = reader.nextLine();

            list.add(new Student(name, num));
            
        }
        for(Student w : list){
            System.out.println(w);
        }
        System.out.println("Give the searched term: ");
        String srch = reader.nextLine();
        for (Student w: list){
            if (w.getName().contains(srch)){
                System.out.println("Result:");
                System.out.println(w);
            }
        }
                
    }
}
