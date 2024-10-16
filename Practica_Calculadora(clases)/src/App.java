import java.util.Scanner;
import Operaciones.calculadora;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduzca un número: ");
        int a = Integer.parseInt(scanner.nextLine());
        System.out.print("Introduzca otro número: ");
        int b = Integer.parseInt(scanner.nextLine());
        System.out.print("Introduzca el simbolo de la operación: ");
        String operador  = Integer.parseInt(scanner.nextLine());
        System.out.print("El resultado es: "+ calculadora.calculadora);
    }
}
