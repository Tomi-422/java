package ej9_guia2;

public class Test {

	public static void main(String[] args) {
		
		TipoDeCaja tipo = TipoDeCaja.CAJA_DE_AHORRO;
		System.out.println(tipo.ordinal());
		tipo = TipoDeCaja.CUENTA_CORRIENTE;
		System.out.println(tipo.ordinal());
		
		CuentaBancaria cuenta = new CuentaBancaria(TipoDeCaja.CUENTA_CORRIENTE, new Persona("43407805"));
		
		cuenta.depositar(500);
		cuenta.extraer(100);
		System.out.println(cuenta.obtenerSaldo());
		System.out.println(cuenta.getCbu());
	}


}
