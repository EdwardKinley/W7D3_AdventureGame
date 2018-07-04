import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WarlockTest {


    Warlock warlock;
    Enemy enemy;

    @Before
    public void Setup(){
        warlock = new Warlock ("Tony", 100);
        enemy = new Enemy (RaceType.TROLL);
    }

    @Test
    public void hasExtraHP(){
        assertEquals(150, warlock.getHP());
    }


}
