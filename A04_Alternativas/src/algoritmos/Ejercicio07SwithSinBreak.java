package algoritmos;

public class Ejercicio07SwithSinBreak {

	public static void main(String[] args) {
		/*
		 * Que meses son de 30  dias
		 * Que meses son de 31
		 * que meses son de 28/29
		 */
		int mes=5;
		
		switch (mes) {
		case 1:

		case 3:

			System.out.println("Empieza la primavera");

		case 5:
		case 7:
		case 8:
		case 10:
		case 12:

			System.out.println("Es de 31 dias");
			break;

		case 4:
		case 6:
		case 9:
		case 11:
			System.out.println("Es de 30 dias");
			break;
		case 2:
			System.out.println("Es de 28/19 dias");
			break;

		default:
			System.out.println("mes incorrecto");

		}

	}
	
	
	//mes = 3
	//Es de 31 dias
	//Empieza la primavera
	//mes= 5
	//Es de 31 dias
	

}
