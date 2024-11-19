package Ejercicio6;

public class Ejercicio6 {
    public static void ejercicio6(){
        System.out.println("Estoy pensando un número del 0 al 100, intenta adivinarlo. Tienes 5 oportunidades.");
        int aleatorio = (int)(Math.random()*101);
        for (int i=1; i<=5; i++){
            System.out.printf("Introduce un número: ");
            int numero = Integer.parseInt(System.console().readLine());
            int oportunidades = 5-i;
            if (numero==aleatorio){
                System.out.println("¡Enhorabuena! ¡has acertado!");
                i = 6;
            }
            if (oportunidades>=1){
                if (numero<aleatorio){
                System.out.printf("El número que estoy pensando es mayor que %d%n", numero);
                System.out.printf("Te quedan %d oportunidades%n", oportunidades);
                }
                if (numero>aleatorio){
                System.out.printf("El número que estoy pensando es menor que %d%n", numero);
                System.out.printf("Te quedan %d oportunidades%n", oportunidades);
                }
            }
            if (oportunidades==0){
                System.out.printf("Lo siento, no has acertado, el número que estaba pensando era el %d", aleatorio);
            }
        }
    }
}
