public class Figura {
    public double area;
    public static double suma;

    public double getArea() {
        return this.area;
    }



    public Figura(){

    }

    public Figura(double area){
        this.area = area;
        suma = suma + area;
    }
}
