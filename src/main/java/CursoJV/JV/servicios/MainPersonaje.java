package CursoJV.JV.servicios;

import CursoJV.Modelos.Personaje;

/**
 * Created by Julio Cesar on 21/08/2017.
 */
public class MainPersonaje {
    public static void main(String[]args){
        Personaje cualquiera=new Personaje();
        System.out.println("El nombre por defecto del personaje es: "+cualquiera.nombre);

        cualquiera.getConsultarVida();

        System.out.println("La vida del personaje "+cualquiera.nombre+ " es: "+cualquiera.getConsultarVida());

        System.out.println("El numero de cuenta es: "+cualquiera.getconsultar());

        cualquiera.setNumCuenta(5367489);

        System.out.println("Su nuevo numero de cuenta es: "+cualquiera.getconsultar());

        cualquiera.setAsignarVida(-5);

        System.out.println("El nuevo valor de vida es: "+cualquiera.getConsultarVida());

        cualquiera.setAsignarVida(67);

        System.out.println("El valor de la nueva vida es: "+cualquiera.getConsultarVida());

        System.out.println("La posición en X por defecto es: "+cualquiera.getPosx());

        cualquiera.setMover(100);

        System.out.println("La nueva posición de X es: "+cualquiera.getPosx());




    }
}
