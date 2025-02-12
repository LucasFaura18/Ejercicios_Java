package Ejercicio11;

public class TarjetaRegalo {
    private int numero = (int)(Math.random()*(100000-10000+1)+10000);
    private double saldo;
    
    public TarjetaRegalo(double saldo){
        this.saldo=saldo;
        this.numero=numero;
    }

    public void gasta(double cobro){
        if (cobro>this.saldo) {
            System.out.printf("No tiene suficiente saldo para gastar %.2f $ \n", cobro);
        }
        else{
            this.saldo -= cobro;
        } 
    }

    public TarjetaRegalo fusionaCon(TarjetaRegalo t){
        TarjetaRegalo t3 = new TarjetaRegalo(this.saldo+t.saldo);
        this.saldo=0;
        t.saldo=0;
        return t3;
    }

    @Override
    public String toString() {
        return String.format("Tarjeta no %d - Saldo %.2f$", this.numero, this.saldo);
    }
}
