public class Piano extends Instrument implements IPlay, ISell {

    private int keys;
    private String type;
    private String description;
    private double buyPrice;
    private double sellPrice;

    public Piano(String make, String material, String colour, int keys, String type, String description, double buyPrice, double sellPrice) {
        super(make, material, colour);
        this.keys = keys;
        this.type = type;
        this.description = description;
        this.buyPrice = buyPrice;
        this.sellPrice = sellPrice;
    }

    public double getBuyPrice() {
        return buyPrice;
    }

    public double getSellPrice() {
        return sellPrice;
    }

    public String getDescription() {
        return description;
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

    public double calculateMarkup() {
        return sellPrice - buyPrice;
    }
}
