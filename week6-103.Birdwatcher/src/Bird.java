
import java.util.ArrayList;

//@MoFo
public class Bird {

    private static ArrayList<String> nameDb;
    private static ArrayList<String> latnameDb;
    private static int[] birdCount;

    public Bird() {
        nameDb = new ArrayList<String>();
        latnameDb = new ArrayList<String>();
        birdCount = new int[10];

    }

    public static void add(String name, String latname) {
        nameDb.add(name);
        latnameDb.add(latname);

    }

    public static void observation(String name) {
        if (nameDb.contains(name)) {
            int i = nameDb.indexOf(name);
            birdCount[i]++;
        } else {
            System.out.println("Is not a bird");
        }

    }

    public static void statistics() {
        for (String w : nameDb) {
            int i = nameDb.indexOf(w);
            System.out.println(w + " (" + latnameDb.get(i) + "): " + birdCount[i] + " observations");
        }
    }

    public static void show(String name) {
        int i = nameDb.indexOf(name);
        if (nameDb.contains(name)) {
            System.out.println(name + " (" + latnameDb.get(i) + "): " + birdCount[i] + " observations");
        }
    }

}
