package Ejercicio3_2;

public class Disco {
    int longitud = 6;
    private String codigo;
    private String autor;
    private String titulo;
    private String genero;
    private int duracion;

    private String generarCodigo(int longitud){
        String codigo = "";
        char minletra = 'A';
        char maxletra = 'Z';
        char minnum = '0';
        char maxnum = '9';
        for (int i=1; i<=longitud; i++){
            if (Math.random()<0.5){
                codigo += (char)(Math.random()*(maxletra-minletra-1)+minletra);
            } else{
                codigo += (char)(Math.random()*(maxnum-minnum-1)+minnum);
            }
        }
        return codigo;
    }

    public Disco(String autor, String titulo, String genero, int duracion){
        this.autor = autor;
        this.titulo = titulo;
        this.genero = genero;
        this.duracion = duracion;
        this.codigo = generarCodigo(longitud);
    }

    public String getCodigo() {
        return codigo;
    }
    public String getAutor() {
        return autor;
    }
    public String getTitulo() {
        return titulo;
    }
    public String getGenero() {
        return genero;
    }
    public int getDuracion() {
        return duracion;
    }

    @Override
    public String toString() {
        return String.format("""
                ------------------------------------------
                Código: %s
                Autor: %s
                Título: %s
                Género: %s
                Duración: %d
                ------------------------------------------
                """, codigo, autor, titulo, genero, duracion);
    }
}
