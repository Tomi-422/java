package ej11_guia2;

public class Turnera {

	private int ultimoNumeroOtorgado;
	
	
	public Turnera(){
		this.ultimoNumeroOtorgado = 0;
	};
	
	public void otorgarProximoNumero() {
		this.ultimoNumeroOtorgado ++;
	};
	
	public int obtenerUltimoNumeroOtorgado() {
		return ultimoNumeroOtorgado;
	};
	
	public void resetearContador() {
		this.ultimoNumeroOtorgado = 0;
	};
	
	public void resetearContador(int nuevoValor) {
		if (nuevoValor >= 0) {
			this.ultimoNumeroOtorgado = nuevoValor;
		}
	};
	
}
