package graphic;

public class Kwadrat {
    private Punkt[] punkty;

    public Kwadrat(int[] wspolrzedne) {
        if (wspolrzedne.length > 8) {
            System.out.println("BLAD !");
        } else {
            punkty = new Punkt[4];

            for (int i = 0; i < 4; i++) {

                punkty[i] = new Punkt(wspolrzedne[i * 2], wspolrzedne[i * 2 + 1]);

                // i = 0
                // punkt[0] = new Punkty(wspolrzedne[0], wspolrzedne[1]
                // punkt[1] = new Punkty(wspolrzedne[2], wspolrzedne[3]
                // punkt[2] = new Punkty(wspolrzedne[4], wspolrzedne[5]
                // punkt[3] = new Punkty(wspolrzedne[6], wspolrzedne[7]

            }
        }
        System.out.println(punkty[0] + " " + punkty[1] + " " + punkty[2] + " " + punkty[3]);

    }

    public double obliczPole() {

        int x1 = punkty[0].x;
        int x2 = punkty[0].x;
        int y1 = punkty[1].y;
        int y2 = punkty[1].y;

        double distans = Math.hypot(x1 - x2, y1 - y2);
        return (int) (distans * distans);

    }


    class Punkt {

        private int x;
        private int y;

        public Punkt(int x, int y) {
            this.x = x;
            this.y = y;
        }

        @Override
        public String toString() {
            return "Punkt{" +
                    "x=" + x +
                    ", y=" + y +
                    '}';
        }
    }
}
