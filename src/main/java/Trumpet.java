public class Trumpet extends Instrument implements IPlay {

    private int valves;
    private String size;

    public Trumpet(String make, String material, String colour, int valves, String size) {
        super(make, material, colour);
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
