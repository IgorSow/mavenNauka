package calk;


public class AdvancedCalkImpl implements Calk {


    @Override
    public int dodaj(int a, int b) {
        return Math.addExact(a,b);
    }

    @Override
    public int odajmij(int a, int b) {
        return Math.subtractExact(a, b);
    }

    @Override
    public int mnoz(int a, int b) {
        return Math.multiplyExact(a, b);
    }

    @Override
    public double dziel(double a, double b) {
        return a/b;
    }
}
