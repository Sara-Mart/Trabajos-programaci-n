package javabean;

import java.util.ArrayList;
import java.util.Objects;

public class Region {
	
	private int regionId;
	private String regionName;
	
	private ArrayList<Country> countries;
	
	public Region(int regionId, String regionName) {
		super();
		this.regionId = regionId;
		this.regionName = regionName;
	}
	
	// CREAMOS UN CONSTRUCTOR CON TODO NUEVO, RESPETANDO EL ANTERIOR PORQUE SINO DA ERROR
	
	public Region(int regionId, String regionName, ArrayList<Country> countries) {
		super();
		this.regionId = regionId;
		this.regionName = regionName;
		this.countries = countries;
	}

//AÑADIMOS GET AND SET SOLO ARRAY
	public ArrayList<Country> getCountries() {
		return countries;
	}


	public void setCountries(ArrayList<Country> countries) {
		this.countries = countries;
	}


	public Region() {
		super();
	}
	public int getRegionId() {
		return regionId;
	}
	public void setRegionId(int regionId) {
		this.regionId = regionId;
	}
	public String getRegionName() {
		return regionName;
	}
	public void setRegionName(String regionName) {
		this.regionName = regionName;
	}
	
	//Source equals y hascode con todo
	
	@Override
	public int hashCode() {
		return Objects.hash(regionId);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Region other = (Region) obj;
		return regionId == other.regionId;
	}

	//CREAMOS UN NUEVO TOSTRING
	@Override
	public String toString() {
		return "Region [regionId=" + regionId + ", regionName=" + regionName + ", countries=" + countries + "]";
	}
	//AÑADIMOS METODOS PROPIOS NUEVOS
	
	public boolean addCountry(Country country) {
		
		if (countries==null)
			countries = new ArrayList<Country>();
		return countries.add(country);
		
		
	}
	
public boolean removeCountry(Country country) {
		
		if (countries==null)
			countries = new ArrayList<Country>();
		return countries.remove(country);
		
		
	}
	
	

}
