import java.util.Scanner;

public class TiempoCoccion {
    public static void main(String[] args){

        int c;
        System.out.println("Introduce el tipo de carne que quieres cocinar:  \n 1- Vacuno \n 2- Cordero" );
        Scanner teclado1 = new Scanner(System.in);
        c = teclado1.nextInt();
        if (c == 1 || c == 2){

            int p;
            System.out.println("¿Cual gramos pesa la carne?");
            Scanner teclado3 = new Scanner(System.in);
            p = teclado3.nextInt();

            int t;
            System.out.println("Introduce el tipo de cocccion que quieres:  \n 1- Cruda \n 2- Al punto \n 3- Bien hecha");
            Scanner teclado2 = new Scanner(System.in);
            t = teclado2.nextInt();

            if (t == 1 || t == 2 || t ==3){
                switch (c){
                    case 1:
                        if (t == 1){
                            System.out.println("El tiempo de coccion sera de " + (p*(10))/500 + " minutos");
                        } else if (t == 2) {
                            System.out.println("El tiempo de coccion sera de " + (p*(17))/500+ " minutos");
                        } else if (t == 3) {
                            System.out.println("El tiempo de coccion sera de " + (p*(25))/500+ " minutos");
                        }
                        break;
                    case 2:
                        if (t == 1){
                            System.out.println("El tiempo de coccion sera de " + (p*(15*60))/500 + " segundos");
                        } else if (t == 2) {
                            System.out.println("El tiempo de coccion sera de " + (p*(25*60))/500+ " segundos");
                        } else if (t == 3) {
                            System.out.println("El tiempo de coccion sera de " + (p*(40*60))/500+ " segundos");
                        }
                        break;
                }
            }

        }


    }
}
