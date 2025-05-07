package javabean;

import java.util.Objects;

public class Location {
	
	private int locationId;
	private String streetAddres;
	private String postalCode;
	private String city;
	private String stateProvince;
	private Country country;
	
	
	public Location(int locationId, String streetAddres, String postalCode, String city, String stateProvince,
			Country country) {
		super();
		this.locationId = locationId;
		this.streetAddres = streetAddres;
		this.postalCode = postalCode;
		this.city = city;
		this.stateProvince = stateProvince;
		this.country = country;
	}
	public Location() {
		super();
	}
	public int getLocationId() {
		return locationId;
	}
	public void setLocationId(int locationId) {
		this.locationId = locationId;
	}
	public String getStreetAddres() {
		return streetAddres;
	}
	public void setStreetAddres(String streetAddres) {
		this.streetAddres = streetAddres;
	}
	public String getPostalCode() {
		return postalCode;
	}
	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getStateProvince() {
		return stateProvince;
	}
	public void setStateProvince(String stateProvince) {
		this.stateProvince = stateProvince;
	}
	public Country getCountry() {
		return country;
	}
	public void setCountry(Country country) {
		this.country = country;
	}
	@Override
	public String toString() {
		return "Location [locationId=" + locationId + ", streetAddres=" + streetAddres + ", postalCode=" + postalCode
				+ ", city=" + city + ", stateProvince=" + stateProvince + ", country=" + country + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(locationId);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Location))
			return false;
		Location other = (Location) obj;
		return locationId == other.locationId;
	}
	
	
	
	

}
