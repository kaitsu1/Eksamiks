package Algoritm;

import java.util.Arrays;

/**
 * Antud on massiiv. Mitu sõne on massiivis keskmisest pikemad?
 */

    public class PikadSoned {
        public static void main(String[] args) {
            String[] naide = {"kaalikas", "joonas", "maakera", "homeros", "mandel"}; // vastus on 3
            int taheloendur = 0; // muutuja, mis loeb ära tähtede arvu kõikides sõnades, algväärtus=0
            int keskmine; // muutuja, mis arvutab keskmise tähtede arvu
            int loendur = 0; // muutuja, mis loendab keskmisest pikemaid sõnu

            for (int i = 0; i < naide.length; i++) { // i= 0 võetakse kaalikas, naide length=5 sõna
                taheloendur = taheloendur + naide[i].length(); // taheloenduralgul 0 lisatakse esimese sõne pikkus=tähemärkide arv
            } // TSÜKLIT TEHAKS NII KAUA KUNI KÕIKIDE SÕNADE tähemärgid on kokku liidetud
            keskmine = taheloendur/naide.length; // keskmise arvutamiseks jagatakse tähtede arv/ sõnade arvuga
            for (int i = 0; i <naide.length ; i++) { // käiakse läbi kõik sõnad
                if (naide[i].length()>keskmine){  //kui näide kohal 0 on suurem, kui keskmine, siis
                    loendur++; //lisatakse loendurisse 1 jne
                }
            }
            System.out.println("Keskmisest pikemad on "+loendur+" sõne!");
            System.out.println(keskmine);
            System.out.println(taheloendur);
        }

    }
