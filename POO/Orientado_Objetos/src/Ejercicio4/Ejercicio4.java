package Ejercicio4;

public class Ejercicio4 {
    public static void main(String[] args){
        Fraccion f1 = new Fraccion(-7,8);
        System.out.println(f1+" x 5 = "+f1.multiplica(5));
        System.out.println(f1+" ^ -1 = "+f1.invertir(-1));
        System.out.println(f1+" x 3/5 = "+f1.multiplica(new Fraccion(3, 5)));
        System.out.println(f1+" : 3/5 = "+f1.dividir(new Fraccion(3, 5)));
        
    }
    
}
