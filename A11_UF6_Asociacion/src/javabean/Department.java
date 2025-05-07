package javabean;

import java.util.Objects;

public class Department {
	
	private int departamentId;
	private String departamentName;
	private Employee manager; //jefe
	private Location location;
	public Department(int departamentId, String departamentName, Employee manager, Location location) {
		super();
		this.departamentId = departamentId;
		this.departamentName = departamentName;
		this.manager = manager;
		this.location = location;
	}
	public Department() {
		super();
	}
	public int getDepartamentId() {
		return departamentId;
	}
	public void setDepartamentId(int departamentId) {
		this.departamentId = departamentId;
	}
	public String getDepartamentName() {
		return departamentName;
	}
	public void setDepartamentName(String departamentName) {
		this.departamentName = departamentName;
	}
	public Employee getManager() {
		return manager;
	}
	public void setManager(Employee manager) {
		this.manager = manager;
	}
	public Location getLocation() {
		return location;
	}
	public void setLocation(Location location) {
		this.location = location;
	}
	@Override
	public String toString() {
		return "Department [departamentId=" + departamentId + ", departamentName=" + departamentName + ", manager="
				+ manager + ", location=" + location + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(departamentId);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Department))
			return false;
		Department other = (Department) obj;
		return departamentId == other.departamentId;
	}
	
	

}
