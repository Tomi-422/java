package ej11_guia2;

public class test {
	

	public static void main(String[] args) {
		
		Turnera t1 = new Turnera();
				
		t1.otorgarProximoNumero();
		
		
		
		System.out.println(t1.obtenerUltimoNumeroOtorgado());
		
		t1.resetearContador();
		
		System.out.println(t1.obtenerUltimoNumeroOtorgado());
	}

}
           