package Operaciones;

public class calculadora {
    private double operando1 = null;
    private double operando2 = null;
    private String operador = null;
    private double memory;
    private double result = null;
    
    public double getOperando1(){
        return operando1;
    }
    public void setOperando1(int a){
        this.operando1 = a;
    }
    public double getOperando2(){
        return operando2;
    }
    public void setOperando2(int b){
        this.operando2 = b;
    }
    public String getOperador(){
        return operador;
    }
    public void setOperador(String operador){
        this.operador = operador;
    }
    public double getmemory(){
        if(this.operando1 == null)
        this.operando1 = this.memory;
        else if(this.operando2==null)
        this.opreando2 = this.memory;
        return this.memory;
    }
    public void setMemory(double memory){
        this.memory = memory;
    }

    /*con un segun se hacen los calculos */
    public double getResult() throws OperadorInvalido(){
        if(this.operando1==null){
            return 0;
        }
        else if(this.operando2==null){
            this.operando2= this.operando1;
        }
        else if(this.operador==null){
            return this.operando1;
        }
        switch(operador){
            case"+":
                this.result= this.result + this.operando1 + this.operando2;
                this.operando1 = null
                this.operando2 = null
                break;
            case"-":
                this.result= this.result + this.operando1 - this.operando2;
                this.operando1 = null
                this.operando2 = null
                break;
            case"*":
                this.result= this.result + this.operando1 * this.operando2;
                this.operando1 = null
                this.operando2 = null
                break;
            case"/":
                this.result= this.result + this.operando1 / this.operando2;
                this.operando1 = null
                this.operando2 = null
                break;
            default:
                throw new OperadorInvalido();
        }

    }
}
