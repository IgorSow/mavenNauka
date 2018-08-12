package ticTacToe;

public class Board {

    private Sign sign;
    private int row;
    private int col;

    private Sign[][] table = new Sign[3][3];

    public Board(){

    }

    public void setBoard(int row, int col, Sign sign){

        table[row][col] = sign;
    }

    public Sign getBoard(int row, int col) {
        return table[row][col];
    }

    public Sign[][] buildTable() {


        for (int i = 0; i < 3; i++) {

            for (int j = 0; j < 3; j++) {

                table[i][j] = Sign._;
            }
        }
        return table;
    }

    public Sign[][] printTable() {

        for (int i = 0; i < 3; i++) {
            System.out.println(" ");
            System.out.println("--------------");
            for (int j = 0; j < 3; j++) {

                System.out.print(table[i][j] + " ");
                System.out.print(" | ");
            }
        }
        System.out.println();
        System.out.println("--------------");
        return table;
    }




}
