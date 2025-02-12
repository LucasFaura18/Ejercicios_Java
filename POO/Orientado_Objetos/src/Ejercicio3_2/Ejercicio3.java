package Ejercicio3_2;

public class Ejercicio3 {
    private static ColeccionDisco coleccion = new ColeccionDisco(10);
    private static void menu(){
        System.out.println("""
                COLECCIÓN DE DISCOS
                ===================
                1. Listado
                2. Nuevo disco
                3. Modificar
                4. Borrar
                5. Salir
                Introduzca una opción: 
                """);
    }

    private static void listar(){
        Disco [] discos = coleccion.consultar();
        for (int i=0; i<discos.length; i++){
            if (discos[i] != null)
                System.out.println(discos[i]);
        }
    }

    private static void crear(){
        System.out.println("""
                NUEVO DISCO
                ===========
                Por favor, introduzca los datos del disco.
                """);
        System.out.printf("Introduce el autor: ");
        String autor = System.console().readLine();
        System.out.printf("Introduce el titulo: ");
        String titulo = System.console().readLine();
        System.out.printf("Introduce el genero: ");
        String genero = System.console().readLine();
        System.out.printf("Introduce la duración: ");
        int duracion = Integer.parseInt(System.console().readLine());
        Disco d = coleccion.crear(new Disco(autor, titulo, genero, duracion));
        if (d == null){
            System.out.println("Lo siento no hay más espacio");
        } else{
            System.out.printf("Disco %s creado correctamente\n",d.getCodigo());
        }
    }

    private static void modificar(){
        System.out.printf("Por favor introduzca el codigo del dico del que desea cambiar los datos: ");
        String codigo = System.console().readLine();
        Disco d = coleccion.consultarporCodigo(codigo);
        if (d!=null){
            System.out.printf("Autor: %s", d.getAutor());
            System.out.print("\nnuevo Autor: ");
            String autor = System.console().readLine();
            System.out.printf("Titulo: %s", d.getTitulo());
            System.out.print("\nnuevo Titulo: ");
            String titulo = System.console().readLine();
            System.out.printf("Genero: %s", d.getGenero());
            System.out.print("\nnuevo Genero: ");
            String genero = System.console().readLine();
            System.out.printf("Duracion: %d", d.getDuracion());
            System.out.print("\nnueva Duracion: ");
            int duracion = Integer.parseInt(System.console().readLine());
            Disco actualizado = coleccion.actualizar(d.getCodigo(), new Disco(autor, titulo, genero, duracion));
            if (actualizado!=null){
                System.out.printf("Disco %s actualizado correctamente\n", actualizado.getCodigo());
            } else{
                System.out.println("No se pudo actualizar el disco");
            }

        }
    }

    private static void borrar(){
        System.out.printf("Introduce el codigo del disco que quieres borrar: ");
        String codigo = System.console().readLine();
        Disco d = coleccion.borrar(codigo);
        if (d!=null){
            System.out.printf("\nDisco %s se elimino correctamente", d.getCodigo());
        }else{
            System.out.println("No se pudo borrar el disco");
        }
    }
    public static void main(String[] args) {
        int opcion = -1;
        do{
            menu();
            opcion = Integer.parseInt(System.console().readLine());
            switch (opcion) {
                case 1:
                    listar();
                    break;
                case 2:
                    crear();
                    break;
                case 3:
                    modificar();
                    break;
                case 4:
                    borrar();
                    break;
                default:
                    break;
            }
        } while (opcion!=5);
    }
}
