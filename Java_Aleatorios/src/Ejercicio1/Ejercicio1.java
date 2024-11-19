package Ejercicio1;

public class Ejercicio1 {
    public static void ejercicio1(){
        System.out.printf("Tirada de tres dados: ");
        int suma = 0;
        for (int i=1; i<=3; i++){
            int numero = (int)(Math.random()*6+1);
            System.out.print(numero+" ");
            suma = numero+suma;
        }
        System.out.printf("\nSuma: %d",suma);
    }
}