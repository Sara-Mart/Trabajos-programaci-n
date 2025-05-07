package algoritmosArraysUnidimensionales;

public class Ejercicio01 {

	public static void main(String[] args) {
		int[] numeros = {2,3,4,6,7,89,123};
		numeros [6]=45;
		for(int i=0; i < numeros.length; i++)
		System.out.println("en posición: " + i + " esta el numero: "+ numeros[i]);
		
		//en posición: 0 esta el numero: 2
		//en posición: 1 esta el numero: 3
		//en posición: 2 esta el numero: 4
		//en posición: 3 esta el numero: 6
		//en posición: 4 esta el numero: 7
		//en posición: 5 esta el numero: 89
		//en posición: 6 esta el numero: 45
		
		
		//necesita que todos los elementos del array tengan contenido
		//array lleno
		for (int numero: numeros )
			System.out.println("El numero contiene: " + numero);
		//El numero contiene: 2
		//El numero contiene: 3
		//El numero contiene: 4
		//El numero contiene: 6
		//El numero contiene: 7
		//El numero contiene: 89
		//El numero contiene: 45
	}

}
