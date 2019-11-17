public class Guitar extends Instrument implements IPlay{

    private String type;
    private int strings;

    public Guitar(String make, String material, String colour, String type, int strings) {
        super(make, material, colour);
        this.type = type;
        this.strings = strings;
    }

    public String play() {
        return "Twang";
    }

    public String getType() {
        return type;
    }

    public int getStrings() {
        return strings;
    }
}
