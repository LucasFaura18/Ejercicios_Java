package Ejercicio6;

import java.util.HashMap;

public class Ejercicio6 {
    public static void main(String[] args) {
        HashMap<String, String> usuarios = new HashMap<String, String>();
        usuarios.put("juan", "1234");
        usuarios.put("pepe", "6789");
        System.out.println("Inicio de sesion");
        System.out.print("Usuario: ");
        String usuario = System.console().readLine();
        System.out.print("Contraseña: ");
        String contraseña = System.console().readLine();
        if(usuarios.get(usuario).equals(contraseña)){
            System.out.println("Ha accedido al sistema");
        } else {
            System.out.println("Aparta notas");
        }
    }
}
