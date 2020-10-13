
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // implement your program here
        // do not put all to one method/class but rather design a proper structure to your program

        // Your program should use only one Scanner object, i.e., it is allowed to call 
        // new Scanner only once. If you need scanner in multiple places, you can pass it as parameter
        Scanner reader = new Scanner(System.in);
        Bird birdList = new Bird();

        while (true) {
            System.out.print("? ");
            String what = reader.nextLine();

            if (what.equals("Quit")) {
                break;
            }
            if (what.equals("Add")) {

                System.out.print("Name: ");
                String name = reader.nextLine();
                System.out.print("Latin Name: ");
                String lname = reader.nextLine();
                Bird.add(name, lname);
            }

            if (what.equals("Observation")) {
                System.out.print("What was observed:? ");
                String obname = reader.nextLine();
                Bird.observation(obname);
            }

            if (what.equals("Statistics")) {
                Bird.statistics();
            }

            if (what.equals("Show")) {
                System.out.println("What? ");
                String shname = reader.nextLine();
                Bird.show(shname);
            }
        }

    }

}
