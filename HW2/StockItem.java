public class StockItem {
    public StockItem(String stockName, String stockNum, double price) {
        this.stockName = stockName;
        this.stockNum = stockNum;
        this.price = price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void increseTotalStock(int add) {
        this.totalNum += add;
    }

    public double calculateTotalPrice() {
        return getPrice() * getTotalStock();
    }

    public String getStockNumber() {
        return this.stockNum;
    }

    public String getName() {
        return this.stockName;
    }

    public double getPrice() {
        return this.price;
    }

    public int getTotalStock() {
        return this.totalNum;
    }

    private double price;
    private String stockNum, stockName;
    private int totalNum = 0;
}