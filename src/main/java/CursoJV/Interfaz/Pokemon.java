package CursoJV.Interfaz;

/**
 * Created by Julio Cesar on 29/08/2017.
 */
public class Pokemon extends Personaje  {
    private String ataque;

    public Pokemon(String nombre, int imagen,int posx, int posy, String ataque){
        super(nombre, imagen, posx, posy);
        this.ataque=ataque;
    }

    @Override
    public void mover() {

    }

    @Override
    public void atacar() {
        
    }
}
