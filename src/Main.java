import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(2,3);
        Rectangle r2 = new Rectangle(3,3);
        Cercle c1 = new Cercle(5);
        Figura[] f = {c1,r1,r2};
        System.out.println("La lista de arrays desordenada es:" +Arrays.toString(f));
        System.out.println("La suma de todas las areas es:" +Figura.suma);
    }




}
