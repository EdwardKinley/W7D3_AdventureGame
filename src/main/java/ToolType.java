public enum ToolType{
    POTION(30),
    HERB(20);
    public final int healingPower;

    ToolType(int healingPower){
        this.healingPower = healingPower;
    }

    public int getHealingPower() {
        return healingPower;
    }
}
