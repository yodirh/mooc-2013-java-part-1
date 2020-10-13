
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // implement your program here
        // do not put all to one method/class but rather design a proper structure to your program
        // Your program should use only one Scanner object, i.e., it is allowed to call 
        // new Scanner only once. If you need scanner in multiple places, you can pass it as parameter
        ArrayList<Integer> gradeList = new ArrayList<Integer>();
        Scanner reader = new Scanner(System.in);
        int[] counter = {0, 0, 0, 0, 0, 0};
        System.out.println("Type exam scores, -1 completes: ");

        while (true) {
            int grade = Integer.parseInt(reader.nextLine());
            if (grade == -1) {
                break;

            } else {
                gradeList.add(grade);
            }

        }
        for (int points : gradeList) {
            if (0 <= points && points <= 29) {
                counter[0] += 1;
            } else if (30 <= points && points <= 34) {
                counter[1] += 1;
            } else if (35 <= points && points <= 39) {
                counter[2] += 1;
            } else if (40 <= points && points <= 44) {
                counter[3] += 1;
            } else if (45 <= points && points <= 49) {
                counter[4] += 1;
            } else if (50 <= points && points <= 60) {
                counter[5] += 1;
            }
        }
        System.out.println("Grade Distribution");

        for (int i = 5; i >= 0; i--) {
            System.out.println(i + ": " + star(counter[i]));
        }

        int sum = 0;
        for (int w : gradeList) {
            if (w > 29) {
                sum++;

            }
        }

        if (gradeList.size() != 0) {
            double accp = 100 * sum / gradeList.size();
            System.out.println("Acceptance percentage: " + accp);
        }

    }

    public static String star(int num) {
        String star = "";
        for (int i = 0; i < num; i++) {
            star += "*";
        }
        return star;
    }

}
