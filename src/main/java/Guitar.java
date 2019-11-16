public class Guitar implements IPlay{

    private String type;
    private int strings;

    public Guitar(String type, int strings) {
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
