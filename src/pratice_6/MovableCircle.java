package pratice_6;

class MovableCircle extends Circle implements Movable {
    private Point center;

    public MovableCircle(boolean isFilled, String color, double radius, Point center) {
        super(isFilled, color, radius);
        this.center = center;
    }


    public Point getCenter() {
        return center;
    }

    public void setCenter(Point center) {
        this.center = center;
    }

    @Override
    public void move(int right, int down) {
        center.move(right, down);
    }
}
