package CursoJV.Polimorfismo;

/**
 * Created by Julio Cesar on 24/08/2017.
 */
abstract class Personaje {
    protected String nombre;
    protected int imagen;
    protected int posx,posy;

    public Personaje(String nombre, int imagen, int posx, int posy){
        this.nombre=nombre;
        this.imagen=imagen;
        this.posx=posx;
        this.posy=posy;
    }

    protected  abstract void moverX();
    protected  abstract void moverY();
    protected  abstract String saludar();
}
