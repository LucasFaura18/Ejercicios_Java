package Ejercicio5;

public class Ejercicio5 {
    public static void ejercicio5(){
        int minimo = 200;
        int maximo = 0;
        int media = 0;
        for (int i=1; i<=50; i++){
            int numero = (int)(Math.random()*100+99);
            System.out.printf(numero+" ");
            if (numero<minimo)
                minimo=numero;
            if (numero>maximo)
                maximo=numero;
            media = (media+numero)/2;
        }
        System.out.printf("\nMínimo: %d%n",minimo);
        System.out.printf("Máximo: %d%n",maximo);
        System.out.printf("Media: %d%n",media);
    }
}
