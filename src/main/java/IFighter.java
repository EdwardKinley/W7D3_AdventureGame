public interface IFighter {

    void attack(Enemy enemy);
    void changeWeapon(WeaponType newWeapon);
    WeaponType getWeapon();
}
