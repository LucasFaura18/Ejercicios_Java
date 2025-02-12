package Ejercicio5_2;

public class Almacen implements InterfazAlmacen {
    Articulo[] stockArticulos;
    int stock;

    public Almacen(int articulos){
        stockArticulos = new Articulo[articulos];
        stock = 0; 
    }

    public int encontrarHueco(){
        int posicion = -1;
        int contador = 0;
        while (posicion==-1 && contador<stockArticulos.length) {
            if (stockArticulos[contador]==null){
                posicion = contador;
            }
            contador++;
        }
        return posicion;
    }

    public int encontrarArticulo(String codigo){
        int posicion = -1;
        int contador = 0;
        while (posicion == -1 && contador < stockArticulos.length) {
            if (stockArticulos[contador]!=null &&
                stockArticulos[contador].getCodigo().equals(codigo)){
                posicion = contador;
            }
            contador++;
        }
        return posicion;
    }

    @Override
    public String altaArticulo(Articulo a) throws ArtciuloYaExiste, AlmacenamientoInsuficiente {
        int posicion = encontrarArticulo(a.getCodigo());
        if (posicion!=-1){
            throw new ArtciuloYaExiste();
        }
        posicion = encontrarHueco();
        if (posicion == -1){
            throw new AlmacenamientoInsuficiente();
        }
        stockArticulos[posicion]=a;
        return a.codigo;
    }

    @Override
    public Articulo[] consultar() {
        return stockArticulos;
    }

    @Override
    public Articulo modificarArticulo(String codigo, Articulo a) throws ArticuloNoExiste{
        int posicion = encontrarArticulo(codigo);
        if (posicion==-1) {
            throw new ArticuloNoExiste();
        }
        Articulo anterior = stockArticulos[posicion];
        stockArticulos[posicion]=a;
        
        return anterior;
    }

    @Override
    public Articulo bajaArticulo(String codigo) throws ArticuloNoExiste{
       int posicion = encontrarArticulo(codigo);
       if (posicion == -1){
        System.out.println();
       }
       Articulo a = stockArticulos[posicion];
       stockArticulos[posicion] = null;
       return a;
    }

    @Override
    public int entradaStock(String codigo, int cantidad) throws ArticuloNoExiste{
        int posicion = encontrarArticulo(codigo);
        if (posicion == -1) {
            throw new ArticuloNoExiste();
        }
        stockArticulos[posicion].setStock(stockArticulos[posicion].getStock()+cantidad);
        return stockArticulos[posicion].getStock();
    }

    @Override
    public int bajadaStock(String codigo, int cantidad) throws ArticuloNoExiste{
        int posicion = encontrarArticulo(codigo);
        if (posicion == -1) {
            throw new ArticuloNoExiste();
        }
        stockArticulos[posicion].setStock(stockArticulos[posicion].getStock()-cantidad);
        return stockArticulos[posicion].getStock();
    }

    @Override
    public Articulo obtenerArticulo(String codigo) throws ArticuloNoExiste {
        int posicion = encontrarArticulo(codigo);
        if (posicion == -1){
            throw new ArticuloNoExiste();
        }
        return stockArticulos[posicion];
    }
    
}
