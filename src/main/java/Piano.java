public class Piano implements IPlay {

    private String size;
    private int keys;
    private String type;

    public Piano(String size, int keys, String type) {
        this.size = size;
        this.keys = keys;
        this.type = type;
    }

    public String play() {
        return "Tinkle";
    }

    public String getSize() {
        return size;
    }

    public int getKeys() {
        return keys;
    }

    public String getType() {
        return type;
    }
}
