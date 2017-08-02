/**
 * Created by Julio Cesar on 02/08/2017.
 */
import java.util.Scanner;
public class PedirDatos {
    public static void main(String[]args){
        Scanner sr=new Scanner(System.in);// System.in  es por que este es un objeto que me deja entrat información desde el teclado
        System.out.print("Aticulo: ");
        String articulo=sr.nextLine();// El metodo nexLine permite atrapar una cadena de caracteres.

        System.out.print("Cantidad: ");
        int cantidad=sr.nextInt();// El metodo nexInt permite atrapar datos de tipo numerico.

        System.out.print("Precio: ");
        double precio=sr.nextDouble();

        System.out.println( "----FACTURA----");

        System.out.println("Articulo: " +articulo);
        System.out.println("Cantidad: " +cantidad);
        System.out.println("Precio: " +precio);
        System.out.println("Valor a cancelar: " +(cantidad*precio));
    }
}
