import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EnemyTest {

    Enemy enemy;
    Dwarf dwarf;

    @Before
    public void setup(){
        enemy = new Enemy(RaceType.TROLL);
        dwarf = new Dwarf("Can", 100);

    }
    @Test
    public void canAttack(){
        enemy.attack(dwarf);
        assertEquals(170, dwarf.getHP());

    }

}
