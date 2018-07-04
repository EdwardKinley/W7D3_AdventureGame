public class Enemy {

    private int hp;

    RaceType race;

    public Enemy(RaceType race) {
        this.hp = race.getHP();
    }


    public void receiveDamage(int damage) {
        this.hp-=damage;
    }

    public int getHP() {
        return hp;
    }
}
