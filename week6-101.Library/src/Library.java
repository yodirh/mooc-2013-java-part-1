
//@MoFo
import java.util.ArrayList;

public class Library {

    private ArrayList<Book> lib;

    public Library() {
        this.lib = new ArrayList<Book>();
    }

    public void addBook(Book newbook) {
        lib.add(newbook);
    }

    public void printBooks() {
        for (Book w : lib) {
            System.out.println(w);
        }
    }

    //searched by one word as tittle
    public ArrayList<Book> searchByTitle(String title) {
        ArrayList<Book> found = new ArrayList<Book>();

        for (Book w : lib) {
            if (StringUtils.included(w.title(), title)) {
                found.add(w);
            }
        }
        return found;
    }

    public ArrayList<Book> searchByPublisher(String publisher) {
        ArrayList<Book> found = new ArrayList<Book>();
        for (Book w : lib) {   
            if (StringUtils.included(w.publisher(), publisher)) {
                found.add(w);
            }
        }
        return found;
    }

    public ArrayList<Book> searchByYear(int year) {
        ArrayList<Book> found = new ArrayList<Book>();
        for (Book w : lib) {
            if (w.year() == year) {
                found.add(w);
            }
        }
        return found;
    }

}
