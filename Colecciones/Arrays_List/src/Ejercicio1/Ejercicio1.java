package Ejercicio1;

import java.util.ArrayList;

public class Ejercicio1 {
    public static void main(String[] args) {
        ArrayList<String> compañeros = new ArrayList<String>();
        compañeros.add("Sergii");
        compañeros.add("Samuel");
        compañeros.add("Javi");
        compañeros.add("Alberto");
        compañeros.add("Thiago");
        compañeros.add("Dario");
        for (String persona : compañeros) {
            System.out.println(persona);
        }
    }
}
