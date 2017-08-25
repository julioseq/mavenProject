package CursoJV.Herencia;

/**
 * Created by Julio Cesar on 22/08/2017.
 */
public class Vehiculo {
    protected int ruedas;
    protected String conductor;
    protected String color;
    protected int velocidad;
    protected int posX;
    private  int patata;

    public Vehiculo (int ruedas, String conductor, String color, int velocidad, int posX){
        this.ruedas=ruedas;
        this.conductor=conductor;
        this.color=color;
        this.velocidad=velocidad;
        this.posX=posX;
    }

    private int movimientoRelativo(int tiempo){
        return tiempo * velocidad;
    }
    public  void mover(int tiempo){
        posX += movimientoRelativo(tiempo);
    }

    public  int getPosX(){
        return posX;
    }
    @Override
    public  String toString(){
        return "El vehículo tiene "+ruedas+"  ruedas, un color "+color+", un conductor llamado "+conductor+", viaja a una velocidad "+velocidad+" , una posición en x de "+posX;
    }
}
