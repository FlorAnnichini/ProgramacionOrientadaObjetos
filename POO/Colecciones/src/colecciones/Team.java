package colecciones;

import java.util.ArrayList;
import java.util.List;

public class Team {

    private String name;
    private List<Player> players;

    public Team(String name) {
        this.name = name;
        players = new ArrayList<>();
    }

    public void addPlayer(Player player){
        players.add(player);
    }

    public Integer getNumberOfInjuredPlayers(){

            Integer numberOfInjuredPlayers = 0;

        for (Player player : players) {
            if (player.getInjured() && player.getFirstPlayer()) {
                numberOfInjuredPlayers++;
            }
        }
        return numberOfInjuredPlayers;
    }

    public void showFirstPlayers(){
        players.sort(null);

        for (Player player: players) {
            if(player.getFirstPlayer()){
                System.out.println(player);
            }
        }
    }


}
