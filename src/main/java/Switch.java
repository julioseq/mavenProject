/**
 * Created by Julio Cesar on 02/08/2017.
 */
public class Switch {
    public static void main(String[]args){
        byte numeroDiaSemana=1;
        String diaSemana ;

        switch(numeroDiaSemana){
            case 1: diaSemana="Lunes"; break;
            case 2: diaSemana="martes"; break;
            case 3: diaSemana="Miercoles";break;
            case 4: diaSemana="Jueves";break;
            case 5: diaSemana="viernes";break;
            case 6: diaSemana="Sabado"; break;
            case 7: diaSemana="Domingo";break;
            default:diaSemana="Este numero de dia no es valido";break;
        }
        System.out.println(diaSemana);
    }
}
