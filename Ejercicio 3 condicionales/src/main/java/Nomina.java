import java.util.Scanner;

public class Nomina {
    int horas;
    double tarifa;

    public Nomina(int horas, double tarifa) {
        this.horas = horas;
        this.tarifa = tarifa;
    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    public double getTarifa() {
        return tarifa;
    }

    public void setTarifa(double tarifa) {
        this.tarifa = tarifa;
    }

    public double salario(){
        if (horas < 169){
            return 1;
        } else if (horas >= 169 && horas <= 180) {
            return 169 * tarifa + (horas-169) * (tarifa + tarifa / 2);
        } else if (horas > 180) {
            return 169 * tarifa + (180-169) * (tarifa + tarifa * 0.5) +  (horas-180) * (tarifa + tarifa * 0.6);
        }
        return 0.0;
    }

    public String formato(double numero){
        String roundOff = String.format("%.2f", numero);
        return roundOff;
    }
    public static void main(String[] args){

        String apellido;
        System.out.println("¿Apellido de la persona?" );
        Scanner teclado1 = new Scanner(System.in);
        apellido = teclado1.nextLine();

        String nombre;
        System.out.println("¿Nombre de la persona?" );
        Scanner teclado2 = new Scanner(System.in);
        nombre = teclado2.nextLine();

        int puesto;
        System.out.println("¿Puesto?\n" +
                "\n" +
                "1 - Agente de servicio\n" +
                "\n" +
                "2 - Empleado de oficina\n" +
                "\n" +
                "3 - Directivo" );
        Scanner teclado3 = new Scanner(System.in);
        puesto = teclado3.nextInt();

        int horasTrabajadas;
        System.out.println("Número de horas trabajadas" );
        Scanner teclado4 = new Scanner(System.in);
        horasTrabajadas = teclado4.nextInt();

        double tarifaHoraria;
        System.out.println("¿Tarifa horaria?" );
        Scanner teclado5 = new Scanner(System.in);
        tarifaHoraria = teclado5.nextDouble();

        int hijos;
        System.out.println("¿Número de hijos?" );
        Scanner teclado6 = new Scanner(System.in);
        hijos = teclado6.nextInt();

        System.out.println("Nómina de Gerardo Camino");

        switch (puesto){
            case 1:
                System.out.println("Estado : Agente de servicio");
                break;
            case 2:
                System.out.println("Estado : Empleado de oficina");
                break;
            case 3:
                System.out.println("Estado : Directivo");
                break;
        }

        Nomina bruto = new Nomina(horasTrabajadas,tarifaHoraria);
        System.out.println(bruto.salario() + " Euros");



        System.out.println("Cálculo de deducciones: ");

        System.out.println("Contribución para el pago de la deuda social y contingencias comunes imponible ");

        System.out.println(bruto.formato(bruto.salario() * 0.0349)  + " Euros");

        System.out.println("Contribución de contingencias comunes no imponible");

        System.out.println(bruto.formato(bruto.salario() * 0.0615) + " Euros");

        System.out.println("Seguro médico");

        System.out.println(bruto.formato(bruto.salario() * 0.0095) + " Euros");

        System.out.println("Fondo de pensiones");

        System.out.println(bruto.formato(bruto.salario() * 0.0844) + " Euros");

        System.out.println("Seguro de desempleo");

        System.out.println(bruto.formato(bruto.salario() * 0.0305) + " Euros");

        System.out.println("Pensión complementaria (Entidad privada)");

        System.out.println(bruto.formato(bruto.salario() * 0.0381) + " Euros");

        System.out.println("Contribución de jubilación anticipada");

        System.out.println(bruto.formato(bruto.salario() * 0.0102) + " Euros");

        double deducciones = bruto.salario() * 0.0349 + bruto.salario() * 0.0615 + bruto.salario() * 0.0095 + bruto.salario() * 0.0844 + bruto.salario() * 0.0305 + bruto.salario() * 0.0381 + bruto.salario() * 0.0102;

        double salarioBruto = bruto.salario() - deducciones;

        System.out.println("Deducciones totales de los empleados "  + bruto.formato(deducciones) + " Euros");

        System.out.println("Salario neto: " + bruto.formato(salarioBruto) + " Euros");

        int primaFamiliar;

        if (hijos == 1){
            primaFamiliar = 20;
            System.out.println("Prima familiar: " + primaFamiliar + " Euros");
            System.out.println("Salario neto a pagar: " + bruto.formato(salarioBruto + primaFamiliar)+ " Euros");
        } else if (hijos == 2) {
            primaFamiliar = 50;
            System.out.println("Prima familiar: " + primaFamiliar + " Euros");
            System.out.println("Salario neto a pagar: " + bruto.formato(salarioBruto + primaFamiliar)+ " Euros");
        } else if (hijos > 2) {
            primaFamiliar = 70 + 20 * (hijos - 2);
            System.out.println("Prima familiar: " + primaFamiliar + " euros");
            System.out.println("Salario neto a pagar: " + bruto.formato(salarioBruto + primaFamiliar) + " Euros");
        }
    }
}
