package CursoJV.Interfaz;

/**
 * Created by Julio Cesar on 01/09/2017.
 */
public class MainList {
    public static void main(String[]args){
   List <String> lista=new List();
// <int>  <double>= ERROR!
        //int == Integer
        //double == Double
        //char == Character
        //String ==  String
   lista.add("Julio");
    lista.add("Maria Jose");
    lista.add("Samuel");
    lista.add("Diego");
    lista.add("Diana");
    lista.imprimir();

    List<Integer> lista1=new List<>();
    lista1.add(45);
    lista1.add(20);
    lista1.add(67);
    lista1.imprimir();

    List<Personas> lista3=new List<>();
    lista3.add(new Personas("Julio",36));
    lista3.add(new Personas("Maria Jose",16));
    lista3.add(new Personas("Samuel",7));
    lista3.add(new Personas("Diego",10));
    lista3.add(new Personas("Diana",39));
    lista3.imprimir();
    }

}
