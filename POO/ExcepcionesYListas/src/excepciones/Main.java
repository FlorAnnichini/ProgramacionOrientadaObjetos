package excepciones;

public class Main {
    public static void main(String[] args) throws TeamException {

            Team team1 = new Team("Red panda");

            team1.addPlayer(new Player("Turin", "GOALKEEPER", 1));
            team1.addPlayer(new Player("Sorin", "MIDFIELDER", 13));
            team1.addPlayer(new Player("Meyu", "FORWARD", 10));
            team1.addPlayer(new Player("Lopi", "MIDFIELDER", 5));
            team1.addPlayer(new Player("Reina", "DEFENSE", 23));
            team1.addPlayer(new Player("Mundalo", "FOWARD", 9));
            team1.addPlayer(new Player("Mundalo", "FOWARD", 9));
            team1.addPlayer(new Player("Mundalo", "FOWARD", 9));
            team1.addPlayer(new Player("Mundalo", "FOWARD", 9));

        System.out.println(team1.foundPlayerByLastname("Lopi"));
        System.out.println(team1.foundPlayerByNumber(9));

            try {
                System.out.println(team1.quantityInPosition("goalkeeper"));
            } catch (TeamException e) {
                e.printStackTrace();

            }try {
                System.out.println(team1.quantityInPosition("GOALKEEPER"));
            } catch (TeamException e) {
                e.printStackTrace();
            }
    }
}