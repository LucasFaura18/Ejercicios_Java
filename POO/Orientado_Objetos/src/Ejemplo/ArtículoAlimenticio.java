package Ejemplo;

public class ArtículoAlimenticio extends Articulo {
    
 
    String fechaCaducidad;
    int temperatura; 
    public ArtículoAlimenticio(int codigo, String descripcion, double precioCompra, double precioVenta, String fechaCaducidad, int temperatura){
        super(codigo, descripcion, precioVenta, precioCompra);
        this.fechaCaducidad=fechaCaducidad;
        this.temperatura=temperatura;
    }
    public String getFechaCaducidad(){
        return fechaCaducidad;
    }
    public int getTemperatura(){
        return temperatura;
    }
    @Override
    public String toString(){
        return"\nCodigo: "+codigo+"\nDescripcion: "+descripcion+"\nPrecio de compra: "+precioCompra+"\nPrecio de venta: "+precioVenta+"\nStock: "+stock+"\nFecha de caducidad: "+fechaCaducidad+"\nTemperatura recomendada: "+temperatura;
    }
}
