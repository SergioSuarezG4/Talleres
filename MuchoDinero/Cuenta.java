package MuchoDinero;


public class Cuenta {
 
    String numero;
    String tipo;
    Cliente titular;
    double saldo;



    public Cuenta(String numero, double saldoInicial, String tipo,  Cliente titular){
        this.numero = numero;
        this.saldo = saldoInicial;
        this.tipo = tipo;
        this.titular = titular;
    }

    public Cuenta(String numero, String tipo, Cliente titular){
        this.numero = numero;
        this.tipo = tipo;
    }

    public Cuenta() {
    }

    /**
     * Retorna el saldo de la cuenta
     * @return Double entrega el saldo de la cuenta
     */

    public double getSaldo(){
        return this.saldo;
    }

    public String getNumero(){
        return this.numero;
    }

    public String getTipo(){
        return tipo;
    }
    public Cliente getTitular(){
        return titular;
    }

    public void setNumero(String numero){
        this.numero = numero;

    }

    public void setTipoCuenta(String TipoCuenta){
         this.tipo = TipoCuenta;
    }

    /**
     * 
     * @param cantidadARetirar double cantidad de dinero a retirar
     * @return
     */
    public boolean retirarSaldo(double cantidadARetirar){
        if(cantidadARetirar <= this.saldo){
            this.saldo -= cantidadARetirar;
            return true;
        }else{
            return false;
        }


    }

    /**
     * Consigna un valor dado a la cuenta
     * @param cantidadAConsignar double La cantidad de dinero a consignar a la cuenta
     */
    public void consignar(double cantidadAConsignar){
        this.saldo += cantidadAConsignar;

    }
    

    }
 