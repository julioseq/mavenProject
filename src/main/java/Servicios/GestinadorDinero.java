package Servicios;

import Interfaz.AdministradorDinero;

/**
 * Created by HSEQ on 28/07/2017.
 */
public class GestinadorDinero implements AdministradorDinero {

    @Override
    public int pesosDolares(int pesoActual) {
        return 3500/pesoActual;
    }

    @Override
    public int dolaresPesos(int dolaresActuales) {
        return 3500*dolaresActuales;
    }

    @Override
    public int pesosLibras(int peso) {
        return 4000/peso;
    }
}
