package algoritmos;

public class Ejercicio09AclaracionString {

	public static void main(String[] args) {
/*
 * PRIMERA CONSIDERACIÓN
 * dos tipos de variables por su contenido en java
 * 
 * - las que contienen el valor asignado: 8 tipos primitivos
 * - las variables de tipo clase: contienen una referencia al contenido del objeto, por lo tanto tienen una dirección de memoria
 * 
 */
/*
 * SEGUNDA CONSIDERACIÓN
 * Para crear un objeto de una clase se hace asi:
 * Scanner leer=new Scanner(System.in); //CONTRUIR UN OBJETO
 * 
 * String, para construir un objeto de la clase String, no se hace como el resto:
 * String nombre = "eva";// propia de String, y de alguna clase más (clases envolventes)

 */
/*
 * TERCERA CONSIDERACIÓN
 * Los operadores de relación == != < > <= >=, en java siempre comparan contenido de las variables
 * - Variables valor primitivo, comparamos valores reales
 * Variables de tipo clase, como su contenido es una dirección de memoria, estamos comparando si dos objetos apuntan al mismo string
 * 
 * ----> usar un metodo de objetos de String llamado equals.
 * 
 */
		String cad1= "andres", cad2="andres"; //=null si no tengo nada
		
		if (cad1.equals(cad2))
			System.out.println("Son iguales");
		else
			System.out.println("Son distintos");
		
		//Son iguales
		
	}

}
