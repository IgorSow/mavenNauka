package ticTacToe;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int row;
        int col;
        Sign sign = null;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Gra kolko i krzyzyk");
        System.out.println("Zasady: znaki wprowadzamy za pomoca O i X");
        System.out.println("Rzad od 1-3 oraz kolumna 1-3");
        Game game2 = new Game();
        game2.startGame();

        for (int i = 0; i < 9; i++) {




            System.out.println("Prosze o podanie rzad: ");
            row = scanner.nextInt();
            System.out.println("Prosze o podanie kolumna: ");
            col = scanner.nextInt();
            System.out.println("Prosze podac znak X lub O");
            int signRead = scanner.nextInt();

            if (signRead == 1){
                sign = Sign.X;
            }
            if (signRead == 2){
                sign = Sign.O;
            }


            game2.addPlayerSign(row,col,sign);

        }


//
//        Game game1 = new Game();
//        game1.startGame();
//
//        game1.addPlayerSign(0,0,Sign.X);
//        game1.addPlayerSign(0,1,Sign.X);
//        game1.addPlayerSign(0,2,Sign.X);
//




    }
}



//        Board board1 = new Board();
//
//
//
//        board1.buildTable();
//        board1.printTable();
//
//        board1.setBoard(0,0,Sign.X);
//        board1.setBoard(1,1,Sign.O);
//        board1.setBoard(2,2,Sign.O);
//        board1.setBoard(1,2,Sign.X);
//
//        System.out.println(board1.getBoard(0,1).getValue());
//
//
//        board1.printTable();
