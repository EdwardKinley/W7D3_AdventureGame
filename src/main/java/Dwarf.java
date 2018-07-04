public class Dwarf extends Player implements IFighter {

    WeaponType weapon;


    public Dwarf(String name, int hp) {
        super(name, hp*2);
        weapon = WeaponType.AXE;

    }


    public WeaponType getWeapon() {
        return weapon;
    }

    @Override
    public void attack(Enemy enemy) {
        enemy.receiveDamage(weapon.getDamage());
    }

    @Override
    public void changeWeapon(WeaponType newWeapon) {

    }
}







//
//
//dwarf.attack(enemy)
//    enemy.receiveDamage(weapon.getdamage)
//
//        enemy.attack(players(random.range(0,player.size)))
//
//
//orc.receivedamage ( dwarf.attack() )



