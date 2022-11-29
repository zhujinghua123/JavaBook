package chap09;

public class Test2_Stock {
    String symbol;
    String name;
    double previousClosingPrice;
    double currentPrice;

    public Test2_Stock(String symbol, String name, double previousClosingPrice, double currentPrice) {
        this.symbol = symbol;
        this.name = name;
        this.previousClosingPrice = previousClosingPrice;
        this.currentPrice = currentPrice;
        System.out.println((currentPrice - previousClosingPrice) / previousClosingPrice * 100 + "%");
    }
}

