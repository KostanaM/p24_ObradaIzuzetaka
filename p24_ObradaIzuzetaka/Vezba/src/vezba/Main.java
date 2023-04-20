package vezba;

public class Main {
	public static void Age(int g) throws Izuzetak{
		System.out.println( "Provera godina " + g);
		if(g<0||g>100)
			throw new Izuzetak(g);
				System.out.println( "Godine " + g + " su ispravne");
	}
				
public static void main(String[] args)  {
	
	
	try {
		Age(25);
		Age(-5);
		
	} catch (Izuzetak e) {
		System.out.println("Caught: " +e);
	
	}
	finally {
		System.out.println("Finally block");
	}
}	
}	


