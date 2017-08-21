package CursoJV.Modelos;

/**
 * Created by Julio Cesar on 16/08/2017.
 */
public class Pelota {
   public byte posx;
   public byte posy;
   public byte posC;
    public int peso;
   public String color;


    public Pelota(int i, String rojo){
        this.posx=1;
        this.posy=0;
        this.posC=2;
        this.peso=100;
        this.color="Rojo";
    }


    public Pelota(byte posx,byte posy,byte posC, int peso, String color){
        this.posx=posx;
        this.posy=posy;
        this.peso=peso;
        this.color=color;
        this.posC=posC;
    }
    public void  cambiarPosicion1(byte posicion1 ){
        this.posx=posicion1; }
    public String ubicacionPelota1(){
        return ("Posición de la pelota en X : "+this.posx);
    }



    public void  cambiarPosicion2(byte posicion2 ){
        this.posy=posicion2;
    }
    public String ubicacionPelota2(){
        return ("Posición de la pelota en Y: "+this.posy);
    }



    public void  cambiarPosicion3(byte posicion3 ){
        this.posC=posicion3;
    }

    public String ubicacionPelota3(){
        return ("Posición de la pelota al caerse : "+this.posC);
    }



    public void cambiarPeso1(int peso){
        this.peso=peso;

    }

    public int cambiarPeso1(){
        return peso;
    }

    public void cambiarColor1(String color){
        this.color=color;

    }

    public String cambiarColor1(){
        return color;
    }

    public void cambiarColor2(String color){
        this.color=color;
    }

    public String cambiarColor2(){
        return color;
    }

    public void cambiarPosx3(byte posx){
        this.posx=posx;
    }

    public byte cambiarPosx3(){
        return posx;
    }

    public void cambiarPosy3(byte posy){
        this.posy=posy;
    }
    public byte cambiarPosy3(){
        return posy;
    }
    public void cambiarColor3(String color){
        this.color=color;
    }
    public String cambiarColor3(){
        return color;
    }
    public void cambiarPeso3(int peso){
        this.peso=peso;
    }
    public int cambiarPeso3(){
        return peso;
    }
    public void cambiarPosC3(byte posC){
        this.posC=posC;
    }
    public byte cambiarPosC3(){
        return posC;
    }

}



