public class Cercle extends Figura {
    public double r;

    public double getArea() {
        return this.area;
    }

    public Cercle(double r) {
        super(Math.PI * r);
        this.r = r;
    }
}
