public enum SpellType {
    FIREBALL(40),
    LIGHTNINGBOLT(30);

    public final int damage;

    SpellType(int damage) {
        this.damage = damage;
    }

    public int getDamage() {
        return damage;
    }


}
