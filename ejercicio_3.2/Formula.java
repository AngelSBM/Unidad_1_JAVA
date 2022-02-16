import java.util.Scanner;

public class Formula {
    public static void main(String[] args) {        
        Scanner sc = new Scanner(System.in);
        boolean Continuar = true;

        while ( Continuar ){

            System.out.println("Calculadora");

            System.out.println("Entre valor de a: ");
            double a = sc.nextDouble();            

            System.out.println("Entre valor de b mayor a 0: ");
            double b = sc.nextDouble();
            if( b < 0 ){
                do{
                    System.out.println("El valor de b tiene que ser mayor a 0, por favor, vuelva a intentarlo:");
                    b = sc.nextDouble();
                }while( b < 0);
            }


            System.out.println("Entre valor de c: ");
            double c = sc.nextDouble();


            System.out.println("Entre valor de d impar mayor a 0: ");
            double d = sc.nextDouble();
            if( ( ( d % 2 ) == 0 ) || (d < 0) ){
                do{
                    System.out.println("El valor de d tiene que tiene que ser impar y mayor a 0, por favor, vuelva a intentarlo:");
                    d = sc.nextDouble();
                }while( ( d % 2 ) == 0  || (d < 0));
            }
            
            System.out.println("Entre valor de f: ");
            double f = sc.nextDouble();
    
            Calcularadora calcularFormula = new Calcularadora(a,b,c,d,f);
            System.out.println( calcularFormula.Calcular() );

            System.out.println( "¿OTRO E-P-S? true/false" );

            boolean respuestaContinuar = sc.nextBoolean();
            if( !respuestaContinuar ){
                Continuar = false;
                System.out.println( "Hasta luego!" );
            }

        }  
    }
}


class Calcularadora{

    double a;
    double b;
    double c;
    double d;
    double f;
    

    public Calcularadora(double a, double b, double c, double d, double f) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.f = f;

        // System.out.println(a); 
        // System.out.println(b); 
        // System.out.println(c); 
        // System.out.println(d); 
    }

    public double Calcular(){
    
        double primeraParteFormula = a;

        double segundaParteFormula = ( Math.sqrt( Math.pow(b, c) ) ) / (f + 9.2);

        double terceraParteFormula = ( (5.6 * b) - ( Math.pow(1.78, 2.87) ) ) - ( c - d );

        double resultadoFinal = primeraParteFormula + segundaParteFormula + terceraParteFormula;
    

        return resultadoFinal;

    }

}