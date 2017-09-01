package CursoJV.Interfaz;

/**
 * Created by Julio Cesar on 30/08/2017.
 */
public class Nodo <T> {

    private T object;
    private Nodo nextNodo;

    public Nodo(T object){
        this.object= object;
        this.nextNodo=null;
    }
   public void putNodo(Nodo n){
        this.nextNodo=n;
   }
   public Nodo getNext(){
       return nextNodo;
   }

   public  T getObject(){
       return object;
   }
}
