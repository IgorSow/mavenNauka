import calk.AdvancedCalkImpl;
import calk.CalkImpl;
import car.Car;
import car.Carlmpl;
import calk.Calk;
import graphic.*;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("PROGRAM z konsoli");


        Car car = new Carlmpl("Samochod");

        System.out.println(car);
        System.out.println(car.getFiat());

        Calk calk1 = new AdvancedCalkImpl();

        System.out.println(calk1.dziel(9, 7));

        Circle graphicObject1 = new Circle(4, 5);
        graphicObject1.present();
        graphicObject1.resize();

//  TABLICA NA ABSTRAKT

        GraphicObject[] graphicObjectsTABLICA = new GraphicObject[2];

        GraphicObject line = new Line(1, 2);
        graphicObjectsTABLICA[0] = line;

        GraphicObject circle = new Circle(22,22);
        graphicObjectsTABLICA[1] = circle;

        for (int i = 0; i < graphicObjectsTABLICA.length; i++) {
            System.out.println(graphicObjectsTABLICA[i].getX());
            System.out.println(graphicObjectsTABLICA[i].getY());
            graphicObjectsTABLICA[i].present();
        }

// tablica na INTERFACE

        Calk[] calkTABLICA = new Calk[10];

        calkTABLICA[0] = new CalkImpl();

        calkTABLICA[0].dodaj(5,5);


// tablica punktow KWADRAT


        int[] wspolrzedne = {1,2,3,45,67,8,67,67};

        Kwadrat kwadrat1 = new Kwadrat(wspolrzedne);

// pole kola


        Kolo kolo1 = new Kolo(2,4,5);



        System.out.println( kolo1.obliczPole());


        Scanner scanner = new Scanner(System.in);

        //
//        zczytac z
//        klawiatury cyfre i utworzyc odpowiedni obiekt
//                1 - kolo i policzyc pole
//                2 - kwadrat i policzyc pole
//                3- trojkat - nic nie liczyc bo nie ma,
//                wyswietlic ze nie istnieje

        System.out.println("//        zczytac z\n" +
                "        klawiatury cyfre i utworzyc odpowiedni obiekt\n" +
                "                1 - kolo i policzyc pole\n" +
                "                2 - kwadrat i policzyc pole\n" +
                "                3- trojkat - nic nie liczyc bo nie ma,\n" +
                "                wyswietlic ze nie istnieje");


// z pliku
//        int sprFirury = scanner.nextInt();
//
//        if (sprFirury == Figures.KOLO.getValue()) {
//            enumComparasion(Figures.KOLO);
//        }
//
//        public static void en
//        switch (sprFirury) {
//
//            case KOLO

//        }








    }
}


