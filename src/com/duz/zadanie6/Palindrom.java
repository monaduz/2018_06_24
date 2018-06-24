/*
Zadanie 6. Sprawdź czy ciągi znaków są palindromem.
Wejście: Plik z ciągami znaków oddzielonymi od siebie znakiem nowej linii.
Wyjście: Na wyjściu mają pojawić się wszystkie ciągi znaków, które są
palindromami.
Poszczególne ciągi znaków należy rozdzielić znakami nowej linii.
 */

package com.duz.zadanie6;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Palindrom {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File( "/home/mona/IdeaProjects/2018_06_24/src/com/duz/zadanie6/inlet6.txt" );
        Scanner scanner = new Scanner( file );

        while (scanner.hasNext()) {
            String wyraz = scanner.nextLine();
            char[] tablica = wyraz.toCharArray();
            if (isItPalindrom( tablica )==true)
                System.out.println(tablica);
        }
    }

    public static boolean isItPalindrom(char[] tablica) {
            for (int i = 0, j=tablica.length-1; i < j ; i++, j--) {
                if (tablica[i] != tablica[j]) {
                    return false;
                }
            }
            return true;
        }
    }