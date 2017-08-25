package CursoJV.Polimorfismo;

/**
 * Created by Julio Cesar on 25/08/2017.
 */
public class MainPersonaje {
   public static void main(String[]args){
       //creación de matriz polimorfica
       Personaje personajes[]=new Personaje[3];
       personajes[0]=new Poquemon("Juan",3,2,9,new String[]{"Rayo"},"Electrico");
       personajes[1]=new NPC("Luis",4,5,6,"Gutierrez",true);
       personajes[2]=new Poquemon("Felipe",7,5,3,new String[]{"patada"},"golpe");

       for(int i=0;i<personajes.length;i++){
           System.out.println(personajes[i].saludar());
       }
   }

}
