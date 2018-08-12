package graphic;

public class Line extends GraphicObject {

    public Line(int x, int y) {
        super(x, y);
    }

    @Override
    public void resize() {

        y = super.y + 10;
    }

    @Override
    public void present() {
        System.out.println(" Jestes w line");
    }
}
