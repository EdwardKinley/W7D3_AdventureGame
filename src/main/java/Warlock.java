public class Warlock extends Player implements IMage {

    SpellType spell;
    CreatureType creature;

    public Warlock(String name, int hp) {
        super(name, hp+50);

        spell = SpellType.FIREBALL;
        creature = CreatureType.FAIRY;
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

    @Override
    public CreatureType getCreature() {
        return creature;
    }
    @Override
    public void receiveDamage(int damage){
        setHP(getHP()+creature.getProtection()-damage);
    }

}
