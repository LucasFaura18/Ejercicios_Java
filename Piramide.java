public class Piramide {
    public static void main(String[] args){
        int fila=10;
        for (int i=fila; i>=1; i--){
            for (int j=1; j<=i; j++){
                System.out.printf(" ");
            }
            for (int c=i; c<=fila; c++){
                System.out.printf("* ");

            }
            System.out.printf("");
        }
    }
}
