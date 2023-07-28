package colecciones;

public class Player implements Comparable<Player>{

    private int shirtNumber;
    private String name;
    private Boolean injured;
    private Boolean firstPlayer;

    public Player(int shirtNumber, String name, Boolean injured, Boolean firstPlayer) {
        this.shirtNumber = shirtNumber;
        this.name = name;
        this.injured = injured;
        this.firstPlayer = firstPlayer;
    }

    public Boolean getInjured() {
        return injured;
    }

    public Boolean getFirstPlayer() {
        return firstPlayer;
    }

    @Override
    public String toString() {
        return "Player {" +
                "Shirt Number = " + shirtNumber +
                ", Name = '" + name + '\'' +
                '}';
    }

    @Override
    public int compareTo(Player player) {
        if(this.shirtNumber > player.shirtNumber){
            return 1;
        }
        if(this.shirtNumber < player.shirtNumber){
            return -1;
        }
        return 0;
    }
}
