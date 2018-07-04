import java.util.ArrayList;

public class Game {

    private int treasures;

    private ArrayList<Player> players;
    private ArrayList<Room> rooms;


    public Game(ArrayList<Player> players, ArrayList<Room> rooms){
        this.players = players;
        this.rooms = rooms;
        treasures = 0;
    }



}
