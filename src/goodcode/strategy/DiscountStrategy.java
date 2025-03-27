package goodcode.strategy;

public interface DiscountStrategy {
    /**
     * Berechnet den Rabattbetrag in CHF.
     * @param priceCHF Ursprünglicher Preis in CHF.
     * @return Rabattbetrag in CHF.
     */
    double calculateDiscount(double priceCHF);
}
