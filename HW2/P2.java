import java.util.Scanner;

public class P2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String stockName = input.next();
        String stockNum = input.next();
        int stockPrice = input.nextInt();
        input.close();

        StockItem s1 = new StockItem(stockName, stockNum, stockPrice);

        s1.increseTotalStock(5);

        String stockInfo = "stock name : " + s1.getName() + "\nstock number : " + s1.getStockNumber() + "\nprice : "
                + s1.getPrice() + "\ntotal stock : " + s1.getTotalStock() + "\ntotal price : "
                + s1.calculateTotalPrice();

        System.out.println(stockInfo);
    }

}