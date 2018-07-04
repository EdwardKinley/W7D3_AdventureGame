public class Wizard extends Player implements IMage{

   SpellType spell;
   CreatureType creature;

    public Wizard(String name, int hp) {
        super(name, hp);
        spell = SpellType.FIREBALL;
        creature = CreatureType.WYVERN;
    }

    @Override
    public void castSpell(Enemy enemy) {
        enemy.receiveDamage(spell.getDamage());
    }

    @Override
    public void changeSpell(SpellType newSpell) {
        spell = newSpell;
    }

    @Override
    public void changeCreature(CreatureType newCreature) {
        creature = newCreature;
    }
    @Override
    public SpellType getSpell() {
        return spell;
    }
}
