package algoritmos;

public class Ejercicio06AlternativaMultipleSwitch {

	public static void main(String[] args) {
		/*
		 * cuando una variable de tipo entero, char o string
		 * tiene una serie de valores especificos (==)
		 * con distinto tratamiento usaremos la alterativ de segun ___ switch
		 * 
		*/

		int diaDeLaSemana = 1;
		
		
		switch(diaDeLaSemana){
		case 1:
			System.out.println("Es lunes");
			break;
		case 2:
			System.out.println("Es martes");
		case 3:
			System.out.println("Es miercoles");
		case 4:
			System.out.println("Es jueves");
		case 5:
			System.out.println("Es viernes");
		default:
			System.out.println("fin de semana");
			
		
		}
		
		System.out.println("FIN DE PROGRAMA");
		
		//Es lunes
		//Es martes
		//Es miercoles
		//Es jueves
		//Es viernes
		//fin de semana
		//FIN DE PROGRAMA
		//SIN BREAK
		
		//CON BREAK
		
		//Es lunes
		//FIN DE PROGRAMA
		
		
		
	}

}
