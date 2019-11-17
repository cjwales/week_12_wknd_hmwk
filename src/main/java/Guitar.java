public class Guitar extends Instrument implements IPlay, ISell{

    private String type;
    private int strings;
    private String description;
    private double buyPrice;
    private double sellPrice;

    public Guitar(String make, String material, String colour, String type, int strings, String description, double buyPrice, double sellPrice) {
        super(make, material, colour);
        this.type = type;
        this.strings = strings;
        this.description = description;
        this.buyPrice = buyPrice;
        this.sellPrice = sellPrice;
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

    public String getDescription() {
        return description;
    }

    public double getBuyPrice() {
        return buyPrice;
    }

    public double getSellPrice() {
        return sellPrice;
    }

    public double calculateMarkup() {
        return buyPrice * 1.50;
    }
}
