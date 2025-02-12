package Ejercicio10;

public class Ameba {
    private int peso=3;
    private int comida;
    public Ameba(){
        this.peso = peso;
        this.comida=comida;
    }
    public void come(int comida){
        this.peso = this.peso+(comida-1);
    }

    public void come(Ameba a){
        this.peso= this.peso+(a.peso-1);
        a.peso=0;
    }

    @Override
    public String toString() {
        return String.format("Soy una ameba y peso %d microgramos", this.peso);
    }
}
