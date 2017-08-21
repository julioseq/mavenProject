package CursoJV.Modelos;

/**
 * Created by Julio Cesar on 11/08/2017.
 */
public class Personas {
   public String nombre;
    public byte edad;
   public byte numBrazos;
   public byte numPiernas;
    public String colorOjos;
   public byte vida;


    public Personas (){
        this.nombre="Julio";
        this.numBrazos=2;
        this.numPiernas=2;
        this.colorOjos="cafe";
        this.edad=36;
        this.vida=100;
    }

    public Personas(String nombre, byte edad,byte numBrazos,byte numPiernas,String colorOjos){
        this.nombre=nombre;
        this.edad=edad;
        this.numBrazos=numBrazos;
        this.numPiernas=numPiernas;
        this.colorOjos=colorOjos;
        this.vida=100;
    }

    public String saludar(){
        return ("Hola mi nombre es "+this.nombre);
    }

    public void cambiarNombre(String nombre){
        this.nombre=nombre;
    }


    public void enfermar(int putosVida) {
        this.vida -= putosVida;
    }

public  void comer(int puntosVidaC){
        this.vida+=puntosVidaC;
}
}
