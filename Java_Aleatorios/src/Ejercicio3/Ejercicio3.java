package Ejercicio3;

public class Ejercicio3 {
    public static void ejercicio3(){
        int numero = (int)(Math.random()*10+1);
        int palo = (int)(Math.random()*4+1);
        switch (numero) {
            case 1:
                System.out.printf("As");
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
                System.out.printf("Sota");
                break;
            case 9:
                System.out.printf("Caballo");
                break;
            case 10:
                System.out.printf("Rey");
                break;
            default:
                break;
        }
        switch (palo) {
            case 1:
                System.out.printf(" de espadas");
                break;
            case 2:
                System.out.printf(" de copas");
                break;
            case 3:
                System.out.printf(" de bastos");
                break;
            case 4:
                System.out.printf(" de oros");
                break;
            
            default:
                break;
        }
    }
}

