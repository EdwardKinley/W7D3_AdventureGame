
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BarbarianTest {

    Barbarian barbarian;
    Enemy enemy;
    @Before
    public void setup() {
        barbarian = new Barbarian("Greg", 100);
        enemy = new Enemy(RaceType.TROLL);
    }

    @Test
    public void canDealDoubleDamage(){
        barbarian.attack(enemy);
        assertEquals(80, enemy.getHP())   ;
    }





}

