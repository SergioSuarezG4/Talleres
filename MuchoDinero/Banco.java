package MuchoDinero;

import java.util.ArrayList;

public class Banco {
  String nombre;
  ArrayList<Cuenta> cuentas;


  public Banco(String nombre){
    this.nombre = nombre;
    this.cuentas = new ArrayList<Cuenta>();

  }

  public Cuenta buscarCuenta(String numero){
    for(Cuenta cuentaTemporal : this.cuentas){
      if(cuentaTemporal.getNumero().equals(numero)){
        return cuentaTemporal;
      }
    }
    return null;
  }

  public boolean adicionarCuenta(
    String numero,
    double saldoInicial,
    String tipo,
    Cliente titular
  ){
    if(buscarCuenta(numero) != null){
      return false;
    } else {
      Cuenta nuevaCuenta = new Cuenta(numero, saldoInicial, tipo, titular);
      this.cuentas.add(nuevaCuenta);
      return true;
    }
  }

  double mayorSaldo= 0;
  public  double consultarMayorSaldo(){
    for(Cuenta cuenta: cuentas){
      if(cuenta.getSaldo() > mayorSaldo){
        mayorSaldo = cuenta.getSaldo();
      }
    }
      return mayorSaldo;
  }


  public double consultarTotalDinero(){
    double totalDinero = 0;
    for(Cuenta cuenta : this.cuentas){
      totalDinero += cuenta.getSaldo();
    }
    return totalDinero;
  }

  public String consultarClienteMayorSaldo() {
    double mayorSaldo = 0;
    String ClienteMayorSaldo = "";

    for (Cuenta cuenta : this.cuentas) {
      if (cuenta.getSaldo() > mayorSaldo) {
        mayorSaldo = cuenta.getSaldo();
        ClienteMayorSaldo = cuenta.getTitular().getNombre();
      }
    }
    return ClienteMayorSaldo;
  }


public String getNombre(){
  return this.nombre;
}

  public ArrayList<Cuenta> getCuentas(){
    return this.cuentas;
  }

}
  
