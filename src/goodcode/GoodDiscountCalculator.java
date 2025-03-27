// Hinweis in der Ausgabe: Regulärer Preis = 100 CHF, Premium Preis = 200 CHF
package goodcode;

import goodcode.strategy.*;

public class GoodDiscountCalculator {

    public static void main(String[] args) {
        double regularPriceCHF = 100.0;
        double premiumPriceCHF = 200.0;

        // Ausgabe in grüner Farbe
        System.out.println("\033[32mRegulärer Preis ist 100 CHF und 200 CHF ist Premium\033[0m");
        System.out.println();

        // Verwende Strategy für Regular-Kunden
        DiscountContext discountContext = new DiscountContext(new RegularDiscountStrategy());
        double regularDiscountCHF = discountContext.getDiscount(regularPriceCHF);
        System.out.println("Regular Price after discount: " + (regularPriceCHF - regularDiscountCHF) + " CHF");

        System.out.println("---------------");

        // Wechsle Strategy für Premium-Kunden
        discountContext.setDiscountStrategy(new PremiumDiscountStrategy());
        double premiumDiscountCHF = discountContext.getDiscount(premiumPriceCHF);
        System.out.println("Premium Price after discount: " + (premiumPriceCHF - premiumDiscountCHF) + " CHF");
    }
}
