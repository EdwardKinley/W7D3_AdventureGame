import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DwarfTest{

    Dwarf dwarf;

    @Before
    public void setup()
    {
        dwarf = new Dwarf("Can", 100);
    }

    @Test
    public void hasName(){
        assertEquals("Can", dwarf.getName());
    }

    @Test
    public void hasHP(){
        assertEquals(100, dwarf.getHP());
    }

    @Test
    public void canReceiveDamage(){
        dwarf.receiveDamage(10);
        assertEquals(90, dwarf.getHP());
    }


}
