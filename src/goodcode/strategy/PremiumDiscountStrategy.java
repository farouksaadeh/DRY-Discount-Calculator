package goodcode.strategy;

public class PremiumDiscountStrategy implements DiscountStrategy {
    @Override
    public double calculateDiscount(double priceCHF) {
        double discount = priceCHF * 0.20; // 20% Rabatt: 20% von 200 CHF = 40 CHF
        System.out.println("Premium discount calculated: " + discount + " CHF (20%)");
        return discount;
    }
}
