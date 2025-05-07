package ejecutables;

public class Ejercicio04TiposMetodos {

	public static void main(String[] args) {
		// acceso a metodos staticos
		
		System.out.println(Math.sqrt(16));
		
		//4
		
		//String dato = 12.4;
		String dato = String.valueOf(12.4);
		System.out.println(dato);
		//12.4
		
		
		//Metodos de objeto/instancia
		
		
		String nombre = "andres";
		System.out.println(nombre.charAt(0));
		System.out.println(nombre.charAt(1));
		System.out.println(nombre.charAt(2));
		System.out.println(nombre.charAt(3));
		System.out.println(nombre.charAt(4));
		System.out.println(nombre.charAt(5));
		
		
		
		// a      n    d    r    e     s
		
		
		System.out.println(nombre.toUpperCase());
		
		//ANDRES
		
	}

}
