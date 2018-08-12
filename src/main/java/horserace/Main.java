package horserace;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String... args) {
        double valueBet;

        Scanner scanner = new Scanner(System.in);
        Hourse hourse = new Hourse();
        Bookmark bookmark = new Bookmark();


        System.out.println("Wybierz nr konia, na ktorego chcesz postawic: ");
        System.out.println("Wybierz nr od 0 do 3: ");
        System.out.println("0 - " + hourse.ListOfHource().get(0));
        System.out.println("1 - " +hourse.ListOfHource().get(1));
        System.out.println("2 - " +hourse.ListOfHource().get(2));
        System.out.println("3 - " +hourse.ListOfHource().get(3));
        int playersSelectionOfHourse = scanner.nextInt();

        System.out.println("Ile chcesz obstawić: ");
        System.out.println("Wartosc nie moze przekroczyc 50% salda: ");
        System.out.println("Saldo to: " + bookmark.getBalance());


        do {

            valueBet = scanner.nextDouble();
        }
        while((bookmark.getBalance()/2) < valueBet);

        bookmark.setHighBet(valueBet);



        int winningHourse = hourse.WinningHourse();

        System.out.println("Wygral " + hourse.ListOfHource().get(winningHourse));



        Integer a = playersSelectionOfHourse;
        Integer b = winningHourse;
        int compare = a.compareTo(b);


            if (compare == 0) {
                System.out.println("WYGRALES :D ");
                bookmark.winBet();
                System.out.println("SALDO PO WYGRANEJ: " + bookmark.getBalance());
            }else {

                System.out.println("PRZEGRALES :( ");
                bookmark.lostBet();
                System.out.println("SALDO PO PRZEGRANEJ " + bookmark.getBalance());
            }




        


    }
}


