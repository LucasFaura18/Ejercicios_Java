package Ejercicio2;

import java.util.ArrayList;

public class Ejercicio2 {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<Integer>();
        int cantidad = (int)(Math.random()*(20-10+1)+10);
        for (int i=0; i<cantidad; i++){
            numeros.add((int)(Math.random()*100+1));
        }
        System.out.println(numeros);
        int suma=0;
        int min=110;
        int max=0;
        for (Integer digito : numeros) {
            suma += digito;
            if (digito>max){
                max=digito;
            }
            if (digito<min){
                min=digito;
            }
        }
        System.out.printf("La suma de los numeros es: %d%n", suma);
        System.out.printf("La media de los numeros es: %.2f%n", (double)suma/numeros.size());
        System.out.printf("El maximo nuemro es: %d%n", max);
        System.out.printf("El minimo numero es: %d%n", min);
    }
}
