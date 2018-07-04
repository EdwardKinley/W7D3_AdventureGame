public enum CreatureType {
    WYVERN(30),
    FAIRY(20);

    public final int protection;

    CreatureType(int protection){
        this.protection = protection;
    }

    public int getProtection(){
        return protection;
    }

}
