package CursoJV.Herencia;

/**
 * Created by Julio Cesar on 22/08/2017.
 *
 * La palabra reservada extends es la utilizada por java para heredar de otra clase
 */
public class Coche extends Vehiculo {
    private  int ventanas;
    private  int caballos;

    public Coche (int ruedas, String conductor, String color, int velocidad, int posX, int ventanas, int caballos){
        super(ruedas,conductor,color,velocidad,posX);
        this.ventanas=ventanas;
        this.caballos=caballos;
    }

    @Override
    public  void mover (int tiempo){
        super.mover(tiempo);
        this.posX+=(int) (Math.random()*99);
    }

    @Override
    public String toString(){
        return super.toString()+" , "+ventanas+" ventanas y  "+caballos+" caballos de fuerza.";
    }
}
