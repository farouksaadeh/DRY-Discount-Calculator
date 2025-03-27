package goodcode.strategy;

public class RegularDiscountStrategy implements DiscountStrategy {
    @Override
    public double calculateDiscount(double priceCHF) {
        double discount = priceCHF * 0.10; // 10% Rabatt: 10% von 100 CHF = 10 CHF
        System.out.println("Regular discount calculated: " + discount + " CHF (10%)");
        return discount;
    }
}
