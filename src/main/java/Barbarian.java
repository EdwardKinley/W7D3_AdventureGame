public class Barbarian extends Player implements IFighter {

    WeaponType weapon;

    public Barbarian(String name, int hp) {
        super(name, hp);
        weapon = WeaponType.CLUB;
    }
    public WeaponType getWeapon() {
        return weapon;
    }

    @Override
    public void attack(Enemy enemy) {
        enemy.receiveDamage(weapon.getDamage()*2);
    }

    @Override
    public void changeWeapon(WeaponType newWeapon) {
        weapon = newWeapon;
    }
}
