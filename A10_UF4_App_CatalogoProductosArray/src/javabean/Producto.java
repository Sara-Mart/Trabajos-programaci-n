package javabean;

public class Producto {

	private long codigoBarras;
	private String descripcion;
	private double precioUnitario;
	private int cantidadStock;
	private String talla;
	private String color;
	
	public Producto(long codigoBarras, String descripcion, double precioUnitario, int cantidadStock, String talla,
			String color) {
		super();
		this.codigoBarras = codigoBarras;
		this.descripcion = descripcion;
		this.precioUnitario = precioUnitario;
		this.cantidadStock = cantidadStock;
		this.talla = talla;
		this.color = color;
	}

	public Producto() {
		super();
	}

	public long getCodigoBarras() {
		return codigoBarras;
	}

	public void setCodigoBarras(long codigoBarras) {
		this.codigoBarras = codigoBarras;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public double getPrecioUnitario() {
		return precioUnitario;
	}

	public void setPrecioUnitario(double precioUnitario) {
		this.precioUnitario = precioUnitario;
	}

	public int getCantidadStock() {
		return cantidadStock;
	}

	public void setCantidadStock(int cantidadStock) {
		this.cantidadStock = cantidadStock;
	}

	public String getTalla() {
		return talla;
	}

	public void setTalla(String talla) {
		this.talla = talla;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "Producto [codigoBarras=" + codigoBarras + ", descripcion=" + descripcion + ", precioUnitario="
				+ precioUnitario + ", cantidadStock=" + cantidadStock + ", talla=" + talla + ", color=" + color + "]";
	}
	
	public double precioConIva(int iva) {
		return precioUnitario * (1+(double)iva/100.0);
		
	}
	public void aumentarStock(int cantidad) {
		cantidadStock+=cantidad;
		
	}
	public boolean disminuirStock(int cantidad) {
		if (cantidad>=cantidadStock)
			return false;
		else {
			cantidadStock -= cantidad;
			return true;
		}

		
	}
	public double precioAplicado() {
		switch(this.talla) {
		case "XS": return precioUnitario;
		case "S", "M": return precioUnitario * 1.03;
		case "L", "XL": return precioUnitario * 1.04;
		case "XXL", "XXXL": return precioUnitario * 1.05;
		default:
			return precioUnitario;
		}
		
	}
	
	@Override
	public boolean equals (Object obj) {
		if (this == obj)
			
			return true;
		if (obj==null)
			return false;
		if (!(obj instanceof Producto))
			return false;
		
		Producto otro = (Producto)obj;
		
		if (this.codigoBarras != otro.codigoBarras)
				//&& this.descripcion.equals(otro.descripcion)
			return false;
		return false;
			
			}
	/*
	 * 
	 
	@Override
	public boolean equals (Object obj) {
		if (this == obj)
			
			return true;
		if (obj==null)
			return false;
		if (!(obj instanceof Producto))
			return false;
		
		Producto otro = (Producto)obj;
		
		if (this.codigoBarras == otro.codigoBarras 
				//&& this.descripcion.equals(otro.descripcion)
				)
		return true;
		else
			return false;
			
			}
			*/
	
		
		
	
	
	
}
