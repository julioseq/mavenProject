/**
 * Created by Julio Cesar on 09/08/2017.
 */
import java.util.Formatter;
public class CrearArchivos {

    public static void main(String[]args){
        Formatter archivo = null;

        try {
            archivo=new Formatter("C:\\Users\\Julio Cesar\\Documents\\EstudioJulio\\Archivo.txt");
            archivo.format( "%d %s %f ",45,"Julio",2.9,"M");
        }catch (Exception e){
            System.out.println("Ha ocurrido un error "+e.toString());
        }finally {
            archivo.close();
        }

    }

}
