package algoritmos;

public class Ejercicio01AlternativasIf {

	public static void main(String[] args) {
		int edad=18;
		
		//solo if una sola sentencia
		
		if (edad>=18)
			System.out.println("Eres mayor de edad");
			System.out.println("FIN DE PROGRAMA");
			
			//solo if más de una sentencia
			
		if (edad>=18){
			System.out.println("Eres MAYOR de edad");
			System.out.println("y eres adulto");
		}
			
			System.out.println("FIN DE PROGRAMA");
			
		//rama if y rama else solo una sentencia
			
		if (edad >=18)
			System.out.println("Eres MUY mayor");
			
		
		else
			
			System.out.println("Eres MUY pequeño");
		
		System.out.println("FIN DE PROGRAMA");
		
		//rama if y rama else mas de una sentencia

		
		if (edad >=18) {
			System.out.println("Eres MUY mayor");
			System.out.println("Y eres senior");

			
		}
		else {
			
			System.out.println("Eres MUY pequeño");
			System.out.println("Eres CHIQUITIN"); }
		
		System.out.println("FIN DE PROGRAMA");
		
		
		if (edad>=18) {
			System.out.println("porras");
			edad++;
			
		}else {
			System.out.println("rama else");
			edad*=7;
			
			
		}

		
		
		


	}

}
