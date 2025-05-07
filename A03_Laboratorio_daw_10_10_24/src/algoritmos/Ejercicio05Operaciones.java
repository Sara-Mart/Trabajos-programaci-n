package algoritmos;

public class Ejercicio05Operaciones {

	public static void main(String[] args) {
		// Leemos por consola dos números enteros y calculamos y mostramos por la consola:
		//a. La suma
		//b. La resta
		//c. El producto
		//d. La división
		//e. El resto de su división
		
		int num1=3, num2=2, suma=0, resta=0, producto=0;
		double division=0, residuo=0;
		
		
		suma= num1+num2;
		resta=num1 - num2;
		producto= num1*num2;
		division= num1/num2;
		residuo=num1%num2;
		
		
		
		System.out.println("La suma de los dos numeros es " + suma);
		System.out.println("La resta de los dos numeros es " + resta);
		System.out.println("El producto de los dos numeros es " + producto);
		System.out.println("La división de los dos numeros es " + division);
		System.out.println("El coeficiente de los dos numeros es " + residuo);

	}

}
