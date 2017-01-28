package Algoritm;

/**
 * Antud on int[] massiiv. Korruta kõik seitsmed kahega ja leia arvude keskmine.
 */
public class MaagilineSeitse {

    public static void main(String[] args) {

        int[] naide = {7, 4, 324, 65, 4, 78, 7, 45, 4}; //intide massiiv
        int summa =0; //uuakse uus int muutuja ja antakse algväärtus 0
        int keskmine;

        for (int i = 0; i < naide.length; i++) { // length= elementide arv =9
            if(naide[i]==7){ //vaatan kas arv =7, kui on siis..
                summa= summa+(naide[i]*2);} // esialgu summa 0, kui i=0, siis summa= 0+7*2 ehk summa=14
            else{ //kui arv!=7, siis..
                summa=summa+ naide[i];} //liidetakse lihtsalt see arv summale SAADAKSE KOONDSUMMA
        }
        keskmine = summa/naide.length; // Summa/elementide arvuga= arvude keskmine
        System.out.println(keskmine);
    }

}


