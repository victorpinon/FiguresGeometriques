import java.util.*;
public class Main {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(2,3);
        Rectangle r2 = new Rectangle(3,3);
        Cercle c1 = new Cercle(5);

        Figura[] f = new Figura[3];
        f[0] = r1;
        f[1] = r2;
        f[2] = c1;

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
