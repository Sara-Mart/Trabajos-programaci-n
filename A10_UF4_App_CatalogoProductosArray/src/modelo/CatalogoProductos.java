package modelo;

import javabean.Producto;
public class CatalogoProductos {
	
	private Producto [] lista;
	private static int cuantosVan =0;
	
	public CatalogoProductos() {
		lista = new Producto[10];
		
		//cuantosVan=0;
		
	}
	
	public CatalogoProductos(int cuantos) {
		lista = new Producto[cuantos];
		
		//cuantosVan=0;
		
	}
	
	// METODOS QUE ME HACEN FALTA
	/*
	public void setProductos(Producto [] productos) {
		this.lista=productos;
		
	}
	*/
	public int size() {
		return cuantosVan;
	}
	
	public boolean add (Producto producto) {
		if (producto==null)
			return false;
		if(cuantosVan>=lista.length)
			return false;
		
		lista[cuantosVan]= producto;
		cuantosVan++;
		return true;}
		//devuelve la posicion del objeto que contiene
		//lo mismo que el que me pasas por parametro
		//sino existe devuelvo -1
	public int indexOf(Producto producto) {
		
		for (int i =0; i<cuantosVan; i ++) {
			if (lista[i].equals(producto))
				return i;
			}
		return -1;
		
	}
	
	public boolean contains (Producto producto){
		
		if (producto ==null)
			return false;
		if (indexOf(producto)== -1)
			return false;
		else
			return true;
			
	}
	
	public Producto get(int posicion) {
	if (posicion<0 || posicion >= cuantosVan)
		return null;
	return lista[posicion];
	}
	
	public boolean set(int posicion, Producto producto) {
		if (posicion<0 || posicion >= cuantosVan)
			return false;
		if (producto==null)
			return false;
		lista[posicion]=producto;
		return true;
		}
	
	
	public Producto [] buscarTodos() {
		if (size()==0)
			return null;
		Producto[]aux = new Producto[cuantosVan];
		for (int i= 0; i< cuantosVan; i++) {
			aux [i] = lista[i];
			}
		return aux;
	}
	
	public Producto[] buscarPorStockMayor(int cantidad) {
		int posicion=0;
		Producto[] aux = new Producto[cuantosVan];
		for (int i=0; i<cuantosVan; i++) {
			if (lista[i].getCantidadStock( )> cantidad) {
				aux[posicion]= lista [i];
				posicion++;
				
			}
				
		}
		
		Producto[] listaDefinitiva = new Producto [posicion];
		
		for (int i=0; i<posicion; i++) {
			listaDefinitiva[i]= aux[i];
		}
		
		return listaDefinitiva;
		
	}
	
	
	
}
