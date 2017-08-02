package Modelos;

/**
 * Created by HSEQ on 02/08/2017.
 */
public class Articulo {
    public String articulo;
    public int cantidad;
    public double precio;
    public int cantidadArticulos;
    public Articulo (){}

    public int getCantidadArticulos() {
        return cantidadArticulos;
    }

    public void setCantidadArticulos(int cantidadArticulos) {
        this.cantidadArticulos = cantidadArticulos;
    }

    public int getCantidad() {
        return cantidad;

    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;

    }

    public String getArticulo() {
        return articulo;

    }

    public void setArticulo(String articulo) {
        this.articulo = articulo;
    }
}
