package horserace;

import java.util.Random;

public class Bookmark {


    private double balance = 100;
    private double highBet;

    public Bookmark(double highBet) {
        this.highBet = highBet;
    }
    public Bookmark(){

    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getHighBet() {
        return highBet;
    }

    public void setHighBet(double highBet) {
        this.highBet = highBet;
    }



    public double winBet(){

        balance = balance + highBet*2;

     return balance;


    }
    public  double lostBet() {

        balance = balance - highBet;

        return balance;
    }

}
