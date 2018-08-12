package ticTacToe;

public class Game {

    private int row;
    private int col;
    private Sign sign;
    private Board board1 = new Board();

    public Game() {
    }


    public void addPlayerSign(int row, int col, Sign sign) {

        board1.setBoard(row, col, sign);
        board1.printTable();
        compareResult();

    }

    public Board startGame() {

        System.out.println("Let's get start ! :)");
        board1.buildTable();
        board1.printTable();
        return board1;
    }

    public void compareResult()
    {

        int p00 = board1.getBoard(0, 0).getValue();
        int p01 = board1.getBoard(0, 1).getValue();
        int p02 = board1.getBoard(0, 2).getValue();
        int p10 = board1.getBoard(1, 0).getValue();
        int p11 = board1.getBoard(1, 1).getValue();
        int p12 = board1.getBoard(1, 2).getValue();
        int p20 = board1.getBoard(2, 0).getValue();
        int p21 = board1.getBoard(2, 1).getValue();
        int p22 = board1.getBoard(2, 2).getValue();

        if (((p00 == p01) && (p01 == p02) && p00 == p02) && (p00 == 1 || p00 == 2)) {
            endGame(p00);

        } else if (((p10 == p11 && p11 == p12)) && (p10 == 1 || p10 == 2)) {
            endGame(p10);

        } else if (((p20 == p21 && p21 == p22)) && (p20 == 1 || p20 == 2)) {
            endGame(p20);



        } else if (((p00 == p10 && p10 == p20)) && (p00 == 1 || p00 == 2)) {

            endGame(p00);

        } else if (((p01 == p11 && p11 == p21)) && (p01 == 1 || p01 == 2)) {
            endGame(p01);

        } else if (((p02 == p12 && p12 == p22)) && (p02 == 1 || p02 == 2)) {
            endGame(p02);




        } else if (((p00 == p11 && p11 == p22)) && (p00 == 1 || p00 == 2)) {
            System.out.println(p00);
            endGame(p00);

        } else if (((p22 == p11 && p11 == p02)) && (p22 == 1 || p22 == 2)) {
            endGame(p00);


        } else
            System.out.println("Gra toczy sie dalej");

    }

    public void endGame(int namePlayer){

        if (namePlayer == 1) {
            System.out.println("WYGRAL GRACZ : ");
            System.out.println("Gracz ktory wybral X");
        }
        if (namePlayer == 2) {
            System.out.println("WYGRAL GRACZ : ");
            System.out.println("Gracz ktory wybral O");
        }
        System.exit(0);


    }
}
