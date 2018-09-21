abstract  public class Figura implements Comparable<Figura>{
    public double area;
    static public double suma;

    public Figura(double area) {
        this.area = area;
        suma = suma + area;
    }

    public int compareTo (Figura f) {
        if (this.area==f.area)
            return 0;
        else
            return -1;
    }

}