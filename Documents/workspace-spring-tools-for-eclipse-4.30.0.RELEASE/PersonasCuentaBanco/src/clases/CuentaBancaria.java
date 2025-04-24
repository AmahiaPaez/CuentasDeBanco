package clases;
import java.util.ArrayList;

public class CuentaBancaria {
	private double saldo;
	private Persona titular;
	private int numeroCuenta;
	
	public static ArrayList<CuentaBancaria> listaDeCuentasBancarias = new ArrayList<>();
		int totalCuentas =0;
		
	public CuentaBancaria(double saldoCuenta, Persona titularCuenta) {
		this.saldo = saldoCuenta;
		this.titular= titularCuenta;
		this.numeroCuenta = (int)(Math.random() * 900000) + 100000; // numero aleatorio
		listaDeCuentasBancarias.add(this);
	}
	
	public double getSaldo() {
		return saldo;
	}
	
	public Persona getTitular() {
		return titular;
	}
	
	public int getNumeroCuenta() {
		return this.numeroCuenta;
	}
	
	public void setSaldo(double saldoCuenta){
		this.saldo =saldoCuenta;
	}
	
	public void setTitular(Persona titularCuenta) {
		this.titular = titularCuenta;
	}
	
	public void setNumeroDeCuenta(int numeroCuenta) {
		this.numeroCuenta = numeroCuenta;
	}
	
	public void depositar(double monto) {
		if (monto > 0) {
			saldo += monto;
		}
	}
	
	public double retirar(double monto) {
		if (monto > 0 && monto <= saldo) {
			saldo -= monto;
		}else {
			System.out.println("Fondos insuficientes");
		}
		return saldo;
	}
	
	public void despliegaInformacion() {
		System.out.println("----------------------------------------------");
		System.out.println("Numero de cuenta: "+ numeroCuenta );
		System.out.println("Titular de la cuenta: " +titular);
		System.out.println("Saldo: "+saldo);
		System.out.println("----------------------------------------------");
	}
	
	public static void ImprimirTodasLasCuentas() {
		for(CuentaBancaria i: listaDeCuentasBancarias) {
			i.despliegaInformacion();
		}
	}
	
}