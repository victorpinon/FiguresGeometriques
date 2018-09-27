import java.util.*;
public class Main {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(2,3);
        Cercle c1 = new Cercle(5);
        Triangle t1 = new Triangle(3,4);
        Quadrat q1 = new Quadrat(6);

        Figura[] f = new Figura[4];
        f[0] = r1;
        f[1] = c1;
        f[2] = t1;
        f[3] = q1;

        System.out.println("Lista desordenada");
        for (Figura i : f) {
            System.out.println(i);
        }

        System.out.println("Lista ordenada");
        Arrays.sort(f);
        for (Figura i : f) {
            System.out.println(i);
        }

        System.out.println("La suma es de todas las figuras es:" + Figura.suma);
    }
}
