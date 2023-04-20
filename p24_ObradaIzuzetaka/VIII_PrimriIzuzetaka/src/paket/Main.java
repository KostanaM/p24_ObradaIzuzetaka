package paket;

public class Main {

	public static void main(String[] args) {

	try {
		int a = 0;
		int b = 10 / a;
	
	} catch(ArithmeticException e) {
			System.out.println("Izuzetak");

	}
	//catch(ArithmeticException e) {
	//System.out.printn("Izuzetak");
	//Ukoliko postoji vise catch blokova ciji tip parametara odgovara tipu
	//bacenog izuzetka, izvrsava se samo prvi takav catch blok
	//Greska je navesti sva catch bloka sa istim tipom parametara
	}
}