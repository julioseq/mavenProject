import java.util.LinkedList;
import java.util.List;

/**
 * Created by HSEQ on 28/07/2017.
 */
public class CicloFor {

    public static void main(String[]args){
        List<Prueba>recibeNombre=LlenarNombres();
        for (Prueba hija:recibeNombre){
            System.out.println(hija.getNombre());
        }
    }


    public static List<Prueba>LlenarNombres(){
        List<Prueba> Nombre=new LinkedList<>();
        int [] numero={1,2,3,4,5,6,7,8,9};
        int a=0;
        while (a<=numero.length && a!=5){
            if (a<3){
                Prueba listarNombre=new Prueba("Samuel Felipe Ardila"+a);
                Nombre.add(listarNombre);
            }else if (a>=3 && a<6){
                Prueba listarNombre=new Prueba("Diego Alejandro Ardila"+a);
                Nombre.add(listarNombre);
            }else {
                Prueba listarNombre=new Prueba("María José Ardila"+a);
                Nombre.add(listarNombre);
            }
            a++;
        }
       return Nombre;
    }


    public static List<Prueba> LlenarPrueba(){
        List<Prueba> Nombre=new LinkedList<>();
        int [] Numero={1,2,3,4,5,6,7,8,9,10};
        for (int i:Numero){
            if (i<3){
                Prueba listarNombre=new Prueba("Samuel Felipe Ardila"+i);
                Nombre.add(listarNombre);
            }else if (i>=3 && i<6){
                Prueba listarNombre=new Prueba("Diego Alejandro Ardila"+i);
                Nombre.add(listarNombre);
            }else {
                Prueba listarNombre=new Prueba("María José Ardila"+i);
                Nombre.add(listarNombre);
            }


        }
        return Nombre;
    }
}
