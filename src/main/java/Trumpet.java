public class Trumpet implements IPlay {

    private int valves;
    private String size;

    public Trumpet(int valves, String size) {
        this.valves = valves;
        this.size = size;
    }

    public String play() {
        return "Toot";
    }

    public int getValves() {
        return valves;
    }

    public String getSize() {
        return size;
    }
}
