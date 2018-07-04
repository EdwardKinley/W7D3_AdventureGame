public interface IMage {

    void castSpell(Enemy enemy);
    void changeSpell(SpellType newSpell);
    void changeCreature (CreatureType newCreature);
    SpellType getSpell();


}
