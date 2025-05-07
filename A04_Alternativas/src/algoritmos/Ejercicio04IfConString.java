package algoritmos;

public class Ejercicio04IfConString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//TRABAJAREMOS DISTINTAS OPCIONES DE UN ALGORITMO DECLARADO CON STRING
		
		String opcion = "editar"; //editar, ver, alta
		
		/*
		if (opcion == "editar")
			System.out.println("Han tecleado la tecla editar");
		
		else
			if (opcion == "ver")
				System.out.println("Han tecleado la opcion ver");
			else
				System.out.println("Han tecleado la opción alta");
		*/
		
		if (opcion.equals("editar"))
			System.out.println("Han tecleado la tecla editar");
		
		else
			if (opcion.equals("ver"))
				System.out.println("Han tecleado la opcion ver");
			else
				System.out.println("Han tecleado la opción alta");
		
		String opcion2 = new String ("editar");
		
		if (opcion == opcion2)
			System.out.println("los dos tienen editar");
		else
			System.out.println("contienen cadenas de caracteres distintas");
		
		if (opcion.equals(opcion2))
			System.out.println("LOS DOS SON IGUALES");
		else
			System.out.println("SON DISTINTOS");
		//Han tecleado la tecla editar
		//contienen cadenas de caracteres distintas
		//LOS DOS SON IGUALES
		//FIN DE PROGRAMA

		
		System.out.println("FIN DE PROGRAMA");
		
		//SOLUCION SIN EQUALS
		//Han tecleado la tecla editar
		//contienen cadenas de caracteres distintas
		//FIN DE PROGRAMA
		
		
		
	}

}
