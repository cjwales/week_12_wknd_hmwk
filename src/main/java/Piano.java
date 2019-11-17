public class Piano extends Instrument implements IPlay {

    private int keys;
    private String type;

    public Piano(String make, String material, String colour, int keys, String type) {
        super(make, material, colour);
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
