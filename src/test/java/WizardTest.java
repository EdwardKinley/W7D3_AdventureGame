import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WizardTest {

    Wizard wizard;
    Enemy enemy;

    @Before
    public void setup(){
        wizard = new Wizard("Jsolt",100);
        enemy = new Enemy(RaceType.TROLL);
    }

    @Test
    public void canCastSpell(){
        wizard.castSpell(enemy);
        assertEquals(60, enemy.getHP());
    }

    @Test
    public void canChangeSpell(){
        wizard.changeSpell(SpellType.LIGHTNINGBOLT);
        assertEquals(SpellType.LIGHTNINGBOLT, wizard.getSpell());
    }

}
