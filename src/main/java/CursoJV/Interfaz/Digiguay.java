package CursoJV.Interfaz;

/**
 * Created by Julio Cesar on 29/08/2017.
 */
public class Digiguay extends Personaje {
    private String pepito;

    public Digiguay(String nombre, int imagen, int posx, int posy,String pepito) {
        super(nombre, imagen, posx, posy);
        this.pepito=pepito;
    }

    @Override
    public void mover() {

    }

    @Override
    public void atacar() {

    }
}
