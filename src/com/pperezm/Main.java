package com.pperezm;

import java.util.ArrayDeque;
import java.util.SortedSet;
import java.util.TreeSet;

public class Main {

    private static boolean esCapicua(int num) {
        return num==invertirNumero(num);
    }

    private static int invertirNumero(int num){
        int cifra, inverso = 0;
        while(num>0){
            cifra = num%10;
            inverso = cifra + inverso * 10;
            num /= 10;
        }
        return inverso;
    }
    public static void main(String[] args) {
        // write your code here

        int inicio = 0;
        while(inicio <= 10000) {
            boolean capicua = esCapicua(inicio);
            System.out.println("\nEl número " + inicio +
                    (capicua?" sí":" no") + " es capicua.");
            inicio++;
        }

    }

}

