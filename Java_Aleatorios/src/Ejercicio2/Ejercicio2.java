package Ejercicio2;

public class Ejercicio2 {
    public static void ejercicio2(){
        int numero = (int)(Math.random()*13+1);
        int palo = (int)(Math.random()*4+1);
        switch (numero) {
            case 1:
                System.out.printf("A");
                break;
            case 2:
                System.out.printf("2");
                break;
            case 3:
                System.out.printf("3");
                break;
            case 4:
                System.out.printf("4");
                break;
            case 5:
                System.out.printf("5");
                break;
            case 6:
                System.out.printf("6");
                break;
            case 7:
                System.out.printf("7");
                break;
            case 8:
                System.out.printf("8");
                break;
            case 9:
                System.out.printf("9");
                break;
            case 10:
                System.out.printf("10");
                break;
            case 11:
                System.out.printf("J");
                break;
            case 12:
                System.out.printf("Q");
                break;
            case 13:
                System.out.printf("K");
                break;
            default:
                break;
        }
        switch (palo) {
            case 1:
                System.out.printf(" de corazones");
                break;
            case 2:
                System.out.printf(" de treboles");
                break;
            case 3:
                System.out.printf(" de diamantes");
                break;
            case 4:
                System.out.printf(" de picas");
                break;
            
            default:
                break;
        }
    }
    
}
