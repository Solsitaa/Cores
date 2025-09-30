import clases.CuentaBancaria;
import clases.Persona;
public class Aplicacion {
    public static void main(String[] args){
        Persona persona1 = new Persona("Javier", 26);
        CuentaBancaria cuenta1 = new CuentaBancaria(4500.0, persona1);
        CuentaBancaria.agregarCuenta(cuenta1);

        Persona persona2 = new Persona("Luis", 24);
        CuentaBancaria cuenta2 = new CuentaBancaria(30.0, persona2);
        CuentaBancaria.agregarCuenta(cuenta2);

        Persona persona3 = new Persona("Fernanda", 18);
        CuentaBancaria cuenta3 = new CuentaBancaria(-200.0, persona3);
        CuentaBancaria.agregarCuenta(cuenta3);

        System.out.println("Las cuentas bancarias registradas son: " + CuentaBancaria.listaDeCuentasBancarias);
    }
    
}
