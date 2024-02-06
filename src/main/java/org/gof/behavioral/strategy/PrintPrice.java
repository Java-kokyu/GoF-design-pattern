package org.gof.behavioral.strategy;

public class PrintPrice {
    void print(DiscountStrategy strategy, int price) {
        int discountPrice = strategy.getDiscountPrice(price);
        System.out.println("Discount Price: " + discountPrice);
        System.out.println("Sales Price: " + (price - discountPrice));
    }
}
