package algoritmos;

public class Ejercicio05StringIgualComparar {

	public static void main(String[] args) {
		String cad1= "Tomas", cad2="tomas";
	if 	(cad1.equals(cad2))
		System.out.println("iguales");
	else
		System.out.println("diferentes");
	
	//diferentes
	
	if 	(cad1.equalsIgnoreCase(cad2))
		System.out.println("iguales");
	else
		System.out.println("diferentes");
	
	//iguales
	
	System.out.println(cad1.compareTo(cad2));
	//-32 (posicion segun tabla ascii resta las posiciones de T y t)
	System.out.println(cad1.compareToIgnoreCase(cad2));
	//0 (letras iguales ignorando mayusculas)
	

	}

}
