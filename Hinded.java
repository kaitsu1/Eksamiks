package Algoritm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Sulle antakse ette mitu gruppi tudengite hindeid. Kuna maksimum hinne on
 * tegelikult 60 punkti, pead esiteks kõik suuremad arvud 60 peale ümardama.
 * Teiseks leia mitu tudengit said alla keskmise iga grupi kohta?
 */
public class Hinded {

    // Main klass on ainult sulle endale testimiseks
    public static void main(String[] args) {

        /*System.out.println(allaKeskmise(new int[]{19, 45, 55, 67, 89}));
        System.out.println(allaKeskmise(new int[]{55, 23, 88, 56, 43, 90, 34}));
        System.out.println(allaKeskmise(new int[]{21, 85, 45})); */
        int[] hinded1 = {19, 45, 55, 67, 89};
        int[] hinded2 = {55, 23, 88, 56, 43, 90, 34};
        int[] hinded3 = {21, 85, 45};
        int summa1 = 0;
        int summa2 = 0;
        int summa3 = 0;
        int loendur1 = 0;
        int loendur2 = 0;
        int loendur3 = 0;
        int keskmine1;
        int keskmine2;
        int keskmine3;

        for (int i = 0; i < hinded1.length; i++) {
            if (hinded1 [i] >60) {
                hinded1 [i] = 60;
            }
            summa1 = summa1 + hinded1[i]; // summa1 = 0+ hinne kohal 1=19 +...
        }
        /*for (int i = 0; i < hinded1.length; i++) { // i= 0 võetakse 19, naide MASSIIVI PIKKUS= hinded1.length=5 hinnet
        }*/
        keskmine1 = summa1 / hinded1.length;
        for (int i = 0; i <hinded1.length ; i++) { // käiakse läbi kõik hinded
                if (hinded1[i]<keskmine1) {  //kui hinded kohal 0 on väiksem, kui keskmine1, siis
                    loendur1++; //lisat
                }
        }
        System.out.println(summa1);
        System.out.println(keskmine1);
        System.out.println(loendur1);
        System.out.println("Esimeses grupis sai alla keskmise " + loendur1+ " tudengit");

        for (int i = 0; i < hinded2.length; i++) {
            if (hinded2 [i] >60) {
                hinded2[i] = 60;
            }
            summa2 = summa2 + hinded2[i]; // summa2 = 0+ hinne kohal 1=19 +...
        /*for (int i = 0; i < hinded2.length; i++) { // i= 0 võetakse 55, naide MASSIIVI PIKKUS= hinded1.length=7 hinnet*/
    }
        keskmine2 = summa2 / hinded2.length;
        for (int i = 0; i <hinded2.length ; i++) { // käiakse läbi kõik hinded
        if (hinded2[i]<keskmine2) {  //kui hinded kohal 0 on väiksem, kui keskmine1, siis
            loendur2++; //lisatakse loendurisse 1 juurde
        }
    }
        System.out.println(summa2);
        System.out.println(keskmine2);
        System.out.println(loendur2);
        System.out.println("teises grupis sai alla keskmise " + loendur2+ " tudengit");

        for (int i = 0; i < hinded3.length; i++) {
            if (hinded3 [i] >60) {
                hinded3[i] = 60;
            }
            summa3 = summa3 + hinded3[i]; // summa1 = 0+ hinne kohal 1=19 +...

        /*for (int i = 0; i < hinded3.length; i++) { // i= 0 võetakse 21, naide MASSIIVI PIKKUS= hinded1.length=3 hinnet*/

        }
        keskmine3 = summa3 / hinded3.length;
        for (int i = 0; i <hinded3.length ; i++) { // käiakse läbi kõik hinded
            if (hinded3[i]<keskmine3) {  //kui hinded kohal 0 on väiksem, kui keskmine1, siis
                loendur3++; //lisatakse loendurisse 1 juurde
            }
        }
        System.out.println(summa3);
        System.out.println(keskmine3);
        System.out.println(loendur3);
        System.out.println("Kolmandas grupis sai alla keskmise " + loendur3+ " tudengit");
}
}
  /*  // Siia meetodi sisse kirjuta lahendus.
    private static int allaKeskmise(int[] ints) { //
        for (int i = 0; i < ints.length; i++) {
            if (ints [i] >60) { //ümardab üle 60p tulemused 60 peale
                ints [i] = 60;
            }
            System.out.println(ints [i]); //prindib kõik eraldi ridadele
        }
        System.out.println(Arrays.toString(ints)); // prindib massivina

        int loendur = 0;
        int summa = 0;

        while (loendur < ints.length) {
            summa = summa + ints[loendur];
            loendur = loendur + 1;
        }
        System.out.println(summa);

        double keskmine = summa/ints.length;
        System.out.println(ints.length);
        System.out.println(keskmine);

        int vastus = 0;

        for (int i = 0; i < ints.length; i++) {
            if (ints [i] < keskmine) {
                vastus++;
            }
        }
        return vastus;
    }

}
 */