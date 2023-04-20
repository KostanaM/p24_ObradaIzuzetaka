package kostana.maksic;

public class finallyBlockWithException {
	//Trought an exception out of the method.
	static void proA() {
		try {
			System.out.println("procA");
		
			throw new RuntimeException("demo"); //"mi" bacamo izuzetak (throws je uzaglavlju metode)
			//throw koristi se za bacanje izuzetaka u telu metode
		}finally {//finally blok se izvrsava bez obzira da li je ili nije doslo do izuzetka
				System.out.println("proA finally");
			}
		}
	static void procB() {
		try {
			System.out.println("procB");
			return; // break, continue, System.exit(0)
		} finally {
			System.out.println("prosB's finally");
		}
	}
	//Execute a try block normally.
	static void procC() {
		try {
			System.out.println("proC");
		} finally {
				System.out.println("prosC's finally");
			}
		}
	}
	
	
