package graphic;

public abstract class GraphicObject {

    public GraphicObject(int x, int y) {
        this.x = x;
        this.y = y;
    }

    int x;
    int y;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    void moveTo(int newX, int newY) {
        this.x = newX;
        this.y = newY;

    }

    public abstract void resize();

    public abstract void present();

}
