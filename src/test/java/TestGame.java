import org.junit.Before;

import java.util.ArrayList;

public class TestGame {

    Game game;

    ArrayList<Player> players;
    ArrayList<Room> rooms;



    @Before
    public void setup()
    {   players = new ArrayList<>();
        rooms= new ArrayList<>();

        game = new Game (players, rooms);
    }


}
