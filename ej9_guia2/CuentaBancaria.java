package ej9_guia2;

public class CuentaBancaria {

	private String cbu;
	private TipoDeCaja tipo;
	private double saldo;
	private double getSaldo() {
		return saldo;
	}


	private void setSaldo(double saldo) {
		this.saldo = saldo;
	}


	private Persona titular;
	
	public CuentaBancaria(TipoDeCaja tipo, Persona titular) {
		this.setTipo(tipo);
		this.setTitular(titular);
		this.setSaldo(0);
		this.setCbu(this.generarCBU());
	}
	
	
	private String generarCBU() {
		String dni = this.getTitular().getDni();
		
		return tipo.ordinal()+10 + "-" + dni + "-" + dni.charAt(dni.length()-1);
	}
	
	public double obtenerSaldo() {
		return this.saldo;
		
	}
	
	public String getCbu() {
		return cbu;
	}


	private void setCbu(String cbu) {
		this.cbu = cbu;
	}


	private TipoDeCaja getTipo() {
		return tipo;
	}


	private Persona getTitular() {
		return titular;
	}


	private void setTipo(TipoDeCaja tipo) {
		this.tipo = tipo;
	}


	private void setTitular(Persona titular) {
		this.titular = titular;
	}


	public void depositar(double num) {
		if(num > 0) {
			this.saldo += num;
		}
		
	}
	
	public void depositar(int num) {
		if(num > 0) {
			this.saldo += num;
		}
	}
	
	
	public boolean extraer(double num) {
		if(num <= saldo && num > 0) {
			this.saldo -= num;
			return true;
		}
		
		return false;
	}
	
}
