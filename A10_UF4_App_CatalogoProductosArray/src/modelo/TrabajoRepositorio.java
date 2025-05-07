package modelo;
import javabean.Trabajo;
import java.util.ArrayList;
public class TrabajoRepositorio {

	private ArrayList <Trabajo> lista;
	
	public TrabajoRepositorio() {
		lista = new ArrayList<Trabajo>();
		
		cargarDatos();
		
	}

	private void cargarDatos() {
		lista.add(new Trabajo ("ST_MAN", "Vendedor manager", 30000, 80000));
		lista.add(new Trabajo ("ST_PRU", "Vendedor manager", 30000, 80000));
		lista.add(new Trabajo ("IT_PROG", "Programador", 30000, 80000));
		lista.add(new Trabajo ("AD_PRESS", "Presidente", 30000, 80000));
	}
	
	public ArrayList<Trabajo> buscarTodos(){
		return lista;
		
	}
	
	public boolean addTrabajo(Trabajo trabajo) {
		if (lista.contains(trabajo))
			return false;
		return lista.add(trabajo);
	}
	
	
	
	
	
	
	
	
}
