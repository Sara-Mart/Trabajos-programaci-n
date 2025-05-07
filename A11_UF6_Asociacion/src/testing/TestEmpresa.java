package testing;

import java.time.LocalDate;

import javabean.Country;
import javabean.Region;
import javabean.Location;
import javabean.Job;
import javabean.Department;
import javabean.Employee;

public class TestEmpresa {

	public static void main(String[] args) {
	Region region1 = new Region (1,"Europa");
		
		Country esp= new Country("SP", "España", region1);

		
		Location loc1500 = new Location(1500,"Pez,3","1274","Madrid", "28",esp);
		
		Job job1 = new Job("IT_PRGO", "Analista programador", 19_000,35_000);
		
		Department dep30 = new Department(30,"Ventas",null,loc1500);
		
		Employee emp114 = new Employee(114, "Esteban", "Raphael", "est@fp.com","676564567", LocalDate.of(1996,7,7),job1, 35_000, 0.2,null, dep30);
		
		Employee emp115 = new Employee(115, "Anna", "Koo", "anna@fp.com","676564967", LocalDate.of(1998,7,7),job1, 25_000, 0.1,emp114, dep30);

		Employee emp116 = new Employee(116, "Eva", "Mart", "eva@fp.com","686564967", LocalDate.of(1995,7,7),job1, 20_000, 0.3,emp114, dep30);

		dep30.setManager(emp114);
		
		System.out.println("DESDE EM116: mi apellido, mi trabajo, mi departamento");
		System.out.println(emp116.getLastName());
		System.out.println(emp116.getJob().getJobTitle());
		System.out.println(emp116.getDepartment().getDepartamentName().toUpperCase());
		
		
		System.out.println("DESDE EM116: mi apellido, el apellido de mi Booss");
		System.out.println(emp116.getLastName());
		System.out.println(emp116.getMyBoss().getLastName());
		System.out.println(emp116.getDepartment().getManager().getLastName());
	
	
		System.out.println("DESDE EM116: mi nombre de region");
		System.out.println(emp116.getDepartment().getLocation().getCountry().getRegion().getRegionName());
		
	
		System.out.println("DESDE EM116: la region de my boss");
		System.out.println(emp116.getMyBoss().getDepartment().getLocation().getCountry().getRegion().getRegionName());
		
	
		System.out.println("a partir del empleado 114 sacar el apeliido del jefe, no se puede porque el 114 no tiene jefe, que hacemos?");
		
		if (emp114.getMyBoss() != null)
			
			System.out.println(emp114.getMyBoss().getLastName());
		else
			System.out.print("Este empleado no tiene jefe");
		
		
		
	}

}
