/*
Zadanie 5. Zaimplementuj algorytm, który oblicza sumę
pojawiających się na wejściu liczb.
Wejście: Plik z liczbami całkowitymi od -100 do 100 oddzielonymi
od siebie znakiem nowej linii.
Wyjście: Na wyjściu ma się pojawić ciąg liczbowy, którego i-ta
pozycja jest równa sumie i pierwszych wczytanych z wejścia
liczb. Poszczególne liczby należy rozdzielić znakami nowej linii.
 */

package com.duz.zadanie5;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Sumator {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File ("/home/mona/IdeaProjects/2018_06_24/src/com/duz/zadanie5/inlet.txt");
        Scanner scanner = new Scanner (file);
        int sum=0;
        while (scanner.hasNext()){
            sum+=scanner.nextInt();
            System.out.println(sum);
        }

//
//        int tableSize = 6;
//        int[] inlet = new int[tableSize];
//        int[] outlet = new int[tableSize];
//
//        for (int i = 0; i <inlet.length ; i++) {
//            inlet[i] =  scanner.nextInt();
//        }
//
//        int sum=0;
//        for (int i = 0; i < outlet.length; i++) {
//            sum+=inlet[i];
//            outlet[i]=sum;
//            System.out.println(outlet[i]);
//        }
    }
}
