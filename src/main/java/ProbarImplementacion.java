import Servicios.GestinadorDinero;

/**
 * Created by HSEQ on 28/07/2017.
 */
public class ProbarImplementacion {
    public static void main(String[]args){
        int numero=2000;
        GestinadorDinero gestinadorDinero=new GestinadorDinero();
        int resultado=gestinadorDinero.pesosDolares(numero);
        System.out.println("Sus dolares son: "+resultado);
       int resultado2=gestinadorDinero.dolaresPesos(resultado);
        System.out.println("Sus pesos son: "+resultado2);
        int resultado3=gestinadorDinero.pesosLibras(numero);
        System.out.println("Sus libras son: "+resultado3);


        System.out.println( "suma fue igual a " +resultado );
    }
}
