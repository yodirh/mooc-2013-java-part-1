
//@MoFo
import java.util.ArrayList;

public class Phonebook {

    private ArrayList<Person> list;

    public Phonebook() {
        this.list = new ArrayList<Person>();
    }

    public void add(String name, String number) {
        list.add(new Person(name, number));

    }

    public void printAll() {
        for (Person w : list) {
            System.out.println(w);
        }
    }

    public String searchNumber(String name) {
        for (Person w : list) {
            if (w.getName() == name) {
                return w.getNumber();
            }
        }
        return "number not known";
    }
}
