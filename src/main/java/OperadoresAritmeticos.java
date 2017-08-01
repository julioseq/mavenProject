import javax.print.DocFlavor;

/**
 * Created by HSEQ on 01/08/2017.
 */
public class OperadoresAritmeticos {


  public static void main(String[]args){

      //operadores de asignación

      int numero1=56,numero2=896;
      numero1+=numero2;

      System.out.println("El resultado de la suma es: " +numero1);

      numero1-=numero2;
      System.out.println("El resultado de la resta es: "+numero1);

      numero1*=numero2;
      System.out.println("El resultado de la multiplicación es: "+numero1);

      numero1/=numero2;
      System.out.println("El resultado de la división es: "+numero1);

      //operadores relacionales

      int numero3= 29;
      if(numero3!=30){
          System.out.println("No tienes 30");
      }else {
          System.out.println("tienes 30");
      }

      Byte edad1=24,edad2=15;
      if (edad1>25 && edad2<=45){//operador condicional y (se deben cumplir los dos condicionales
          System.out.println("Eres adulto");
      }else if (edad1<25 && edad2<25){
          System.out.println("Eres menor de edad");
      }else {
          System.out.println("Eres adulto mayor");
      }

      byte Juan=46,pedro=15;
      if (Juan>45 || pedro>25){ //operador logico o(se cumple el uno o el otro condicional
          System.out.println("pasaste");
      }else {
          System.out.println("reprobaste");
      }
  }
}
