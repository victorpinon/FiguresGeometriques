public class Rectangle extends Figura {
    public double b;
    public double h;

    public double getArea() {
        return this.area;
    }

    public Rectangle(double b, double h) {
        super(b*h);
        this.b = b;
        this.h = h;
    }
}
