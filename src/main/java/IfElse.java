/**
 * Created by Julio Cesar on 01/08/2017.
 */
public class IfElse {
    public static void main(String[]args){
        byte edad=15;
        String genero="masculino";

        if (edad>=18){
            System.out.println("Eres Mayor de edad");
            if (genero=="maculino"){
                System.out.println("Eres un hombre");
            }else if (genero=="femenino"){
                System.out.println("Eres una mujer");
            }
        }else if (edad>=13 && edad<18){
            System.out.println("Eres adolecente");
            if (genero=="masculino"){
                System.out.println("Eres un chico");
            }else if (genero=="femenino"){
                System.out.println("Eres una chica");
            }
        }else {
            System.out.println("Eres menor de edad");
            if (genero == "masculino") {
                System.out.println("Eres un niño");
            } else if (genero == "femenino") {
                System.out.println("Eres una niña");
            }
        }
    }
}
