public enum WeaponType {
    AXE(50),
    SWORD(20),
    CLUB(10);
    public final int damage;

    WeaponType(int damage){
        this.damage = damage;
    }

    public int getDamage(){
        return damage;
    }
}
