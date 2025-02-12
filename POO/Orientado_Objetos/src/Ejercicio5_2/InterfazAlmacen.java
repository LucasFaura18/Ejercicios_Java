package Ejercicio5_2;

public interface InterfazAlmacen {
    public String altaArticulo(Articulo a) throws ArtciuloYaExiste, AlmacenamientoInsuficiente;
    public Articulo[] consultar();
    public Articulo modificarArticulo(String codigo, Articulo a) throws ArticuloNoExiste;
    public Articulo bajaArticulo(String codigo) throws ArticuloNoExiste;
    public int entradaStock(String codigo, int cantidad) throws ArticuloNoExiste;
    public int bajadaStock(String codigo, int cantidad) throws ArticuloNoExiste;
    public Articulo obtenerArticulo(String codigo) throws ArticuloNoExiste;

}
