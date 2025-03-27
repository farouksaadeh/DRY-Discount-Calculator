package goodcode.strategy;

public class DiscountContext {
    private DiscountStrategy discountStrategy;

    public DiscountContext(DiscountStrategy discountStrategy) {
        this.discountStrategy = discountStrategy;
    }

    public void setDiscountStrategy(DiscountStrategy discountStrategy) {
        this.discountStrategy = discountStrategy;
    }

    /**
     * Berechnet den Rabatt anhand der aktuell gesetzten Strategie.
     * @param priceCHF Ursprünglicher Preis in CHF.
     * @return Rabattbetrag in CHF.
     */
    public double getDiscount(double priceCHF) {
        return discountStrategy.calculateDiscount(priceCHF);
    }
}
