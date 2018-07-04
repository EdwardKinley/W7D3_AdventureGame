public class Knight extends Player implements IFighter {

    WeaponType weapon;
    public Knight(String name, int hp){
        super(name, hp);
        weapon = WeaponType.SWORD;
    }


    @Override
    public void attack(Enemy enemy) {
        enemy.receiveDamage(weapon.getDamage());
    }

    @Override
    public void changeWeapon(WeaponType newWeapon) {
        weapon = newWeapon;
    }

    @Override
    public WeaponType getWeapon() {
        return weapon;
    }

    @Override
    public void receiveDamage(int damage) {
        setHP(getHP()+20-damage);
    }


}
