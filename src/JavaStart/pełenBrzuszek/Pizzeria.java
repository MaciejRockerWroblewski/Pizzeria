package JavaStart.pełenBrzuszek;

import java.util.Locale;
import java.util.Scanner;

public class Pizzeria {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        System.out.println("WITAMY W PEłNYM BRZUSZKU.".toUpperCase(Locale.ROOT));
        System.out.println("Dostępne pizze:");
        System.out.println("-------------------------------------------");
        System.out.println("Jaką pizzę wybierasz?");
        System.out.println(" ");
        for (Pizza p : Pizza.values()) {
            System.out.println(p);
        }
        Pizza pizza = Pizza.valueOf(scanner.nextLine().toUpperCase(Locale.ROOT));

        System.out.println("Dziękujemy za zamówienie pizzy " + pizza + ".");
        scanner.close();
    }
}
