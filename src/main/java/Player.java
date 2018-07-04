public abstract class Player {

    private String name;
    private int hp;


    public Player(String name, int hp){

        this.name = name;
        this.hp=hp;


    }

    public String getName() {
        return this.name;
    }


    public int getHP(){
        return this.hp;
    }

    public void setHP(int newHP){
        this.hp = newHP;
    }

    public void receiveDamage(int damage) {
        this.hp-=damage;
    }
}
