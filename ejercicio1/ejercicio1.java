package ejercicio1;

import java.util.Scanner;

import javax.print.DocFlavor.INPUT_STREAM;

public class ejercicio1 {
	
	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String nombre, apellido;
		
		System.out.println("Ingrese un nombre");
		nombre = input.nextLine().toLowerCase();
		
		
		
		while(!(nombre.equals("basta"))) {
			System.out.println("Ingrese apellido");
			apellido = input.nextLine().toLowerCase();
			
			System.out.println("Hola" + " " + nombre + " " + apellido);
			
			System.out.println("Ingrese un nombre");
			nombre = input.nextLine().toLowerCase();
	
		}
		System.out.println("Finalizo programa");	
	}

}

