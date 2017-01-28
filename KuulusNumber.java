package Algoritm;

/**
 * Antud on int[] massiiv. Eemalda kõik nr 3 väärtused ja leia millist numbrit esineb kõige siis rohkem?
 * Mitte siis number, mis on kolmandal indeksil, vaid nr kolm ise.
 */
public class KuulusNumber {

    public static void main(String[] args) {

        int[] naide = {1, 5, 3, 3, 6, 3, 7, 7}; // vastus on 7 //intide massiiv
        int number =0; // luuakse uus int muutuja nimega nr ja selle algväärtus=0
        int loendur =0;//luuakse uus int nimega loendur ja selle algväärtus=0
        int maxloendur =0;//luuakse uus int nimega maxloendur ja selle algväärtus=0
        int maxnumber=0;//luuakse uus int nimega maxnr ja selle algväärtus=0

        for (int i = 0; i < naide.length; i++) { //pannakse tsüklisse käiakse läbi alustades kohal 0, lisades iga tsüki lõpus 1 -alustab kohalt1(käib läbi kohad 0-7), kuni tsüklipikkus naidelength=8 on läbi käidus
            if (naide[i]!=3){ //esimesena näide kohal 0, ei ole 3 siis..
                number = naide[i];// number=1
            }
            for (int j = i; j < naide.length; j++) { // hakkab samast kus eelmine tsükkel ja käib kuni naidelength lõpuni- Siin võrdleb kõigepealt nr 1-ga kõik arvud läbi
                if(number == naide[j]){ // kui 1=1, // esimeses tsüklis 1=5
                    loendur++; //loendurit suurendatakse 1 võrra //loendurit ei suurendata
                }
            }
            if (loendur>maxloendur){ // vaadatakse mitu 1 sai
                maxloendur = loendur; // algul max loendur 0 ja loendur=1 //maxloendur algul 0, saab endale väärtuse 1,
                maxnumber = number; // maxnralgul=0, saab endale vääruseks nr1 =1
            }
            loendur = 0; //esimese suure tsüklilõpus nullitakse loendur ära
        }
        System.out.println("Enim esinenud number on "+maxnumber+", teda esines "+maxloendur+" korda.");
    }

}