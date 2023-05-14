package Ej29;

import java.util.Scanner;

public class Ej29 {

	static Scanner sc = new Scanner(System.in);
			
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double promedio;
		int edad, suma = 0, cantImpMay = 0;
		final int MAYOR_EDAD = 18;
		final int CANT_EDADES = 5;
		double restoDiv2;
		
		for(int i = 0; i < CANT_EDADES;i++) {
			System.out.println("ingrese su edad");
			edad = Integer.parseInt(sc.nextLine());
			suma = suma + edad;
			restoDiv2 = edad % 2;
			if(restoDiv2 != 0 && edad > MAYOR_EDAD) {
				cantImpMay ++;
			}
		}
		
		
		
	}

}


