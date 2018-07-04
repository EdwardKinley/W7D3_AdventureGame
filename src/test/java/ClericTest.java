import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ClericTest {

    Cleric cleric;
    Dwarf dwarf;

    @Before
    public void Setup(){
       cleric = new Cleric("John", 100);
       dwarf = new Dwarf("Can", 50);
    }

    @Test
    public void hasTool(){
        assertEquals(ToolType.POTION, cleric.getTool());
    }

    @Test
    public void canHeal(){
        cleric.heal(dwarf);
        assertEquals(130, dwarf.getHP());
    }

}
