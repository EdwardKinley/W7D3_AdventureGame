import java.util.ArrayList;

public class Room {


    private int treasures;
    private int number;

    private Enemy enemy;
    private ArrayList<Player> players;

    public Room(int number, Enemy enemy, int treasures) {
        this.number = number;
        this.enemy = enemy;
        this.players = new ArrayList<>();
        this.treasures = treasures;
    }

    public void addPlayers(ArrayList<Player> players){
        this.players = players;

    }
    public int getPlayerCount() {
        return players.size();
    }


    public int getTreasure() {
        return treasures;
    }
}
