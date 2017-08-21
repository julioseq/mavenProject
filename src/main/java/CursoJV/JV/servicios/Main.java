package CursoJV.JV.servicios;

import CursoJV.Modelos.Personas;

/**
 * Created by Julio Cesar on 16/08/2017.
 */
public class Main {
    public static void main(String[]args){
             //Instanciamos un objeto de la clase personas
        Personas objeto1=new Personas();
          System.out.println("Los datos de la persona del primer objeto son los siguientes: ");
          System.out.println("Nombre: "+objeto1.nombre);
          System.out.println("Edad: "+objeto1.edad);
          System.out.println("Color de ojos: "+objeto1.colorOjos);
          System.out.println("Numero de brazos: "+objeto1.numBrazos);
          System.out.println("numero de piernas: "+objeto1.numPiernas);

                    Personas objeto2=new Personas("Andres",(byte) 40,(byte)2,(byte)1,"Azul");
         System.out.println("Los datos de la persona del segundo objeto son los siguientes : ");
         System.out.println("Nombre: "+objeto2.nombre);
         System.out.println("Edad: "+objeto2.edad);
         System.out.println("Color de ojos: "+objeto2.colorOjos);
         System.out.println("Numero de piernas: "+objeto2.numPiernas);
         System.out.println("Numero de brazos: "+objeto2.numBrazos);

        System.out.println("El saludo del objeto1 es: "+objeto1.saludar());
        System.out.println("El saludo del objeto2 es: "+objeto2.saludar());

        objeto2.cambiarNombre("Diana");
        System.out.println("El nombre del objeto2 luego de ser cambiado es: "+objeto2.nombre);
        System.out.println("El saludo del objeto2 luego de ser cambiado el nombre es: "+objeto2.saludar());
          }
  }

