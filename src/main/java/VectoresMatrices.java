import java.io.InputStream;

/**
 * Created by Julio Cesar on 08/08/2017.
 */

import java.util.Scanner;
public class VectoresMatrices {
    public static void main(String[]args) {

        String[] dia = {"Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo"};
        double[][] ventasMes = new double[4][7];
        double ventasTotal = 0;
        int s=0,d=0;

        Scanner ventas = new Scanner(System.in);

        for (int semana=0;semana<4;semana++){

            for (int Dia=0;Dia<7;Dia++){

                System.out.print("Dame la venta del dia "+dia[Dia] +" :");
                ventasMes [semana] [Dia]= ventas.nextDouble();

            }

        while (s<4){

                while (d<7){

                    ventasTotal+=ventasMes[s] [d];

                    d++;
                }

                s++;
        }

        }

        System.out.println("La venta toal de mes fue: "+ventasTotal);

    }

}
