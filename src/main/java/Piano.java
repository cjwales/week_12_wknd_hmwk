public class Piano implements IPlay {

    private int keys;
    private String type;

    public Piano(int keys, String type) {
        this.keys = keys;
        this.type = type;
    }

    public String play() {
        return "Tinkle";
    }

    public int getKeys() {
        return keys;
    }

    public String getType() {
        return type;
    }
}
