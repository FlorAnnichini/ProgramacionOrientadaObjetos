package colecciones;

public class Main {
    public static void main(String[] args) {

            Team team1 = new Team("Manchester United");

            Player player1 = new Player(1, "Emiliano Martinez", false, false);
            Player player2 = new Player(10, "Lionel Messi", false, true);
            Player player3 = new Player(5, "Enzo Fernandez", false, true);
            Player player4 = new Player(8, "Enzo Diaz", true, true);

            team1.addPlayer(player1);
            team1.addPlayer(player2);
            team1.addPlayer(player3);
            team1.addPlayer(player4);

        System.out.println(team1.getNumberOfInjuredPlayers());
        team1.showFirstPlayers();
        }
    }
