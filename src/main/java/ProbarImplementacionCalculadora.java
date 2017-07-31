import Servicios.CalculadoraLibreria;

/**
 * Created by HSEQ on 31/07/2017.
 */
public class ProbarImplementacionCalculadora {
    public static void main(String[]args){
        int numero1=25;
        int numero2= 15;
        double a= 12;
        CalculadoraLibreria calculadoraLibreria=new CalculadoraLibreria();
        int resultado= calculadoraLibreria.suma(numero1,numero2);
        System.out.println("El resultado de la suma es: " +resultado);

        CalculadoraLibreria calculadoraLibreria1=new CalculadoraLibreria();
        int resultado1= calculadoraLibreria1.resta(numero1,numero2);
        System.out.println("El resultado de la resta es: "+resultado1);

        CalculadoraLibreria calculadoraLibreria2=new CalculadoraLibreria();
        int resultado3= calculadoraLibreria2.multiplicacion(numero1,numero2);
        System.out.println("El resultado de la multiplicación es: " +resultado3);

        CalculadoraLibreria calculadoraLibreria3=new CalculadoraLibreria();
        int resultado4=calculadoraLibreria3.division(numero1,numero2);
        System.out.println("El resultado de la división es: " +resultado4);

        CalculadoraLibreria calculadoraLibreria4=new CalculadoraLibreria();
        double resultado5=calculadoraLibreria4.coseno(a);
        System.out.println("El coseno es: " +resultado5);

        CalculadoraLibreria calculadoraLibreria5=new CalculadoraLibreria();
        double resultado6=calculadoraLibreria5.seno(a);
        System.out.println("El seno es: " +resultado6);

        CalculadoraLibreria calculadoraLibreria6=new CalculadoraLibreria();
        double resultado7=calculadoraLibreria6.tangente(a);
        System.out.println("La tangente es: " +resultado7);

        CalculadoraLibreria calculadoraLibreria7=new CalculadoraLibreria();
        double resultado8=calculadoraLibreria7.cotangente(a);
        System.out.println("La cotangente es: " +resultado8);
    }
}
