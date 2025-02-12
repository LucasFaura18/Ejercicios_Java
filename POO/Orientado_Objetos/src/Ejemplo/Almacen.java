package Ejemplo;

public class Almacen {
    Articulo[] stockProductos;
    int stock;
    public Almacen(int tamanio){
        stockProductos = new Articulo[tamanio];
        stock=0;
    }
    private int encontrarHueco(){
        int posicion=-1;
        int hueco=0;
        while(hueco<stockProductos.length&&posicion==-1){
            if (stockProductos[hueco]==null){
                posicion=hueco;
            }
            hueco++;
        }
        return posicion;
    }
    public void nuevoProducto(Articulo n)throws AlmacenLleno{
        int posicion=encontrarHueco();
        if (posicion!=-1&&stockProductos[posicion]==null)
        stockProductos[posicion]=n;
        
    }
    private int buscarProducto(int codigo){
        int posicion=-1;
        int hueco=0;
        while(hueco<stockProductos.length&&posicion==-1){
            if (stockProductos[hueco].getCodigo()==codigo){
                posicion=hueco;
                return posicion;
            }
            hueco++;
        }
        return posicion;
    }
    public void borrarProducto(int codigo)throws ArticuloNoEncontrado{
        int posicion=buscarProducto(codigo);
        if (posicion!=-1){
            stockProductos[posicion]=null;
        }
    }
    public void modifica(int codigo, Articulo n)throws ArticuloNoEncontrado{
        int posicion=buscarProducto(codigo);
        if (posicion!=-1){
            stockProductos[posicion]=n;
        }
    }
    public void entrada(int cantidad, int codigo)throws ArticuloNoEncontrado{
        int posicion=buscarProducto(codigo);
        if (posicion!=-1){
            stockProductos[posicion].stock+=cantidad;
        } 
    }
    public void salida(int cantidad, int codigo)throws ArticuloNoEncontrado, NoSuficienteStock{
        int posicion=buscarProducto(codigo);
        if (posicion!=-1){
            stockProductos[posicion].stock-=cantidad;
        } 
    }
    @Override
    public String toString(){
        String res = "";
        for(Articulo a:stockProductos){
            if(a!=null)
                res += a.toString();
        }
        return res;
    }

}
