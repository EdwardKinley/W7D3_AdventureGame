public enum RaceType {
    ORC(50, 25),
    GOBLIN(20, 10),
    TROLL(100, 30);

    public final int hp;
    public final int damage;

    RaceType (int hp, int damage){
        this.hp = hp;
        this.damage = damage;
    }
    public int getHP(){
        return this.hp;
    }
    public int getDamage(){
        return this.damage;
    }
}
