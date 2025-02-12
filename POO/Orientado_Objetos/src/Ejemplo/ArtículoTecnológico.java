package Ejemplo;

public class ArtículoTecnológico extends Articulo {
    int garantia;
    String tipo;
    public ArtículoTecnológico(int codigo, String descripcion, double precioCompra,
                             double precioVenta, String tipo, int garantia){
        super(codigo, descripcion, precioVenta, precioCompra);
        this.tipo=tipo;
        this.garantia=garantia;
    }
    public String getTipo(){
        return tipo;
    }
    public int getGarantia(){
        return garantia;
    }
    @Override
    public String toString(){
        return"\nCodigo: "+codigo+"\nDescripcion: "+descripcion+"\nPrecio de compra: "+
        precioCompra+"\nPrecio de venta: "+precioVenta+"\nStock: "+stock+"\nAños de garantia: "+
        garantia+"\nTipo: "+tipo;
    }
}
