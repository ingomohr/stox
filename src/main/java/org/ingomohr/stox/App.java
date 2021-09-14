package org.ingomohr.stox;

import java.io.IOException;
import java.math.BigDecimal;

import yahoofinance.Stock;
import yahoofinance.YahooFinance;

public class App {
    public static void main(String[] args) {
        try {
            Stock stock = YahooFinance.get("AAPL");
            BigDecimal price = stock.getQuote().getPrice();
            System.out.println("Price: " + price + " " + stock.getCurrency());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
