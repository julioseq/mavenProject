package CursoJV.Herencia;

/**
 * Created by Julio Cesar on 23/08/2017.
 */
public class Main {
    public static void main(String[] args){
        Vehiculo generico=new Vehiculo(5,"Julio César","Amarillo",100,45);
        System.out.println(generico.toString());
        generico.mover(30);
        System.out.println(generico.getPosX());

        Coche deMarca=new Coche(4,"Diana","Rojo",120,20,5,20);
        System.out.println(deMarca.toString());
        deMarca.mover(80);
        System.out.println(deMarca.getPosX());
    }
}
