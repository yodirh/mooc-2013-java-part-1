public class Main {
    public static void main(String[] args) {
        // test your code here

        Team barcelona = new Team("FC Barcelona");
        barcelona.setMaxSize(1);
        
        //Player brian = new Player("Brian");
        Player pekka = new Player("Pekka", 39);

        //barcelona.addPlayer(brian);
        barcelona.addPlayer(pekka);
        barcelona.addPlayer(new Player("Mikael", 1)); // works similarly as the above

        //System.out.println("Number of players: " + barcelona.Size());
        System.out.println("Total goals: " + barcelona.goals());
    }
}
