/**
 * Created by Julio Cesar on 04/08/2017.
 */
import java.util.Scanner;

public class ArraysVectores {
    public static void main(String[]args) {
       String[]dia={"lunes","martes","miercoles","jueves","viernes","sabado","domingo"};
       double[]ventaDia=new double[7];
       double ventaTotal=0;

       Scanner ventas=new Scanner(System.in);

       for (int x=0;x<7;x++){
           System.out.print("Dame la venta del dia "+dia[x]+":");
           ventaDia[x]=ventas.nextDouble();
       }

       for (double recorrido:ventaDia){
           ventaTotal+=recorrido;
       }
        System.out.println("La venta total de la semana fue: "+ventaTotal);
    }
}
