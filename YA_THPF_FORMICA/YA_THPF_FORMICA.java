package YA_THPF_FORMICA;

import java.util.Scanner;

public class YA_THPF_FORMICA {
	
	static	Scanner input = new Scanner(System.in);
	
	static final int FECHA_MIN = 19010101;

	public static void main(String[] args) {
		
		int fechaIng = 0;
		int fechaAnt = 0;
		int fechaMaxAmpTerm = 0;
		double tempMax = 0;
		double tempMin = 0;
		double auxTempMin = 0;
		double ampTerm = 0;
		double maxAmpTerm = 0;
		boolean auxMaxAmpTerm = false;
		
		
		
		do {
			System.out.print("Ingresar fecha \n");
			fechaIng = input.nextInt();
			if(fechaIng >= fechaAnt && fechaIng > FECHA_MIN) {
				fechaAnt = fechaIng;
			}else {
				System.out.print("Fecha invalida" + "\n");
				do {
					System.out.print("Ingresar fecha" + "\n");
					fechaIng = input.nextInt();
				}
				while(fechaIng > fechaAnt && fechaIng < FECHA_MIN);
				fechaAnt = fechaIng;
			}
			
			System.out.print("Ingresar temperatura maxima \n");
			tempMax = input.nextDouble();
			System.out.print("Ingresar temperatura minima \n");
			tempMin = input.nextDouble();
			
			if(tempMin < tempMax) {
				System.out.print("La fecha de hoy es " + fechaIng + "\n");
				System.out.print("La temperatura maxima fue: " + tempMax + "\n");
				System.out.print("La temperatura minima fue: " + tempMin + "\n");
				ampTerm = tempMax - tempMin;
			}else {
				auxTempMin = tempMin;
				tempMin = tempMax;
				tempMax = auxTempMin;
				ampTerm = tempMax - tempMin;
				System.out.print("La fecha de hoy es " + fechaIng + "\n");
				System.out.print("La temperatura maxima fue: " + tempMax + "\n");
				System.out.print("La temperatura minima fue: " + tempMin + "\n");
			}
			
			System.out.print("La amplitud termica de hoy fue " + ampTerm + "\n");
			
			if(ampTerm > maxAmpTerm && (ampTerm != 0)) {
				maxAmpTerm = ampTerm;
				fechaMaxAmpTerm = fechaIng;
				auxMaxAmpTerm = true;
			} else {
				auxMaxAmpTerm = false;
			}
			
			
			System.out.print("Ingresar fecha \n");
			fechaIng = input.nextInt();
			
			
		}while (fechaIng != -1); 
		
		if(auxMaxAmpTerm == true) {
			System.out.print("La maxima amplitud termica fue " + maxAmpTerm + " " + "En la fecha " + fechaMaxAmpTerm);
		} else {
			System.out.print("No hubo datos para procesar");
		}
		
	}
	

}
