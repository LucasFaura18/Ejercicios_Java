package Ejercicio3_2;

public class ColeccionDisco implements InterfazDisco {

    protected Disco[] discos;
    public ColeccionDisco(int tamanio){
        discos = new Disco[tamanio];
    }

    public static int encontrarHueco(Disco[] discos){
        for (int posicion = 0; posicion<discos.length; posicion ++){
            if (discos[posicion]==null){
                return posicion;
            }
        }
        return -1;
    }
    public static int encontrarDisco(Disco[] discos, String codigo){
        int posicion = 0;
        boolean encontrado = false;
        while (!encontrado && posicion < discos.length){
            if (discos[posicion].getCodigo().equals(codigo))
                encontrado = true;
            else
                posicion ++;
        }
        if (encontrado = true)
            return posicion;
        else
            return posicion = -1;

    }

    @Override
    public Disco crear(Disco d) {
        int posicion = encontrarHueco(discos);
        if (posicion != -1){
            discos[posicion] = d;
            return d;
        }
        return null;
    }

    @Override
    public Disco[] consultar() {
        return discos;
    }

    @Override
    public Disco actualizar(String codigo, Disco d) {
        int posicion = encontrarDisco(discos, codigo);
        if (posicion != -1){
            discos[posicion]=d;
            return d;
        }else

        return null;
    }

    @Override
    public Disco borrar(String codigo) {
       int posicion = encontrarDisco(discos, codigo);
       if (posicion != -1){
        Disco d = discos[posicion];
        discos[posicion] = null;
        return d;
       } else
       
       return null;
    }

    @Override
    public Disco consultarporCodigo(String codigo) {
        int posicion = encontrarDisco(discos, codigo);
        if (posicion != -1)
            return discos[posicion];

        return null;
    }
    
}
