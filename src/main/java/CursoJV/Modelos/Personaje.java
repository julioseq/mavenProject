package CursoJV.Modelos;

/**
 * Created by Julio Cesar on 21/08/2017.
 */
public class Personaje {
    public String nombre;
    public String imagen;
    private int vida;
    private   int posx;
    public int posy;
    private int numCuenta;

    public Personaje(){
        this.nombre="Jugador";
        this.imagen="c/documents/aprender java";
        vida=100;
        posx=(int)(Math.random()*100);
        posy=(int)(Math.random()*100);
        this.numCuenta=98234;
    }

    public Personaje(String nombre){
        this.nombre=nombre;
    }

    public int getconsultar(){
        return numCuenta;
    }
    public void setNumCuenta(int numeroNuevo){
        this.numCuenta=numeroNuevo;
    }

    public int getConsultarVida(){
        return this.vida;
    }

    public void setAsignarVida(int nuevaVida){
        if (nuevaVida<0){
            System.out.println("Valor de vida invalido");



        }else {
            this.vida=nuevaVida;
        }
    }

    public int getPosx(){
        return posx;
    }

    public void setPosx(int posx){
        this.posx=posx;
    }

    public void setMover(int movimiento){
        this.posx= this.posx - algoritmmoMovimiento(movimiento);
    }

    private int algoritmmoMovimiento(int posicionRelativa){ //metodo de soporte al cual no se puede acceder desde otra clase
        return (posicionRelativa -80)*2+5;
    }
}
