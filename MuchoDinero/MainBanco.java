package MuchoDinero;


public class MainBanco {
    public static void main(String[] args) {

        boolean pudoCrear;
        Banco banco = new Banco("MuchoDinero");

        Cliente cliente1 = new Cliente("122ggg1", "Sergio");
        Cliente cliente2 = new Cliente("23878906", "Luis");
        Cliente cliente3 = new Cliente("1055789207", "Arnulfo");
        Cliente cliente4 = new Cliente("239053433", "Miguel");


        pudoCrear = banco.adicionarCuenta("123", 4000000, "Corriente",  cliente1);
        System.out.println(pudoCrear);
        
        pudoCrear = banco.adicionarCuenta("1235", 5000000, "Ahorro", cliente2);
        System.out.println(pudoCrear);
        
        pudoCrear = banco.adicionarCuenta("1234", 500000, "Corriente",  cliente3);
        System.out.println(pudoCrear);

        pudoCrear = banco.adicionarCuenta("123", 100000, "Corriente",  cliente4);
        System.out.println(pudoCrear);

       
        for (Cuenta cuentaTemporal : banco.getCuentas()) {
            System.out.printf("Numero: %s Tipo: %s Saldo: %s \n", cuentaTemporal.getNumero(), cuentaTemporal.getTipo(), cuentaTemporal.getSaldo());
        }

        double consultar = banco.consultarTotalDinero();
        System.out.println("El total de dinero del banco es :" + consultar);



        double mayorSaldo = banco.consultarMayorSaldo();
        String clienteMayorSaldo = banco.consultarClienteMayorSaldo();
        System.out.println("El cliente con mayor saldo es : " + clienteMayorSaldo + " Y su saldo es :"+ mayorSaldo); 

        


    }
}