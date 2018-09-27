public class Triangle extends Figura{
    public double b;
    public double h;

    public double getArea() {
        return this.area;
    }

    public Triangle(double b, double h) {
        super(b*h/2);
        this.b = b;
        this.h = h;
    }
}
