# DRY Discount Calculator

## 1. Konzept

### a) Zweck des Projekts (What is the purpose of the project?)
In diesem Projekt geht es darum, das **DRY (Don't Repeat Yourself)**-Prinzip anhand einer einfachen Rabattberechnung zu demonstrieren. Wir wollen zeigen, wie man Code-Duplikation vermeidet, indem wir einerseits ein schlechtes Beispiel (mit dupliziertem Code) und andererseits ein gutes Beispiel (unter Verwendung des **Strategy Patterns**) gegenüberstellen.

### b) Warum ist das Projekt nützlich? (Why is the project useful?)
- **Bessere Wartbarkeit**: Durch die Einhaltung des DRY-Prinzips müssen Änderungen nur an einer Stelle vorgenommen werden.
- **Leichteres Verständnis**: Das Projekt verdeutlicht, wie man wiederkehrende Logik sauber kapseln kann.
- **Erweiterbarkeit**: Neue Rabattstrategien können leicht ergänzt werden, ohne dass bestehender Code dupliziert oder stark verändert werden muss.

### c) Wie können Nutzer*innen mitmachen? (How can users participate?)
- **Issues** erstellen: Für Fehlermeldungen, Funktionswünsche oder allgemeines Feedback.
- **Pull Requests** einreichen: Eigene Ideen und Verbesserungen können gerne in Form von Pull Requests eingebracht werden.
- **Diskussionen**: Fragen oder Vorschläge können in den Discussions oder Issues gestellt und diskutiert werden.

### d) Wo gibt es Support? (Where to get support?)
- **GitHub-Issues**: Stelle deine Fragen oder Probleme als Issue.
- **Dokumentation**: Dieses README enthält bereits die wichtigsten Informationen.
- **Community**: Austauschen und Vernetzen kannst du dich mit anderen über die GitHub-Discussions.

### e) Wer pflegt das Projekt? (Who is maintaining the project?)
- **Maintainer:** Farouk Saadeh ([`@farouksaadeh`](https://github.com/farouksaadeh))
- **Kontakt:** [farouk.saadeh@lernende.bbw.ch](mailto:farouk.saadeh@lernende.bbw.ch)

---

## 2. Überblick & Einleitung

Dieses Repository beinhaltet zwei Java-Beispiele für eine einfache Rabattberechnung, die in der Konsole Ausgaben generieren. Beide Beispiele lösen die gleiche Aufgabe (Rabatt für Regular- und Premium-Kunden berechnen), unterscheiden sich jedoch in ihrer Code-Struktur:

1. **Schlechtes Beispiel**
    - Verstösst gegen das **DRY-Prinzip**, da Code dupliziert wird.
2. **Gutes Beispiel**
    - Hält das **DRY-Prinzip** ein, indem das **Strategy Pattern** verwendet wird.

**Design Principle:**  
Wir betrachten das **DRY (Don't Repeat Yourself)**-Prinzip. Es besagt, dass jede Wissenseinheit im Code nur einmal existieren sollte, um Wartungsaufwand und Fehleranfälligkeit zu reduzieren.

**Design Pattern:**  
Das **Strategy Pattern** erlaubt es, verschiedene Algorithmen (hier: Rabattberechnungen) in separate Klassen auszulagern, die alle ein gemeinsames Interface implementieren. Dadurch wird vermieden, dass wir denselben Code in mehreren Methoden duplizieren.

---

## 3. Installation (Installation instructions)

1. **Repository klonen**
   ```bash
   git clone https://github.com/farouksaadeh/DRY-Discount-Calculator.git
   ```
2. **In einer Java-IDE öffnen**  
   Du kannst z.B. IntelliJ, Eclipse oder VS Code verwenden.
3. **Abhängigkeiten**
- Keine zusätzlichen Bibliotheken nötig.
- Du benötigst **Java 8** (oder höher).
4. **Kompilieren**  
   In deiner IDE oder über das Terminal:

    ```bash
    cd DRY-Discount-Calculator javac ./badcode/.java ./goodcode/.java ./goodcode/strategy/*.java
    ```


---

## 4. Verwendung (Usage instructions)

### Schlechtes Beispiel
1. Starte in deiner IDE die Klasse:

    ```bash
    badcode.BadDiscountCalculator
    ```

2. Die Konsole zeigt Rabattberechnungen für Regular- und Premium-Kunden an, jedoch mit dupliziertem Code.  
   **Hinweis:** In der Ausgabe wird in grüner Farbe angezeigt, dass der reguläre Preis 100 CHF und der Premium-Preis 200 CHF beträgt.

### Gutes Beispiel
1. Starte in deiner IDE die Klasse:

    ```bash
    goodcode.GoodDiscountCalculator
    ```
2. Die Konsole zeigt ebenfalls Rabattberechnungen für Regular- und Premium-Kunden an. Hier wird das **Strategy Pattern** verwendet, um das DRY-Prinzip einzuhalten.  
   **Hinweis:** Auch hier erscheint oben in grüner Farbe der Hinweis, dass der reguläre Preis 100 CHF und der Premium-Preis 200 CHF beträgt.

---

## 5. Contributing (Contributing guidelines)

Ich freue mich über jeden Beitrag. So kannst du mithelfen:

1. **Fork** dieses Repositories.
2. Erstelle einen neuen Branch:
    ```bash
    git checkout -b feature/your-improvement
    ```
3. Führe deine Änderungen durch und committe sie:
    ```bash
    git add . git commit -m "Beschreibung deiner Änderungen"
    ```

4. Sende einen **Pull Request** an das Haupt-Repository.
5. Diskutiere deine Änderungen mit den Maintainer*innen im Code Review.

---

## 6. Lizenz (License information)

Dieses Projekt steht unter der **MIT License**. Details findest du in der Datei [`LICENSE`](LICENSE) im Repository. Du darfst den Code frei nutzen, verändern und weitergeben, solange du die Lizenzbestimmungen einhältst.

---

## 7. Design Principle & Design Pattern Erklärung

**Design Principle – DRY (Don't Repeat Yourself):**  
Das DRY-Prinzip besagt, dass jede Wissenseinheit im Code nur einmal vorhanden sein sollte. Ziel ist es, Code-Duplikation zu vermeiden, was die Wartbarkeit verbessert und Fehler reduziert. Wenn dieselbe Logik mehrfach implementiert wird, muss bei Änderungen an mehreren Stellen eingegriffen werden – das macht den Code fehleranfällig und schwer erweiterbar.

**Verwendetes Design Pattern – Strategy Pattern:**  
Das Strategy Pattern kapselt verschiedene Algorithmen (hier: unterschiedliche Rabattberechnungen) in separaten Klassen, die ein gemeinsames Interface implementieren. Dies ermöglicht es, zur Laufzeit zwischen verschiedenen Berechnungsstrategien zu wechseln, ohne den restlichen Code zu ändern. Dieses Pattern hilft, das DRY-Prinzip einzuhalten, da die gemeinsame Logik zentral gepflegt und nicht dupliziert wird.

**Warum ist das "schlechte" Codebeispiel schlecht?**  
Im **BadDiscountCalculator** werden für Regular- und Premium-Kunden jeweils eigene Methoden verwendet, die dieselbe Logik (Berechnung und Ausgabe des Rabatts) enthalten. Diese Duplizierung führt dazu, dass jede Änderung in mehreren Stellen vorgenommen werden muss, was die Wartung erschwert und die Fehleranfälligkeit erhöht.

**Warum ist das "gute" Codebeispiel gut?**  
Im **GoodDiscountCalculator** wird das Strategy Pattern eingesetzt. Durch die Auslagerung der Rabattlogik in separate Klassen (RegularDiscountStrategy und PremiumDiscountStrategy) wird Code-Duplikation vermieden. Änderungen an der Rabattberechnung erfolgen nur in der entsprechenden Strategie-Klasse, was den Code modular, erweiterbar und wartungsfreundlich macht.

---

## 8. Quellcode

### Schlechtes Beispiel (Bad Code)

**`BadDiscountCalculator.java`**

```java
package badcode;

public class BadDiscountCalculator {

 public static void main(String[] args) {
     double regularPriceCHF = 100.0;
     double premiumPriceCHF = 200.0;
     
     // Ausgabe in grüner Farbe, um Basiswerte anzuzeigen
     System.out.println("\033[32mRegulärer Preis ist 100 CHF und 200 CHF ist Premium\033[0m");
     System.out.println();

     // Duplizierter Code für Regular und Premium
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
```
***Beispielausgabe:***

```java
(Regulärer Preis ist 100 CHF und 200 CHF ist Premium in grün)
Regular discount: 10.0 CHF (10%)
Premium discount: 40.0 CHF (20%)
Regular Price after discount: 90.0 CHF
Premium Price after discount: 160.0 CHF
```

---

### Gutes Beispiel (Good Code)

**`DiscountStrategy.java`**

```java
package goodcode.strategy;

public interface DiscountStrategy {
    /**
     * Berechnet den Rabattbetrag in CHF.
     * @param priceCHF Ursprünglicher Preis in CHF.
     * @return Rabattbetrag in CHF.
     */
    double calculateDiscount(double priceCHF);
}
```

<br />


**`RegularDiscountStrategy.java`**

```java
package goodcode.strategy;

public class RegularDiscountStrategy implements DiscountStrategy {
    @Override
    public double calculateDiscount(double priceCHF) {
        double discount = priceCHF * 0.10; // 10% Rabatt: 10% von 100 CHF = 10 CHF
        System.out.println("Regular discount calculated: " + discount + " CHF (10%)");
        return discount;
    }
}
```
<br />

**`PremiumDiscountStrategy.java`**

```java
package goodcode.strategy;

public class PremiumDiscountStrategy implements DiscountStrategy {
    @Override
    public double calculateDiscount(double priceCHF) {
        double discount = priceCHF * 0.20; // 20% Rabatt: 20% von 200 CHF = 40 CHF
        System.out.println("Premium discount calculated: " + discount + " CHF (20%)");
        return discount;
    }
}
```

<br />

**`DiscountContext.java`**

```java
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
```

<br />

**`GoodDiscountCalculator.java`**

```java
// Hinweis in der Ausgabe (grün): Regulärer Preis = 100 CHF, Premium Preis = 200 CHF
package goodcode;

import goodcode.strategy.*;

public class GoodDiscountCalculator {

    public static void main(String[] args) {
        double regularPriceCHF = 100.0;
        double premiumPriceCHF = 200.0;
        
        // Ausgabe in grüner Farbe, um Basiswerte anzuzeigen
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
```
***Beispielausgabe:***

```java
(Regulärer Preis ist 100 CHF und 200 CHF ist Premium in grün)
Regular discount calculated: 10.0 CHF (10%)
Regular Price after discount: 90.0 CHF
---------------
Premium discount calculated: 40.0 CHF (20%)
Premium Price after discount: 160.0 CHF

```

## 9. Weiterführende Informationen

- **DRY-Prinzip:** [Clean Code Developer – Don't Repeat Yourself](https://clean-code-developer.de/die-grade/roter-grad/#elementor-toc__heading-anchor-1)
- **Strategy Pattern:** [Refactoring Guru – Strategy](https://refactoring.guru/design-patterns/strategy)
- **Markdown & README:**
    - [GitHub Docs – About READMEs](https://docs.github.com/de/repositories/managing-your-repositorys-settings-and-features/customizing-your-repository/about-readmes)
    - [Medium – The art of crafting an effective README](https://medium.com/@sumudithalanz/the-art-of-crafting-an-effective-readme-for-your-github-project-cf425a8b1580)

## 10. Fazit

- **DRY-Prinzip:** Das DRY-Prinzip (Don't Repeat Yourself) vermeidet Code-Duplikation, was die Wartung und Erweiterbarkeit verbessert.
- **Strategy Pattern:** Das Strategy Pattern ermöglicht es, verschiedene Varianten einer Berechnung (hier: Rabatte) flexibel und modular zu implementieren.
- **Schlechtes Beispiel:** Zeigt, wie duplizierter Code zu erhöhter Fehleranfälligkeit und grösserem Aufwand führt.
- **Gutes Beispiel:** Nutzt das Strategy Pattern, um DRY einzuhalten und den Code sauber zu strukturieren.

