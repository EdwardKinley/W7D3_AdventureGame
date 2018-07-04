import org.junit.Before;

import java.util.ArrayList;

public class GameTest {

    Game game;

    Room room1;
    Room room2;
    Room room3;


    Player player1;
    Player player2;
    Player player3;

    ArrayList<Room> rooms;
    ArrayList<Player> players;
    Enemy enemy1;
    Enemy enemy2;
    Enemy enemy3;



    @Before
    public void Setup(){

        player1 = new Dwarf("Can", 100);
        player2= new Knight("Greg", 100);
        player3 = new Cleric("Ed", 100);
        players.add(player1);
        players.add(player2);
        players.add(player3);


        enemy1 = new Enemy(RaceType.GOBLIN);
        enemy2 = new Enemy(RaceType.ORC);
        enemy3 = new Enemy(RaceType.TROLL);

        room1 = new Room(1,enemy1,10);
        room2 = new Room(2,enemy2,20);
        room3 = new Room(3,enemy3,30);

        rooms = new ArrayList<>();
        rooms.add(room1);
        rooms.add(room2);
        rooms.add(room3);

        game = new Game(players, rooms);

    }




}
