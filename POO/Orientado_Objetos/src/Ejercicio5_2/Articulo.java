package Ejercicio5_2;

public class Articulo {
    int longitud = 3;
    String codigo;
    String descripcion;
    double precioCompra;
    double precioVenta;
    int stock;

    private static String obtenerCodigo(int longitud){
        String codigo = "";
        char maxletra = 'Z';
        char minletra = 'A';
        char maxnum = '9';
        char minnum = '0';
        for (int i=1; i<=longitud; i++){
            if (Math.random()<0.5){
                codigo += (char)(Math.random()*(maxletra-minletra-1)+minletra);
            } else {
                codigo += (char)(Math.random()*(maxnum-minnum-1)+minnum);
            }
        }
        return codigo;
    }

    public Articulo(String descripcion, double precioCompra, double precioVenta){
        this.descripcion=descripcion;
        this.precioCompra=precioCompra;
        this.precioVenta=precioVenta;
        stock = 0;
        this.codigo=obtenerCodigo(3);
    }

    public String getCodigo() {
        return codigo;
    }
    public String getDescripcion() {
        return descripcion;
    }
    public double getPrecioCompra() {
        return precioCompra;
    }
    public double getPrecioVenta() {
        return precioVenta;
    }
    public int getStock() {
        return stock;
    }
    public void setStock(int stock) {
        this.stock = stock;
    }

    @Override
    public String toString() {
        return String.format("""
                ARTÍCULO
                ========
                Por favor, introduzca los datos del artículo.
                Código: %s
                Descripcion: %s
                Precio de compra: %.2f
                Precio de venta: %.2f
                Stock: %d
                """, codigo, descripcion, precioCompra, precioVenta, stock);
    }
}
