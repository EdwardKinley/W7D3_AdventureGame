import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class KnightTest {

    Knight knight;
    Enemy enemy;

    @Before
    public void setup(){
        knight = new Knight("Ed", 100);

    }

    @Test
    public void canReceiveReduceDamage(){
        knight.receiveDamage(50);
        assertEquals(70, knight.getHP());
    }



}
