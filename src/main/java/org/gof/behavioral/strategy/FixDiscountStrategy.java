package org.gof.behavioral.strategy;

public class FixDiscountStrategy implements DiscountStrategy {
    @Override
    public int getDiscountPrice(int price) {
        if (price < 10000) {
            return 0;
        }
        if (price < 30000) {
            return 1000;
        }
        if (price < 50000) {
            return 2000;
        }
        if (price < 100000) {
            return 3000;
        }
        return 5000;
    }
}
