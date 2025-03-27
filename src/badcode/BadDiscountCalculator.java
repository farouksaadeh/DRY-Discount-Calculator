package badcode;

public class BadDiscountCalculator {

    public static void main(String[] args) {
        double regularPriceCHF = 100.0;
        double premiumPriceCHF = 200.0;

        // Ausgabe in grüner Farbe
        System.out.println("\033[32mRegulärer Preis ist 100 CHF und 200 CHF ist Premium\033[0m");
        System.out.println();

        // Duplßizierter Code für Regular und Premium
        double regularDiscountCHF = calculateRegularDiscount(regularPriceCHF);
        double premiumDiscountCHF = calculatePremiumDiscount(premiumPriceCHF);

        System.out.println("Regular discount: " + regularDiscountCHF + " CHF (10%)");
        System.out.println("Premium discount: " + premiumDiscountCHF + " CHF (20%)");

        System.out.println("Regular Price after discount: " + (regularPriceCHF - regularDiscountCHF) + " CHF");
        System.out.println("Premium Price after discount: " + (premiumPriceCHF - premiumDiscountCHF) + " CHF");
    }

    // Rabattberechnung für Regular-Kunden (10%)
    public static double calculateRegularDiscount(double priceCHF) {
        double discount = priceCHF * 0.10; // 10% von 100 CHF = 10 CHF
        return discount;
    }

    // Rabattberechnung für Premium-Kunden (20%)
    public static double calculatePremiumDiscount(double priceCHF) {
        double discount = priceCHF * 0.20; // 20% von 200 CHF = 40 CHF
        return discount;
    }
}
