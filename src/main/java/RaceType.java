public enum RaceType {
    ORC(50),
    GOBLIN(20),
    TROLL(100);

    public final int hp;

    RaceType (int hp){
        this.hp = hp;
    }
    public int getHP(){
        return this.hp;
    }

}
