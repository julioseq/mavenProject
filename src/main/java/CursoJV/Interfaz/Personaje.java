package CursoJV.Interfaz;

/**
 * Created by Julio Cesar on 28/08/2017.
 */
public abstract class Personaje implements Acciones,Constantes{
    private String nombre;
    private  int imagen;
    private  int posx,posy;

    public Personaje(String nombre, int imagen, int posx, int posy){
        this.nombre=nombre;
        this.imagen=imagen;
        this.posx=posx;
        this.posy=posy;
    }
}

