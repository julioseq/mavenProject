/**
 * Created by Julio Cesar on 02/08/2017.
 */
import Modelos.Articulo;

import java.util.Scanner;
public class PedirDatos {
    public static void main(String[]args){
        Articulo pedido=new Articulo();


        Scanner sr=new Scanner(System.in);// System.in  es por que este es un objeto que me deja entrat información desde el teclado


           System.out.print("Aticulo: ");
           pedido.articulo=sr.nextLine();// El metodo nexLine permite atrapar una cadena de caracteres.

           System.out.print("Cantidad: ");
           pedido.cantidad=sr.nextInt();// El metodo nexInt permite atrapar datos de tipo numerico.

           System.out.print("Precio: ");
           pedido.precio=sr.nextDouble();




        System.out.println( "----FACTURA----");
        System.out.println("Articulo: " +pedido.articulo);
        System.out.println("Cantidad: " +pedido.cantidad);
        System.out.println("Precio: " +pedido.precio);
        System.out.println("Valor a cancelar: " +(pedido.cantidad*pedido.precio));




    }
}
