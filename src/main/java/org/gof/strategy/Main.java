package org.gof.strategy;

public class Main {
    public static void main(String[] args) {
        int[] prices = {12000, 27000, 30000, 100000, 1250000};

        for (int price : prices) {
            PrintPrice printPrice = new PrintPrice();
            printPrice.print(new FixDiscountStrategy(), price);
        }
        for (int price : prices) {
            PrintPrice printPrice = new PrintPrice();
            printPrice.print(new RateDiscountStrategy(), price);
        }

    }
}