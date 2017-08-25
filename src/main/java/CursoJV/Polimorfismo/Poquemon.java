package CursoJV.Polimorfismo;

/**
 * Created by Julio Cesar on 24/08/2017.
 */
public class Poquemon extends Personaje {
    private String[] ataques;
    private String tipo;

    public Poquemon(String nombre, int imagen, int posx, int posy,String[] ataques, String tipo) {
        super(nombre, imagen, posx, posy);
        this.ataques=ataques;
        this.tipo=tipo;
    }

    @Override
    protected void moverX() {
        posx = posx + 5;
    }

    @Override
    protected void moverY() {

        posy = posy +1;

    }

    @Override
    protected String saludar() {
        return "hola mi nombre es "+nombre+" y soy un poquemon";
    }
}
