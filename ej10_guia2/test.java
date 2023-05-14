package ej10_guia2;

public class test {

	public static void main(String[] args) {
		
		Robot boti = new Robot("Boti");
		
		Persona Juan = new Persona("Juan");
		Persona Ailen = new Persona("Ailen");
		
		boti.saludar();
		boti.saludar(Ailen);

	}

}
