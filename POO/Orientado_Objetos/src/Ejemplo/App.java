package Ejemplo;

public class App {
    private static Almacen almacen = new Almacen(100);
    public static int menu(){
        System.out.println("""
            G E S T I S I M A L
            ===================
            1. Listado
            2. Alta
            3. Baja
            4. Modificación
            5. Entrada de mercancía
            6. Salida de mercancía
            7. Salir
            Introduzca una opción: 
                """);
            int opcion=Integer.parseInt(System.console().readLine());
            return opcion;
    }
    public static void NuevoArticulo(){
        System.out.println("""
            NUEVO ARTÍCULO
            ==============
            Seleccione el tipo de artículo:
            1. Genérico
            2. Alimenticio
            3. Tecnológico
            Opción:
                """);
            int opcion=Integer.parseInt(System.console().readLine());
            System.out.println("\nPor favor, introduzca los datos del artículo.");
            System.out.print("\nCodigo: ");
            int codigo =Integer.parseInt(System.console().readLine());
            System.out.print("\nDescripcion: ");
            String descripcion =System.console().readLine();
            System.out.print("\nPrecio de compra: ");
            double precioCompra =Double.parseDouble(System.console().readLine());
            System.out.print("\nPrecio de venta: ");
            double precioVenta =Double.parseDouble(System.console().readLine());
            Articulo a = new Articulo(codigo, descripcion, precioCompra, precioVenta);
            switch (opcion) {
                case 1:
                break;
                case 2:
                    System.out.print("\nTemperatura: ");
                    int temperatura =Integer.parseInt(System.console().readLine());
                    System.out.print("\nFecha de caducidad (YYYY-MM-DD): ");
                    String fechaCaducidad =System.console().readLine();
                    System.out.print("\nPrecio de compra: ");
                    a = new ArtículoAlimenticio(codigo, descripcion, precioCompra, precioVenta, fechaCaducidad, temperatura);
                break;
                case 3:
                    System.out.print("\nGarantía (en años): ");
                    int garantia =Integer.parseInt(System.console().readLine());
                    System.out.print("\nTipo: ");
                    String tipo =System.console().readLine();
                    System.out.print("\nPrecio de compra: ");
                    a = new ArtículoTecnológico(codigo, descripcion, precioCompra, precioVenta, tipo, garantia);
                break;
                default:
                    break;
            }
        try {
            almacen.nuevoProducto(a);
        } catch (AlmacenLleno e) {
            System.out.println("\nEl almacen esta lleno.");
        }
    }
    public static void baja(){
        System.out.println("""
            BAJA ARTICULO
            ================
            Escriba el codigo del articulo a borrar:
                """);
        int codigo =Integer.parseInt(System.console().readLine());
        try {
            almacen.borrarProducto(codigo);
        } catch (ArticuloNoEncontrado e) {
            System.out.println("\nEl articulo no ha sido encontrado");
        }
    }
    public static void listado(){
        System.out.println(almacen);
    }
    public static void modifica(){
        System.out.println("""
            MODIFICAR ARTICULO
            ==================
            Escriba el codigo del articulo a modificar:
                """);
        int cod =Integer.parseInt(System.console().readLine());
        System.out.print("""
            Escriba los datos del articulo
            Seleccione el tipo de artículo:
            1. Genérico
            2. Alimenticio
            3. Tecnológico
            Opción:
                """);
            int opcion=Integer.parseInt(System.console().readLine());
            System.out.print("\nCodigo: ");
            int codigo =Integer.parseInt(System.console().readLine());
            System.out.print("\nDescripcion: ");
            String descripcion =System.console().readLine();
            System.out.print("\nPrecio de compra: ");
            double precioCompra =Double.parseDouble(System.console().readLine());
            System.out.print("\nPrecio de venta: ");
            double precioVenta =Double.parseDouble(System.console().readLine());
            Articulo a = new Articulo(codigo, descripcion, precioCompra, precioVenta);
            switch (opcion) {
                case 1:
                break;
                case 2:
                    System.out.print("\nTemperatura: ");
                    int temperatura =Integer.parseInt(System.console().readLine());
                    System.out.print("\nFecha de caducidad (YYYY-MM-DD): ");
                    String fechaCaducidad =System.console().readLine();
                    System.out.print("\nPrecio de compra: ");
                    a = new ArtículoAlimenticio(codigo, descripcion, precioCompra, precioVenta, fechaCaducidad, temperatura);
                break;
                case 3:
                    System.out.print("\nGarantía (en años): ");
                    int garantia =Integer.parseInt(System.console().readLine());
                    System.out.print("\nTipo: ");
                    String tipo =System.console().readLine();
                    System.out.print("\nPrecio de compra: ");
                    a = new ArtículoTecnológico(codigo, descripcion, precioCompra, precioVenta, tipo, garantia);
                break;
                default:
                    break;
            }
        try {
            almacen.modifica(cod, a);
        } catch (ArticuloNoEncontrado e) {
            System.out.println("\nEl articulo no ha sido encontrado");
        }
    }
    public static void entrada(){
        System.out.println("""
            Entrada de mercancia
            ==================
            Escriba el codigo del articulo a modificar:
                """);
        int cod =Integer.parseInt(System.console().readLine());
        System.out.print("\nAhora introduzca la cantidad de mercancia: ");
        int cantidad=Integer.parseInt(System.console().readLine());
        try {
            almacen.entrada(cantidad, cod);
        } catch (ArticuloNoEncontrado e) {
            System.out.println("\nEl articulo no ha sido encontrado");
        }
    }
    public static void salida(){
        System.out.println("""
            Salida de mercancia
            ==================
            Escriba el codigo del articulo a modificar:
                """);
        int cod =Integer.parseInt(System.console().readLine());
        System.out.print("\nAhora introduzca la cantidad de mercancia: ");
        int cantidad=Integer.parseInt(System.console().readLine());
        try {
            almacen.salida(cantidad, cod);
        } catch (ArticuloNoEncontrado e) {
            System.out.println("\nEl articulo no ha sido encontrado");
        } catch (NoSuficienteStock e) {
            System.out.println("\nNo hay suficiente stock");
        }
    }
    public static void main(String[] args) throws Exception {
        
            int opcion=-1;
            do{
                opcion =menu();
                switch (opcion) {
                    case 1:
                        listado();
                    break;
                    case 2:
                        NuevoArticulo();
                    break;
                    case 3:
                    baja();
                    break;
                    case 4:
                    modifica();
                    break;
                    case 5:
                    entrada();
                    break;
                    case 6:
                    salida();
                    break;
                    default:
                        break;
                }
            }while(opcion!=7);
        
    }
}
