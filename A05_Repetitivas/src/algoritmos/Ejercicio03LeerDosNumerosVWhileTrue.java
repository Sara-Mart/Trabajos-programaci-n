package algoritmos;

import java.util.Scanner;

public class Ejercicio03LeerDosNumerosVWhileTrue {

	public static void main(String[] args) {
		// Leer consecutivamente dos números cada vez, hasta que los dos sean -1. 
		//Comparar los dos números leídos e informar cada vez si son iguales, mayor o menor (el primero respecto al segundo). 
		//Al final del proceso informar cuantas veces los números eran iguales, 
		//cuantas veces el primero era mayor del segundo y cuantas veces el primero era menor del segundo número leído.

		Scanner leer = new Scanner(System.in);
		
		int num1=0,num2=0, contIguales=0, contMenores=0, contMayores=0;
		
		
		
		while (true) {
			
			System.out.println("Dame dos numeros enteros, -1 en ambos para terminar");
			
			num1= leer.nextInt();
			num2= leer.nextInt();
			if (num1 == -1 && num2==-1)
				break;
			
			
			//Comparar datos
			
			if (num1<num2)
				contMenores++;
			else
				if (num1>num2)
					contMayores++;
				else
					contIguales++;
					
	
			
		}
		
			
		
		
		System.out.println("ESTADISTICAS");
		System.out.println("Numeros mayores: " + contMayores);
		System.out.println("Numero menores: " + contMenores);
		System.out.println("Numero de iguales: " + contIguales);
		
		leer.close();
		
		
		
		
	}

}
