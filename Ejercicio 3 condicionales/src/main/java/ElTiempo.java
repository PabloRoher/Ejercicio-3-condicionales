import java.util.Scanner;

public class ElTiempo {
    public static void main(String[] args){
        double c;
        System.out.println("Introduce la temperatura actual en grados: ");
        Scanner teclado1 = new Scanner(System.in);
        c = teclado1.nextDouble();

        if (c < 2.0){
            System.out.println("Riesgo de hielo");
        }else {
            System.out.println("No hay riesgo de hielo");
        }
    }
}
