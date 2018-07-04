import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class DwarfTest{

    Dwarf dwarf;
    Enemy enemy;

    @Before
    public void setup()
    {
        dwarf = new Dwarf("Can", 100);
        enemy = new Enemy(RaceType.ORC);
    }

    @Test
    public void hasName(){
        assertEquals("Can", dwarf.getName());
    }

    @Test
    public void hasDoubleHP(){
        assertEquals(200, dwarf.getHP());
    }

    @Test
    public void canReceiveDamage(){
        dwarf.receiveDamage(10);
        assertEquals(90, dwarf.getHP());
    }

    @Test
    public void hasAWeapon(){
        assertEquals(WeaponType.AXE, dwarf.getWeapon());
    }

    @Test
    public void canAttack(){
        dwarf.attack(enemy);
        assertEquals(20, enemy.getHP());
    }

}
