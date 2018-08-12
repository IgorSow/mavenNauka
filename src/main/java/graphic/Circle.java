package graphic;

public class Circle extends GraphicObject{

    public Circle(int x, int y) {
        super(x, y);
    }

    @Override
    public void resize() {

        x = super.x + 10;

    }

    @Override
    public void present() {
        System.out.println(" jestes w klasie kolo");
    }
}
