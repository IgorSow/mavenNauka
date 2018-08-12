package beer;

import java.util.Arrays;

public class Impreza {

    private Piwo[] piwa = new Piwo[10];

    int licznikTablicy = 0;

    double losowaLiczba;


    public void addPiwo (Piwo newPiwo) {

        piwa[licznikTablicy] = newPiwo;

        licznikTablicy++;



    }

    private int losowaniePozycji() {



        losowaLiczba = Math.random();

        losowaLiczba = losowaLiczba * 10;


        return (int) losowaLiczba;

    }

    public void losujPiwo() {

      int a = losowaniePozycji();


        System.out.println("Wylosowane piwo to: " + piwa[a].getGatunekPiwa() + " " + piwa[a].getKolorPiwa());

    }



    }
