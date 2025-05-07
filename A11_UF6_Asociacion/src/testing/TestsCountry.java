package testing;
import javabean.Region;
import javabean.Country;
public class TestsCountry {

	public static void main(String[] args) {
		Region region1 = new Region (1,"Europa");
		
		Country esp= new Country("SP", "España", region1);
		
		Country arg= new Country ("AR", "Argentina", new Region(2,"Sur America"));

		Region region2 = arg.getRegion();
		
		System.out.println(region1);
		System.out.println(esp);
		System.out.println(arg);
		System.out.println(region2);
		
		Country colombia = new Country ("CO", "Colombia", arg.getRegion());
	
		System.out.println("Nombre de la region del pais arg: " + arg.getRegion().getRegionName());
		System.out.println("Nombre de la region del pais esp: " + esp.getRegion().getRegionName().substring(0,3));
		
		
		
	
	}

}
