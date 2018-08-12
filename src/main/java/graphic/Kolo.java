package graphic;

public class Kolo implements ObliczPole{

    private double promien;
    private Point point;

    public Kolo(double promien, int x, int y) {
        this.promien = promien;
        this.point = new Point(x, y);
    }

    @Override
    public double obliczPole() {

        double pole = pole = Math.pow(promien , 2) * Math.PI; // PI * R'2
        return pole;
    }


    class Point {

        private int x;
        private int y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;

        }
    }
}
