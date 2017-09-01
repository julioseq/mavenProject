package CursoJV.Interfaz;

/**
 * Created by Julio Cesar on 30/08/2017.
 */
public class List <T> {
    private   Nodo inicio;
    public List(){
        inicio=null;
     }

     public void add(T object){
        Nodo element=new Nodo(object);

        if(inicio == null){

            this.inicio=element;
        }else {
            Nodo aux;
            for (aux=inicio;aux.getNext()!=null;aux=aux.getNext());
            aux.putNodo(element);
        }
     }
     public void imprimir(){
         for (Nodo aux=inicio;aux!=null;aux=aux.getNext()){
             System.out.println(aux.getObject().toString());
         }
     }

    }



