package algoritmos;

public class Ejercicio01 {

	public static void main(String[] args) {
		//Leemos un numero entero que representa el radio de una circunferencia, y calculamos
		//a. La circunferencia(2*PI*r)
		//b. El área del circulo (PI * r2)
		
		double radio = 4, circunferencia=0, areaCirculo=0;
		
		circunferencia= 2 * Math.PI * radio;
		System.out.println("La circumferencia es " + circunferencia);
		
		areaCirculo= Math.PI * Math.pow(radio, 2);
		
		System.out.println("El area es "+ areaCirculo);
		
		//La circumferencia es 25.132741228718345
		//El area es 50.26548245743669
		
		
		

	}

}
