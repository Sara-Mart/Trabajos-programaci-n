package testing;

public class Ejercicio01MetodosDeString {

	public static void main(String[] args) {
		
		
		String saludo = "Hola soy sara";
		String nombre = "andres";
		
		String nombre2 = new String("andres");
		
		System.out.println(saludo.length());
		System.out.println(saludo.charAt(0));
		System.out.println(saludo.toUpperCase());
		System.out.println(saludo.toLowerCase());
		
		if ( nombre == nombre2)   //apunta a andres distintos
			System.out.println("Son iguales");
		else
			System.out.println("Distintos");
		
		if (nombre.equals(nombre2))  // por equals si son iguales. Equals es la unica forma de garantizar que son iguales
			System.out.println("iguales por equals");
		else
			System.out.println("distintos por equals");
		
		//contiene, comienza y termina--- devuelve: true o false
		System.out.println("BUSQUEDAS POR CONTIENE");
		System.out.println(saludo.contains("soy"));
		System.out.println(saludo.startsWith("Hola"));
		System.out.println(saludo.endsWith("sara"));
		System.out.println(saludo.startsWith("hola")); // H en minusculas
		
		System.out.println(saludo.toUpperCase().startsWith("HOLA"));//engañamos combinando opciones
		
		System.out.println("LOCALIZAR CADENA POR POSICIONES");
		System.out.println(saludo.indexOf("sara"));
		/*
		 * espacios en blanco
		 * num
		 * letras may
		 * letras min
		 */
		System.out.println(nombre.compareTo("Andres")); 
		/*
		 * 0= son iguales
		 * positivo:esta por encima de la lista anterior
		 * negativo:esta por debajo
		 */
		
		System.out.println(nombre.compareToIgnoreCase("AnDreS"));
		
		String [] palabras = saludo.split(" ");
		for (String palabra: palabras)
			System.out.println(palabra);
		
		String numero = String.valueOf(12);
			
	}

}
