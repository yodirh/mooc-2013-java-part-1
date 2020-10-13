public class Main {

    public static void main(String[] args) {
        HangmanLogic logic = new HangmanLogic("banana");
        HangmanUserInterface game = new HangmanUserInterface(logic);
        game.start();
    }
}
