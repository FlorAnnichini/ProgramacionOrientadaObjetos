package excepciones;

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
        if(players.contains(player)){
            System.out.println("This player it is already added");
        }
        players.add(player);
    }

    public Player foundPlayerByNumber(Integer shirtNumber) throws TeamException {
        Player searchedPlayer = null;
        for (Player player : players) {
            if(player.getShirtNumber().equals(shirtNumber)){
                searchedPlayer = player;
            }
        }
        if(searchedPlayer == null){
            throw new TeamException("Player not found");
        }
        return searchedPlayer;
    }

    public Player foundPlayerByLastname(String lastname) throws TeamException {
        Player searchedPlayer = null;
        for (Player player : players) {
            if(player.getLastname().equals(lastname)){
                searchedPlayer = player;
            }
        }
        if(searchedPlayer == null){
            throw new TeamException("Player not found");
        }
        return searchedPlayer;
    }

    private Boolean positionVerify (String position){
        List<String> positions = new ArrayList<>();
        positions.add("GOALKEEPER");
        positions.add("MIDFIELDER");
        positions.add("FORWARD");
        positions.add("DEFENSE");

        return positions.contains(position);
    }

    public Integer quantityInPosition(String position) throws TeamException{
        if(!positionVerify(position)){
            throw new TeamException("Position not valid");
        }
        Integer playersInPosition = 0;
        for (Player player : players) {
            if(player.getPosition().equals(position)){
                playersInPosition++;
            }
        }
        return playersInPosition;
    }

}
