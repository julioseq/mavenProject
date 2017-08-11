/**
 * Created by Julio Cesar on 11/08/2017.
 */
public class Personas {
    String nombre;
    byte edad;
    byte numBrazos;
    byte numPiernas;
    String colorOjos;

    public Personas (){
        this.nombre="Julio";
        this.numBrazos=2;
        this.numPiernas=2;
        this.colorOjos="cafe";
        this.edad=36;
    }

    public Personas(String nombre, byte edad,byte numBrazos,byte numPiernas,String colorOjos){
        this.nombre=nombre;
        this.edad=edad;
        this.numBrazos=numBrazos;
        this.numPiernas=numPiernas;
        this.colorOjos=colorOjos;
    }

    public String saludar(){
        return ("Hola mi nombre es "+this.nombre);
    }

    public void cambiarNombre(String nombre){
        this.nombre=nombre;
    }
}
