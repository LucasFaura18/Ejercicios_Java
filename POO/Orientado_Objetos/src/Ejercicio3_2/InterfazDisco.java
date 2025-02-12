package Ejercicio3_2;

public interface InterfazDisco {
    public Disco crear(Disco d);
    public Disco[] consultar();
    public Disco actualizar(String codigo, Disco d);
    public Disco borrar(String codigo);
    public Disco consultarporCodigo(String codigo);
}
