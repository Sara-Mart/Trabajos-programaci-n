package testin;
import modelo.CatalogoProductos;
import javabean.Producto;
public class TestCatalogo {

	public static void main(String[] args) {
		CatalogoProductos ofertas= new CatalogoProductos();
		
		Producto prueba = new Producto (1001,"Falda", 123, 30,"XS","Blanco");
		
		System.out.println(ofertas.size());
		
		ofertas.add(new Producto(1001,"Camisa", 123, 30,"XS","Blanco"));
		ofertas.add(new Producto(1002,"Pantalon", 123, 30,"XL","Negro"));
		
		for (Producto ele: ofertas.buscarTodos())
			System.out.println(ele);
		
		Producto prod3 = ofertas.get(1);
		prod3.setTalla("XXL");
		prod3.setColor("Verde");
		
		ofertas.set(1, prod3);
		
		for (Producto ele: ofertas.buscarTodos())
			System.out.println(ele);
		
		System.out.println(ofertas.indexOf(prueba));
		
		
		
	}

}
