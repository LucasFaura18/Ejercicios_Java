package Ejercicio8;

public class Terminal {
    private int tiempoconversacion;
    private String numero;
    public Terminal(String numero){
        this.tiempoconversacion = tiempoconversacion;
        this.numero = numero;
    }
    public void llama(Terminal f, int tiempo){
        this.tiempoconversacion += tiempo;
        f.tiempoconversacion += tiempo;
    }
    
    @Override
    public String toString() {
        return String.format("No %s - %ds de conversación", this.numero, this.tiempoconversacion);
    }

}
