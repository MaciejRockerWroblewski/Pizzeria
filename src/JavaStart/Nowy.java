package JavaStart;

public class Nowy {
    /**
     * Napisz program, w którym zadeklarujesz zmienne, które będą reprezentować samochód w salonie samochodowym poprzez:
     * <p>
     * Markę
     * Model
     * Rocznik
     * Cenę
     * <p>
     * Możesz również dodać dowolne zmienne, które samodzielnie uznasz za stosowne.
     * Do reprezentacji każdego z powyższych elementów wykorzystaj najbardziej odpowiedni Twoim zdaniem typ danych.
     * <p>
     * Na końcu wyświetl informacje o samochodzie, które przypisałeś do zmiennych.
     */


    public static void main(String[] args) {

        String marka = "Fiat";
        String model = "Uno";
        int rocznik = 2000;
        double cena = 3499.99;

        System.out.println("Twój samochód to " + marka + " " + model + ".");
        System.out.println("Został wyprodukowany w roku " + rocznik + ", a cena wynosi " + cena + "zł");
    }
}

