import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class RoomTest {

    Room room;
    Enemy enemy;
    ArrayList<Player> players;
    Dwarf dwarf;
    Knight knight;
    Cleric cleric;

    @Before
    public void setup()
    {

        enemy = new Enemy(RaceType.TROLL);
        dwarf = new Dwarf("Can", 100);
        knight = new Knight("Greg", 100);
        cleric = new Cleric("Ed", 100);
        players = new ArrayList<>();
        players.add(dwarf);
        players.add(knight);
        players.add(cleric);

        room = new Room(1, enemy, players, 20);


    }

    @Test
    public void hasPlayers(){
        assertEquals(3, room.getPlayerCount());
    }

    @Test
    public void canGetTreasure(){
        assertEquals(20, room.getTreasure());
    }

}
