package Ejemplo;

public class Articulo {
    int codigo;
    String descripcion;
    double precioCompra;
    double precioVenta;
    int stock;

    public Articulo(int codigo, String descripcion, double precioCompra, double precioVenta){
        this.codigo=codigo;
        this.descripcion=descripcion;
        this.precioCompra=precioCompra;
        this.precioVenta=precioVenta;
        stock=0;
    }
    public int getCodigo(){
        return codigo;
    }
    public String getDescripcion(){
        return descripcion;
    }
    public double getPrecioCompra(){
        return precioCompra;
    }
    public double getPrecioVenta(){
        return precioVenta;
    }
    public int getStock(){
        return stock;
    }
    public void setStock(int cantidad){
        this.stock+=cantidad;
    }
    public String toString(){
        return"\nCodigo: "+codigo+"\nDescripcion: "+descripcion+"\nPrecio de compra: "+precioCompra+"\nPrecio de venta: "+precioVenta+"\nStock: "+stock;
    }
}
