package algoritmos;

public class Ejercicio04ComparacionDeDosNumeros {

	public static void main(String[] args) {
		// leer dos numeros y decir cual es mayor, menor o igual
		
		
		
		//SIN LLAVES
		
		
		int numero1=5, numero2=3;
		
		if (numero1>numero2)
			System.out.println("Numero 1 es mayor que numero 2");
		
			
			else
				if (numero1<numero2)
					
					System.out.println("Numero 1 es menor que numero 2");
				else
					System.out.println("Son iguales");
		
		
		//CON LLAVES
		
		
		
		if (numero1>numero2){
			System.out.println("Numero 1 es mayor que numero 2");
		
		}
			else
				if (numero1<numero2) {
					
					System.out.println("Numero 1 es menor que numero 2"); 
					}
				else {
					System.out.println("Son iguales");
				}
		
					
		
		

	}

}
