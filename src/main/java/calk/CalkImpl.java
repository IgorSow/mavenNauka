package calk;

public class CalkImpl implements  Calk, newCalk {


    public int dodaj(int a, int b) {

        int c;

        c = a + b;

        return c;
    }

    public int odajmij(int a, int b) {

        int c;
        c = a - b;

        return c;
    }

    public int mnoz(int a, int b) {
        int c;

        c = a * b;

        return c;
    }

      public double dziel(double a, double b) {
        return 0;
    }

    public double dziel(int a, int b) {

        double c;

        c = a / b;

        return c;
    }


    @Override
    public int multiplyByItself(int a) {
        return 0;
    }
}
