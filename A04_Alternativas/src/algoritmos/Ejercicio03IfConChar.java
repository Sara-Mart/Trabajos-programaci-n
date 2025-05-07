package algoritmos;

public class Ejercicio03IfConChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//No sabemos leer=asignamos un valor a genero con char
		// una variable en un momento determinado solo puede tener un valor
		// and && or ||
		char genero = 'H';
		
		if (genero == 'H' || genero =='h')
			System.out.println("Eres un hombre");
		//PARA AÑADIR OTRA SENTENCIA NECESITAMOS {} EN IF
		else
			if (genero == 'M'||genero=='m')
				System.out.println("Eres una mujer");
			else
				System.out.println("Genero incorrecto");

	}

}
