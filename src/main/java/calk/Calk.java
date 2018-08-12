package calk;

public interface Calk {

    int dodaj (int a, int b);
    int odajmij (int a, int b);
    int mnoz (int a, int b);

    default double dziel(double a, double b) {return a / b;}


}
