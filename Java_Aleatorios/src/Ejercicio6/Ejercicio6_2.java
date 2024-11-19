package Ejercicio6;

public class Ejercicio6_2 {
    public static void ejercicio6_2(){
        System.out.println("Estoy pensando en un número entre 0 y 100. ¡Intenta adivinarlo! Te voy a dar 5 oportunidades.");
        System.out.println("Por favor, piensa un número en ese rango y no lo digas.");

        int minimo = 0;
        int maximo = 100;
        int intentos = 7;
    
        for (int i = 1; i <= intentos; i++) {
            //suposicion de la maquina
            int suposicion = (minimo + maximo) / 2;
            System.out.printf("Intento %d: ¿Es el número %d? (Responde con 'mayor', 'menor' o 'correcto')%n", i, suposicion);
    
            // Lector de respuesta
            String respuesta = System.console().readLine().toLowerCase().trim();

            if (respuesta.equals("correcto")) {
                System.out.println("¡Genial! El ordenador ha adivinado tu número.");
                break;
            } else if (respuesta.equals("menor")) {
                maximo = suposicion - 1; 
            } else if (respuesta.equals("mayor")) {
                minimo = suposicion + 1;
            } else {
                System.out.println("Respuesta no válida. Por favor responde con 'mayor', 'menor' o 'correcto'.");
                i--;
            }
            if (i == intentos) {
                System.out.printf("¡Se me han acabado los intentos! El número que pensaste era %d.%n", (minimo + maximo) / 2);
            }
        }
    }
}
