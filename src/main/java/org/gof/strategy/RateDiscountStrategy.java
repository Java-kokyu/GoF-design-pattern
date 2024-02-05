package org.gof.strategy;

public class RateDiscountStrategy implements DiscountStrategy{
    @Override
    public int getDiscountPrice(int price) {
        if (price < 10000) {
            return 0;
        }
        if (price < 30000) {
            return (int) (price * 0.03);
        }
        if (price < 50000) {
            return (int) (price * 0.05);
        }
        if (price < 100000) {
            return (int) (price * 0.1);
        }
        return (int) (price * 0.12);
    }
}
