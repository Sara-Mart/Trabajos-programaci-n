package ejecutables;

public class Ejercicio03OpAritmetricos {

	public static void main(String[] args) {
		int a=4,b=5, resultado=0;
		
		//a++;
		//b--;
		
		//++a;
		//--b;
		
		resultado= a++;
		
		System.out.println("resultado: " + resultado);
		System.out.println("la variable a: " + a);
		
		resultado=++b;
		System.out.println("resultado: " + resultado);

		System.out.println("la variable b: " + b);
		
		
		//resultado: 4
		//la variable a: 5
		//resultado: 6
		//la variable b: 6
		
		//si la variable tiene ++ delante= incrementa
		//si la variable tiene ++ detras primero parte de variable y la siguiente incrementa
		
		
		//
		
		b=2;
		a=2;
		resultado = ++b + a++;
		
				
		System.out.println(resultado);
		System.out.println("la variable a: " + a);
		System.out.println("la variable b: " + b);

		//5
		//primero incrementa b y le suma a
		//la variable a: 3
		//la variable b: 3
		//despues incrementaa por eso es 3
		
		
		//
		
		
		b=2;
		a=2;
		resultado = ++b + ++a;
		System.out.println(resultado);
		System.out.println("la variable a: " + a);
		System.out.println("la variable b: " + b);

		//6
		//la variable a: 3
		//la variable b: 3
		//incrementa las dos
		
		
		
		
		
		
		
		

		
		
		
		
		

	}

}
