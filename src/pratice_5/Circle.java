package pratice_5;

public class Circle extends shape {
    double pi = Math.PI;
    private double radius;
    public Circle(double radius) {
        this.radius = radius;
    }
    public void setRadius(double radius){
        this.radius = radius;
    }
    public double getRadius(){
        return radius;
    }


    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }

}
