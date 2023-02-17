
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class NombreMes {
    public static void main(String[] args){
        int m;
        String [] nombreMes = {"Enero","Febrero","Marzo","Abril","Mayo","Junio","Julio","Agosto","Septiembre","Octubre","Noviembre","Diciembre"};
        List<String> listaMeses = Arrays.asList(nombreMes);
        System.out.println("Introduce el numero del mes: ");
        Scanner teclado1 = new Scanner(System.in);
        m = teclado1.nextInt();
        for (int i = 0; i < listaMeses.size(); i++) {

            if (m == i){
                System.out.println("El nombre del mes es "+ listaMeses.get(i - 1));
            }

        }
    }
}
