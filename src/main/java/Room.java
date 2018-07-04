import java.util.ArrayList;

public class Room {


    private int treasures;
    private int number;

    private Enemy enemy;
    private ArrayList<Player> players;

    public Room(int number, Enemy enemy, ArrayList<Player> players, int treasures) {
        this.number = number;
        this.enemy = enemy;
        this.players = players;
        this.treasures = treasures;

    }

    public int getPlayerCount() {
        return players.size();
    }


    public int getTreasure() {
        return treasures;
    }
}
