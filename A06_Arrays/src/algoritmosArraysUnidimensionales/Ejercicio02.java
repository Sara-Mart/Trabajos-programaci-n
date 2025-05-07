package algoritmosArraysUnidimensionales;

public class Ejercicio02 {

	public static void main(String[] args) {
		// Arrays llenos
		//int numero=2;
		
		int [] numeros = {1,5,9,11,34,46};
		
		for(int numero:numeros) {
		
		if(numero%2==0)
			System.out.println(numero + " Numero par");
		else
			System.out.println(numero + " Numero impar");
		//1 Numero impar
		//5 Numero impar
		//9 Numero impar
		//11 Numero impar
		//34 Numero par
		//46 Numero par
		}
		
		
		int [] pares= {2,4,6,12};
		
		numeros=pares;
		
		for(int numero:numeros) {
			
			if(numero%2==0)
				System.out.println(numero + " Numero par en segundo for");
			else
				System.out.println(numero + " Numero imparen segundo for");
			//2 Numero par en segundo for
			//4 Numero par en segundo for
			//6 Numero par en segundo for
			//12 Numero par en segundo for

		}
		
		String[] nombres={"carlos", "eva", "sara"};
		
		for (String nombre:nombres) {
			System.out.println(nombre.toUpperCase());
			
			//CARLOS
			//EVA
			//SARA
			System.out.println(nombres[0]);
			//carlos
			
		}
	}
}

