/**
 * Created by Julio Cesar on 03/08/2017.
 */
public class While {
    public static void main(String[]args){

        // con el ciclo while no necesito tener un valor inicial.
        int numero=0;

        while (numero<=20){
            System.out.println(numero);
            numero++;
        }do { // El ciclo do while me permite evaluar una condicion necesaria justo cuando yo la necesite.
            System.out.println(numero);
        }while (numero<20);
    }
}
