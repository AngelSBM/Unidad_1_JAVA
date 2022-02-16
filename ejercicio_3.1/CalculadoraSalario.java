// package ejercicio_3.1;
import java.util.Scanner;

public class CalculadoraSalario {

    public static double HorasTrabajadas;
    public static double HorasExtras;
    public static final double SUELDO_HORA = 110;
    public static final double SUELDO_HORA_EXTRA = 160;

    public static void main(String[] args) {
                
        Scanner sc = new Scanner(System.in);

        System.out.println("Cuantas horas trabajó?");
        HorasTrabajadas = sc.nextInt();
        
        System.out.println("Cuantas horas extras trabajó? ( Digitar 0 si no trabajo horas extras )");
        HorasExtras = sc.nextInt();

        Calcular(HorasTrabajadas, HorasExtras);

    }

    public static void Calcular(double horasTrabajadas, double horasExtras){

        final double sueldobruto = SUELDO_HORA * horasTrabajadas;
        final double compensacionExtra = SUELDO_HORA_EXTRA * horasExtras;

        double sueldoFinalSinImpuestos = sueldobruto + compensacionExtra;

        if( sueldoFinalSinImpuestos >= 25000 ){
            final double impuestoAplicado = sueldoFinalSinImpuestos * 0.10;
            sueldoFinalSinImpuestos = sueldoFinalSinImpuestos - impuestoAplicado; 
        }


        System.out.println("Pago por hora: " + SUELDO_HORA);
        System.out.println("Pago por hora extra: " + SUELDO_HORA_EXTRA);
        System.out.println("Horas trabajadas: " + horasTrabajadas + " --total: " + sueldobruto);
        System.out.println("Horas extras trabajadas: " + horasExtras + " --total: " + compensacionExtra);
        System.out.println("Total pagar: " + sueldoFinalSinImpuestos);
        

    }

}

