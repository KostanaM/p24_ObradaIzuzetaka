package paket;

public class Main {

	public static void main(String[] args) {

		int d, a;
		try { // U try bloku se stavljaju naredbe koje mogu baciti izuzetak,
			//kao i one naredbe koje se nece izvršiti ako dodje do izuzetka.
			d = 0;
			a = 10 / d;
			
			
			System.out.println("Ova poruka nece biti odstampana! ");
	} catch(Exception e) {
		
		System.out.println("Deljenje nulom. ");
	}
		System.out.println("Program nastavlja sa izvrsenjem! ");
	}	
}	
/* Hijerarhija izuzetka:
 * 
 * Svi izuzeci izvedeni su iz klase Throwable
 * Klasa Throwable ima dva direktna naslednika(potomka): Error i Exception.
 * 
 * Klasa Error opisuje fatalne greske (greske na koje ne mozemo uticati).
 * Za greske tog tipa nije potrebno navoditi try/catch blokove
 * 
 * Klasa Exception jeste klasa iz koje se izvode klase koje pripadaju 
 * neproverenim tipovima izuzetaka.
 * 
 * Exception {RuntimeException, IOException}
 * 
 * RuntimeException {IndexOutOfBoundsException, ArithmeticException}
 * 
 * 
 */






