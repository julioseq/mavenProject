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
}
