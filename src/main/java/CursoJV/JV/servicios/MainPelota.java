package CursoJV.JV.servicios;

import CursoJV.Modelos.Pelota;

/**
 * Created by Julio Cesar on 15/08/2017.
 */
public class MainPelota {
    public static void main(String[]args){

   Pelota objeto1=new Pelota((byte)10,(byte)20,(byte) 5,27,"azúl");

  objeto1.cambiarPeso1(5);
  objeto1.cambiarColor1("rojo");

        System.out.println("El color del objeto1 es: "+objeto1.cambiarColor1());
        System.out.println("El peso del objeto 1 es: "+objeto1.cambiarPeso1());


    Pelota objeto2=new Pelota((byte) 56,(byte) 30,(byte) 50, 90,"Azul");

    objeto2.cambiarColor2("Amarillo");
        System.out.println("El color del objeto 2 es: "+objeto2.cambiarColor2());

        Pelota objeto3=new Pelota((byte)78,(byte)89,(byte)20,45,"verde");

        objeto3.cambiarColor3("Naranja");
        objeto3.cambiarPosx3((byte) 10);
        objeto3.cambiarPosy3((byte) 15);
        objeto3.cambiarPeso3(46);
        objeto3.cambiarPosC3((byte)65);

        System.out.println("El color del objeto 3 es: "+objeto3.cambiarColor3());
        System.out.println("La posición del objeto 3 en x es: "+objeto3.cambiarPosx3());
        System.out.println("La posición del objeto 3 en y es: "+objeto3.cambiarPosy3());
        System.out.println("la posición del objeto 3 al caerse es: "+objeto3.cambiarPosC3());
        System.out.println("El peso del objeto 3 es: "+objeto3.cambiarPeso3());


        Pelota objeto4=new Pelota((byte)4,(byte)5,(byte)6,56,"Manzana");

        System.out.println("Color objeto4: "+objeto4.color);
        System.out.println("Peso objeto4: "+objeto4.peso);
        System.out.println("Posición X objeto4: "+objeto4.posx);
        System.out.println("Posición en Y objeto4: "+objeto4.posy);
        System.out.println("Posicón al caerse el objeto4: "+objeto4.posC);




    }
}