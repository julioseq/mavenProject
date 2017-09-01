package CursoJV.Interfaz;

/**
 * Created by Julio Cesar on 28/08/2017.
 */
 interface Acciones {

     // Las variable tinenen por defecto los modificadores:
    //public, static, final
    //En las interface las variables actuan como constantes
     double VELX=50;
     public static final double VELY=10;

     //Los metodos tienen por defecto los modificadores:
    // public, abstract

     void mover();
     public abstract void atacar();

}
