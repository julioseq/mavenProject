package CursoJV.Interfaz;

/**
 * Created by Julio Cesar on 01/09/2017.
 */
public class Personas {
    private String nombre;
    private int edad;

    public  Personas(String nombre, int edad){
        this.nombre=nombre;
        this.edad=edad;

    }

    @Override
    public String toString(){
        return "Mi nombre es "+nombre+" y tengo "+edad+" años.";
    }
}
