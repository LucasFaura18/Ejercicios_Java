package Ejercicio10;

import java.util.HashMap;

public class Ejercicio10 {
    public static void main(String[] args) {
        HashMap<String, String> diccionario = new HashMap<String, String>();
        diccionario.put("libro", "book");
        diccionario.put("dinero", "money");
        diccionario.put("correr", "run");
        diccionario.put("saltar", "jump");
        System.out.print("Introduce una palabra para ver su traduccion: ");
        String palabra = System.console().readLine();
        if (diccionario.get(palabra) != null){
            System.out.printf("La palabra %s en ingles es: %s", palabra, diccionario.get(palabra));
        }else{
            System.out.println("Esa palabra no se encuentra en el diccionario");
        }
    }
    
}
