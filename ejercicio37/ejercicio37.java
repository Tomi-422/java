package ejercicio37;

import java.util.Scanner;

public class ejercicio37 {
	static	Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		final int INGRESO_MAX=12;
		double sueldo, montoTotal=0;
		int cantidad=0;
		System.out.println("Ingrese un sueldo");
		sueldo = input.nextInt();
		while (cantidad<INGRESO_MAX && sueldo >0){
		
			System.out.println("Ingrese un sueldo");
			sueldo = input.nextInt();
			cantidad++;
			montoTotal+=sueldo;
		}
		System.out.println("Monto percibido hasta el momento " + montoTotal);
	}

}
