import java.util.Scanner;

public class ElTiempoV2 {
    public static void main(String[] args){
        int c;
        System.out.println("Introduce la temperatura actual en grados: ");
        Scanner teclado1 = new Scanner(System.in);
        c = teclado1.nextint();

        if (c < 2.0){
            System.out.println("Riesgo de hielo");
        }else if (2<= c && c < 15) {
            System.out.println("Hace frio");
        } else if (15< c && c < 30) {
            System.out.println("Buena temperatura");
        } else if (c > 30) {
            System.out.println("Demasiado calor");
        }
    }
}
