package Ejercicio5_2;

public class Ejercicio5 {
    private static Almacen almacen = new Almacen(100);
    private static void menu(){
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
    }

    private static void listado(){
        Articulo[] articulos = almacen.consultar();
        for (int i=0; i<articulos.length; i++){
            if  (articulos[i]!=null){
                System.out.println(articulos[i]);
            }
        }
    }

    private static void nuevo(){
        System.out.println("""
                NUEVO ARTÍCULO
                ==============
                Por favor, introduzca los datos del artículo.
                """);
        System.out.printf("Descripcion: ");
        String descripcion = System.console().readLine();
        System.out.printf("Precio compra: ");
        double precioCompra = Double.parseDouble(System.console().readLine());
        System.out.printf("Precio venta: ");
        double precioVenta = Double.parseDouble(System.console().readLine());
        Articulo a = new Articulo(descripcion, precioCompra, precioVenta);
        System.out.println(a.getCodigo());
        try{
            almacen.altaArticulo(a);
        } catch (ArtciuloYaExiste e){
            System.out.println("El artículo ya existe");
        } catch (AlmacenamientoInsuficiente e){
            System.out.println("El almacen esta lleno");
        }
    }

    private static void modifica(){
        System.out.println("""
            MODIFICA ARTÍCULO
            ==============
            """);
        System.out.print("Introduzca el código del artículo: ");
        String codigo = System.console().readLine();
        try{
            Articulo a = almacen.obtenerArticulo(codigo);
            System.out.printf("Descripcion: ");
            System.out.printf(a.getDescripcion());
            System.out.println("Nueva descripcion: ");
            String descripcion = System.console().readLine();
            if (descripcion.isEmpty()){
                descripcion = a.getDescripcion();
            }
            System.out.printf("Precio compra: ");
            System.out.println(a.getPrecioCompra());
            System.out.println("Nuevo precio compra: ");
            double precioCompra = Double.parseDouble(System.console().readLine());
            System.out.printf("Precio venta: ");
            System.out.println(a.getPrecioVenta());
            System.out.println("Nuevo precio venta: ");
            double precioVenta = Double.parseDouble(System.console().readLine());
            Articulo nuevo = new Articulo(descripcion, precioCompra, precioVenta);
            almacen.modificarArticulo(codigo, nuevo);
        } catch (ArticuloNoExiste e){
            System.out.println("El articulo no existe");
        }
    }

    private static void baja(){
        System.out.println("""
                BAJA ARTICULO 
                =============
                """);
        System.out.printf("Introduce el codigo: ");
        String codigo = System.console().readLine();
        try{
            almacen.bajaArticulo(codigo);
        } catch (ArticuloNoExiste e){
            System.out.println("Ese articulo no existe");
        }

    }

    private static void entrada(){
        System.out.printf("Introduce el codigo del articulo: ");
        String codigo = System.console().readLine();
        System.out.println("Entrada de mercancia del articulo");
        try{
            Articulo a = almacen.obtenerArticulo(codigo);
            System.out.print(a);
            System.out.printf("Introduzca la cantidad a añadir: ");
            int cantidad = Integer.parseInt(System.console().readLine());
            almacen.entradaStock(codigo, cantidad);
            System.out.println("La mercancia ha entrado en el almacen");
        } catch (ArticuloNoExiste e){
            System.out.println("El articulo no existe");
        }
        
    }

    private static void salida(){
        System.out.printf("Introduce el codigo del articulo: ");
        String codigo = System.console().readLine();
        System.out.println("Salida de mercancia del articulo");
        try{
            Articulo a = almacen.obtenerArticulo(codigo);
            System.out.print(a);
            System.out.printf("Introduzca la cantidad a quitar: ");
            int cantidad = Integer.parseInt(System.console().readLine());
            almacen.bajadaStock(codigo, cantidad);
            System.out.println("La mercancia ha salido del almacen");
        } catch (ArticuloNoExiste e){
            System.out.println("El articulo no existe");
        }
    }


    public static void main(String[] args) {
        int opcion = -1;
        do{
            menu();
            opcion = Integer.parseInt(System.console().readLine());
            switch (opcion) {
                case 1:
                    {
                      listado();      
                    }
                    break;
                case 2:
                    {
                        nuevo();
                    }
                    break;
                case 3:
                    {
                        baja();
                            
                    }
                    break;
                case 4:
                    {
                        modifica();       
                    }
                    break;
                case 5:
                    {
                       entrada();     
                    }
                    break;
                case 6:
                    {
                        salida();
                    }
                    break;
                case 7:
                    break;
                default:
                    System.out.println("Opción incorrecta");
            }
        } while (opcion!=7); 
            
    }
}
