public class Main {
    public static void main(String[] args){
        //Definir altura como entero
        int altura = 10;
        long altura2 = 100;
        short altura3 = 100;
        byte mibyte = 10;
        boolean salir = false;
        char y = 'A'+1;
        double peso = 200.50;
        float peso2 = 200.50f;
        String nombre = "Lucas";
        //operaciones = + - * / %
        int v1, v2, v3;
        v1 = 10;
        v2 = 5;
        v3 = v1 % v2;
        System.out.println(v3);
        v3 = v1 / v2;
        System.out.println(v3);
        boolean a, b, c, d;
        a=true;
        b=true;
        c=false;
        d= (c && a || b);
        System.out.println(d);
        double d1, d2, d3;
        d1=9;
        //Raíz cuadrada
        d2= Math.sqrt(d1);
        // Potencia
        d3= Math.pow(d1, 3);

    }
}