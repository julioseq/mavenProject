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
}
