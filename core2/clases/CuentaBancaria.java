package clases;
import java.util.ArrayList;
import java.util.Random;


public class CuentaBancaria {
    private double saldo;
    private Persona titular;
    private int numeroCuenta;
    public static ArrayList<CuentaBancaria> listaDeCuentasBancarias = new ArrayList<>();

//constructores
public CuentaBancaria(double saldo, Persona titular){
    this.saldo = saldo;
    this.titular = titular;
    this.numeroCuenta = generarNumeroCuenta();
    //listaDeCuentasBancarias.add(this);
}
public static void agregarCuenta(CuentaBancaria cuenta){
    listaDeCuentasBancarias.add(cuenta);
}
// generar el numero aleatorio de 6  ddigitos
private int generarNumeroCuenta(){
    Random random = new Random();
    return 100000 + random.nextInt(900000);
}
public double getSaldo(){
    return saldo;
}
public Persona getTitular(){
    return titular;
}
public void depositar(double monto){
    if (monto > 0){
        saldo += monto;
        System.out.println("El déposito fue éxitoso");
    } else {
        System.out.println("Para poder depositar, por favor ingresa un monto positivo");
    }
    }
public void retirar(double monto){
    if (monto > 0){
        if (monto >= saldo){
        monto -= saldo;
        System.out.println("El retiro fue exitoso.");
    } else {
        System.out.println("El saldo es insuficiente.");
    }

    }else {
        System.out.println("Por favor ingrese un monto positivo.");

    }
}

public void despliegaInformacion(){
    System.out.println("Cuenta n°: "+ this.numeroCuenta + "Titular:  "+ this.titular + "Tu saldo es: $" + this.saldo);
}
public static void imprimeInformacionDeTodasLasCuentas(){
    if(listaDeCuentasBancarias.isEmpty()){
        System.out.println("No hay cuentas bancarias registradas");
    } else {
        System.out.println("Lista de cuentas bancarias: " + listaDeCuentasBancarias);
    }
    
}
 public String toString() {
        return "Cuenta N°: " + numeroCuenta + ", Titular: " + titular.getNombre() + ", Saldo: $" + saldo;
    }

}
