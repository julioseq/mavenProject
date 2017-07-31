package Servicios;

import Interfaz.AdministradorDeOperaciones;

/**
 * Created by HSEQ on 28/07/2017.
 */
public class CalculadoraAntigua  implements AdministradorDeOperaciones{
    @Override
    public int suma(int a, int b) {
        return a+b;
    }

    @Override
    public int resta(int a, int b) {
        return a-b;

    }

    @Override
    public int multiplicacion(int a, int b) {
        return a*b;

    }

    @Override
    public double seno(double a) {
        return 0;
    }

    @Override
    public double coseno(double a) {
        return 0;
    }

    @Override
    public double tangente(double a) {
        return 0;
    }

    @Override
    public double cotangente(double a) {
        return 0;
    }

    @Override
    public int division(int a, int b) {
        int o=0;
        if(b==0){
            o=-1;
        }
        else{

            o=a/b;
        }
        return o;
    }
}
