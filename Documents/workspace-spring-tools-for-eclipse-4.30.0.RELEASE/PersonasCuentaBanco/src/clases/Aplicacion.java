package clases;

public class Aplicacion {
	public static void main(String[] args) {
		
		Persona persona1 = new Persona("Martin", 40);
		Persona persona2 = new Persona("Ignacio", 27);
		Persona persona3 = new Persona("Nacho", 24);
		
		CuentaBancaria cuentaMartin = new CuentaBancaria(50000.0, persona1);
		CuentaBancaria cuentaIgnacio = new CuentaBancaria(24500.0, persona2);
		CuentaBancaria cuentaNacho = new CuentaBancaria(18000.0, persona3);
		
		cuentaMartin.depositar(5000.0);
		cuentaMartin.retirar(56000.0);
		
		cuentaIgnacio.depositar(4000.0);
		
		cuentaNacho.depositar(1500.0);
		cuentaNacho.retirar(500);
		
		System.out.println("Saldo Martin: " + cuentaMartin.getSaldo());
		System.out.println("Saldo Ignacio: " + cuentaIgnacio.getSaldo());
		System.out.println("Saldo Nacho: " + cuentaNacho.getSaldo());
		
		CuentaBancaria.ImprimirTodasLasCuentas();
	}
}