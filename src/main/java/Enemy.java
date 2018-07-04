public class Enemy {

    private int hp;

    private RaceType race;

    public Enemy(RaceType race) {
        this.hp = race.getHP();
        this.race = race;
    }


    public void receiveDamage(int damage) {
        this.hp-=damage;
    }

    public int getHP() {
        return hp;
    }


    public void attack(Player player) {
        player.receiveDamage(race.getDamage());
    }
}
