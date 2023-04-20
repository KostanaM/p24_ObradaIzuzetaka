package vezba;

public class Provera {

	public static void Age(int g) throws Izuzetak{
		System.out.println( "Provera godina " + g);
		if(g<0||g>100)
			throw new Izuzetak(g);
				System.out.println( "Godine " + g + " su ispravne");
	}
	
	
	

}
