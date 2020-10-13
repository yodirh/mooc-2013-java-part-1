
public class TestProgram {

    public static void main(String[] args) {

        HangmanLogic l = new HangmanLogic("kia");
        System.out.println("Word at start: " + l.hiddenWord());

        System.out.println("Let us guess: k, D, a, F, D");
        l.guessLetter("K");
        l.guessLetter("D");
        l.guessLetter("A");
        l.guessLetter("F");
        l.guessLetter("D");
        System.out.println("Guessed letterd: " + l.guessedLetters());
        System.out.println("Number of faults: " + l.numberOfFaults());
        System.out.println("Word is: " + l.hiddenWord());

    }
}
