package ejClase;
import java.util.Scanner;

public class ejClase {

	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	int numero;
	
	int numMay = Integer.MIN_VALUE;
	int numMen = Integer.MAX_VALUE;
	
	for(int i = 0 ; i<10; i++) {
		System.out.println("ingrese un numero");
		numero = Integer.parseInt(sc.nextLine());
		
		if(numero >= numMay  ) {
			numMay = numero;
		}else if (numero <= numMen) {
			numMen = numero;
		}
	}
	
	System.out.println("El numero mayor es;"+ " " + numMay );
	System.out.println("El numero menor es;"+ " " + numMen );	
	}
}
