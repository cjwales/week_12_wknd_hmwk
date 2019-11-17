import java.util.ArrayList;

public class Shop implements ISell {

    private ArrayList<ISell> stock;
    private double buyPrice;
    private double sellPrice;

    public Shop() {
        this.stock = new ArrayList<ISell>();
        this.buyPrice = buyPrice;
        this.sellPrice = sellPrice;
    }

    public double calculateMarkup() {
        return sellPrice - buyPrice;
    }

    public void addItemToStock(ISell item) {
        this.stock.add(item);
    }

    public void removeItemFromStock(ISell item) {
        this.stock.remove(item);
    }

    public int getStockSize() {
        return this.stock.size();
    }

    public double calculateMaxProfit() {
        double count = 0.00;
        for (ISell item : stock) {
            count += item.calculateMarkup();
        }
        return count;
    }
}
