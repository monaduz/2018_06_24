/*
Zadanie 7. Zaimplementuj algorytm, który dla podanej kwoty poda
w jaki sposób
można wypłacać ją możliwie najmniejszą liczbą
banknotów i monet.
Wejście: n - liczba niecałkowita reprezentująca kwotę np. 235,25.
Wyjście: Liczba użytych banknotów i monet oraz ich nominał.
 */


package com.duz.com.duz.zadanie7;

import java.util.Scanner;

public class Reszta {
    public static void main(String[] args) {
        System.out.println( "podaj kwotę" );
        Scanner scanner = new Scanner( System.in );
        double amount = scanner.nextDouble();

        coinGr( coinGr( coinGr( coinGr( coinGr( coinGr(
                coinZl(coinZl(coinZl(
                banknote( banknote( banknote( banknote( banknote( banknote( amount,
                        500 ), 200 ), 100 ), 50 ), 20 ), 10 ),
                5), 2), 1),
                50 ), 20 ), 10 ), 5 ), 2 ), 1 );
    }

    public static double banknote(double amount, int value) {
        int counter;
        counter = (int) (amount / value);
        if (counter != 0) System.out.println( "banknot " + value + " zł: " + counter );
        return amount - counter * value;
    }

    public static double coinZl(double amount, int value) {
        int counter;
        counter = (int) (amount / value);
        if (counter != 0) System.out.println( "moneta " + value + " zł: " + counter );
        return amount - counter * value;
    }

    public static double coinGr(double amount, int value) {
        int coinAmount = (int) (amount*100);
        int counter;
        counter = (coinAmount / value);
        if (counter != 0) System.out.println( "moneta " + value + " gr: " + counter );
        return amount - (counter * ((double)value)/100);
    }
}
