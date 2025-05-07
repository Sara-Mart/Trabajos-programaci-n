package algoritmos;

public class Ejercicio01BuclesEnGeneral {

	public static void main(String[] args) {
		/*
		 * En JAVA hay tres tipos de bucles, todos mientras que:
		 * 1. NO SE NUMERO DE VECES QUE TENGO ITERAR
		 * -Bucle de 0 a n: primero pregunta y sino se cumple se va
		 * 		while (condicion){
		 * 	}
		 * 	final del bucle
		 * -Bucle de 1 a n:primero entra y al final pregunta
		 * 	do{
		 * 	i1;
		 * 	i2;
		 * 	} while(condicion);
		 * 
		 * 2. CONOZCO LAS VECES QUE LO VOY A ITERAR
		 * 	- for: 2 maneras distintas
		 * 		- for original, que itera numeros enteros
		 * 		- for para arrays y colecciones
		 * 
		 */
		
		int numero=1;
		while (numero <=10) {
			System.out.println("el numero es:" + numero);
			numero ++;
			
		}
System.out.println("FIN DE PROGRAMA");

	
	
	//el numero es:1
	//el numero es:2
	//el numero es:3
	//el numero es:4
	//el numero es:5
	//el numero es:6
	//el numero es:7
	//el numero es:8
	//el numero es:9
	//el numero es:10
	//FIN DE PROGRAMA
numero=1;
do {
	System.out.println("El numero con do while es: " + numero);
	numero++;
	
	
}while(numero<=10);
//El numero con do while es: 1
	//El numero con do while es: 2
	//El numero con do while es: 3
	//El numero con do while es: 4
	//El numero con do while es: 5
	//El numero con do while es: 6
	//El numero con do while es: 7
	//El numero con do while es: 8
	//El numero con do while es: 9
	//El numero con do while es: 10
for(int i=1; i<=10; i++) {
	System.out.println("El numero con for es " + i);
}
//El numero con for es 1
//El numero con for es 2
//El numero con for es 3
//El numero con for es 4
//El numero con for es 5
//El numero con for es 6
//El numero con for es 7
//El numero con for es 8
//El numero con for es 9
//El numero con for es 10
for(int i=4; i>=1; i--) {
	System.out.println("El numero con for es " + i);
}
//El numero con for es 4
//El numero con for es 3
//El numero con for es 2
//El numero con for es 1

	}
	
}
