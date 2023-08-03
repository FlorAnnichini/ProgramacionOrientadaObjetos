package excepciones;

import java.util.List;
import java.util.Objects;

public class Player {

    private String lastname;
    private String position;
    private Integer shirtNumber;

    public Player(String lastname, String position, Integer shirtNumber) {
        this.lastname = lastname;
        this.position = position;
        this.shirtNumber = shirtNumber;
    }

    public String getPosition() {
        return position;
    }

    public String getLastname() {
        return lastname;
    }

    public Integer getShirtNumber() {
        return shirtNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Player player)) return false;
        return Objects.equals(getLastname(), player.getLastname()) && Objects.equals(getPosition(), player.getPosition()) && Objects.equals(getShirtNumber(), player.getShirtNumber());
    }

    @Override
    public String toString() {
        return "Player{" +
                "lastname='" + lastname + '\'' +
                ", position='" + position + '\'' +
                ", shirtNumber=" + shirtNumber +
                '}';
    }
}
