package Ejercicio4;

public class Fraccion {
    private int numerador;
    private int denominador;
    public Fraccion(int numerador, int denominador){
        this.numerador=numerador;
        this.denominador = denominador;
    }
    
    public Fraccion multiplica(int num){
        return new Fraccion(num*this.numerador, this.denominador);
    }
    public Fraccion multiplica(Fraccion f){
        return new Fraccion(this.numerador*f.numerador, this.denominador*f.denominador);
    }
    public Fraccion dividir(Fraccion f){
        return new Fraccion(this.numerador*f.denominador, this.denominador*f.numerador);
    }
    public Fraccion invertir(int num){
        int _numerador=this.denominador;
        int _denominador=this.numerador;
        num = num*-1;
        return new Fraccion(_numerador*num, _denominador*num);
    }
    public Fraccion simplifica(){
        int max = Math.min(numerador, denominador);
        int cont = 2;
        while(cont<= max){
            if(numerador%cont==0 && denominador%cont==0){
                numerador = numerador/cont;
                denominador = denominador/cont;
                max= Math.min(numerador, denominador);
            }
            else 
                cont++;
        }
    }

    @Override
    public String toString(){
        return String.format("%d/%d", this.numerador, this.denominador);
    }
}