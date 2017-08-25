package CursoJV.Polimorfismo;

/**
 * Created by Julio Cesar on 24/08/2017.
 */
public class NPC extends Personaje {
    private String apellido;
    private boolean alerta;

    public NPC(String nombre,int imagen, int posx,int posy, String apellido, boolean alerta){
        super(nombre, imagen, posx, posy);
        this.apellido=apellido;
        this.alerta=alerta;
    }


    @Override
    protected void moverX(){
        posx +=2;
    }
    @Override
    protected  void  moverY(){
        posy +=5;
    }
    @Override
    protected  String saludar(){
        return "hola mi nombre es "+this.nombre+" "+this.apellido+" y soy un NPC";
    }
}
