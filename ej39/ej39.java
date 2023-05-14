package ej39;

import java.util.Scanner;

public class ej39 {
	
	static Scanner input;
	
	static final int CANT_TIROS = 3;
	static final int PUNTOS_DIST_CERO = 500;
	static final int PUNTOS_DIST_UNO = 250;
	static final int PUNTOS_DIST_DOS = 100;
	static final double DIST_CERO = 0;
	static final double DIST_UNO = 10;
	static final double DIST_DOS = 50;
	static final int CANT_MIN_PART = 2;
	
	public static void main(String[] args) {
		
		int cantParticipantes, puntos, acumPuntos = 0, cantTirosCentro = 0;
		double distancia, puntajeGanador = Integer.MIN_VALUE; 
		String nombre, nombreGanador = " ";
		input = new Scanner(System.in);
		
		cantParticipantes = validarCantParticipantes();
		
		for (int i = 0; i < cantParticipantes; i++) {
			nombre = ingresarNombre();
			for (int j = 0; j < CANT_TIROS; j++) {
				distancia = validarDistancia();
				
				if (distancia == DIST_CERO) {
					puntos = PUNTOS_DIST_CERO;
					cantTirosCentro ++;
				} else if (distancia <= DIST_UNO ){
					puntos = PUNTOS_DIST_UNO;
				} else if(distancia <= DIST_DOS) {
					puntos = PUNTOS_DIST_DOS;
				} else {
					System.out.println("Cayo fuera del tablero");
					puntos = 0;
				}
				
				acumPuntos += puntos;
			}
			if (acumPuntos > puntajeGanador ) {
				puntajeGanador = acumPuntos;
				nombreGanador = nombre;
			}
			acumPuntos = 0;
		}
		
		System.out.println("El ganador es " + nombreGanador + " y su puntaje es " +  puntajeGanador );
		System.out.println("La cantidad de tiros al centro es " + cantTirosCentro);
		
		input.close();
	}
	private static double validarDistancia() {
		double distancia;
		distancia = ingresarDistancia();
		 while (distancia < DIST_CERO) {
			 System.out.println("La distancia no puede ser menor que 0");
			 distancia = ingresarDistancia(); 
		 }
		return distancia;
	}
	private static double ingresarDistancia() {
		System.out.print("Ingresar distancia: ");
		return Double.parseDouble(input.nextLine());
	}
	
	
	private static String ingresarNombre() {
		System.out.print("Ingresar nombre: ");
		return input.nextLine();
	}
	
	private static int validarCantParticipantes() {
		int cantParticipantes;
		cantParticipantes = ingresarCantParticipantes();
		while (cantParticipantes < CANT_MIN_PART) {
			System.out.println("La cantidad de participantes debe ser mayor o igual que 2 \n");
			cantParticipantes = ingresarCantParticipantes();
		}
		return cantParticipantes;
	}
	
	private static int ingresarCantParticipantes() {
		System.out.print("Ingresar cantidad de participantes: ");
		return Integer.parseInt(input.nextLine());
	}	
}