package Servicios;

import Interfaz.AdministradorDeOperaciones;

/**
 * Created by HSEQ on 28/07/2017.
 */
public class CalculadoraLibreria implements AdministradorDeOperaciones {
    @Override
    public int suma(int a, int b) {


        return Math.addExact(a,b);
    }

    @Override
    public int resta(int a, int b) {
             return Math.subtractExact(a,b);
    }

    @Override
    public int multiplicacion(int a, int b) {
        return Math.multiplyExact(a,b);
    }

    @Override
    public double seno(double a) {
        return  Math.sin(a);
    }

    @Override
    public double coseno(double a) {
        return Math.cos(a);
    }

    @Override
    public double tangente(double a) {
        return Math.tan(a);
    }

    @Override
    public double cotangente(double a) {
        return Math.cos(a)/Math.sin(a);
    }

    @Override
    public int division(int a, int b) {
        int p=0;
        if(p==0){
            p=-1;
        }else {
            p=Math.floorDiv(a,b);

        }

        return 0;
    }
}
