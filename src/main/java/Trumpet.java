public class Trumpet extends Instrument implements IPlay, ISell {

    private int valves;
    private String size;
    private String description;
    private double buyPrice;
    private double sellPrice;

    public Trumpet(String make, String material, String colour, int valves, String size, String description, double buyPrice, double sellPrice) {
        super(make, material, colour);
        this.valves = valves;
        this.size = size;
        this.description = description;
        this.buyPrice = buyPrice;
        this.sellPrice = sellPrice;
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

    public double calculateMarkup() {
        return sellPrice - buyPrice;
    }

    public String getDescription() {
        return description;
    }

    public double getBuyPrice() {
        return buyPrice;
    }

    public double getSellPrice() {
        return sellPrice;
    }
}
