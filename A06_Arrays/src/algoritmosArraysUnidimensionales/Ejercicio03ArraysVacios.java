package algoritmosArraysUnidimensionales;

public class Ejercicio03ArraysVacios {

	public static void main(String[] args) {
		// enteros asigna 0
		// double asigna 0.0
		//char asigna /0
		//boolean asigna false
		//clase asigan null
		int [] enteros= new int [4];
		double[] reales= new double[4];
		char[] letras= new char[4];
		boolean[] logicos = new boolean[4];
		String[] palabras= new String[4];
		System.out.println("ENTEROS");
		for(int ele:enteros) {
			System.out.println(ele);
		}
		System.out.println("REALES");
		for(double ele:reales) {
			System.out.println(ele);
		}
		System.out.println("DOUBLE");
		for(char ele:letras) {
			System.out.println(ele);
		}
		System.out.println("BOOLEAN");
		for(boolean ele:logicos) {
			System.out.println(ele);
		}
		System.out.println("STRING");
		for(String ele:palabras) {
			System.out.println(ele);
		}
		/*
		 * ENTEROS
			0
			0
			0
			0
			REALES
			0.0
			0.0
			0.0
			0.0
			DOUBLE
 
 
 
 
			BOOLEAN
			false
			false
			false
			false
			STRING
			null
			null
			null
			null

		 */





	}

}
