public class Cleric extends Player {


    ToolType tool;

    public Cleric(String name, int hp) {
        super(name, hp);
        tool = ToolType.POTION;
    }


    public ToolType getTool() {
        return tool;
    }

    public void heal(Player player) {
        player.setHP(player.getHP()+tool.getHealingPower());
    }
}
