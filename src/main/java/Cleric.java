public class Cleric extends Player {


    ToolType tool;

    public Cleric(String name, int hp) {
        super(name, hp);
        tool = ToolType.POTION;
    }


    public ToolType getTool() {
        return tool;
    }
}
