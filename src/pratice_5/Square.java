package pratice_5;

public class Square extends shape {
    private double size;
    public Square(boolean isFilled, String color, double size) {
        super(isFilled, color);
        this.size = size;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }


    @Override
    double getArea() {
        return size*size;
    }

    @Override
    public String toString() {
        return "Square{" +
                "size=" + size +
                '}';
    }
}

