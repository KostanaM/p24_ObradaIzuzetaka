package vezba;

public class Izuzetak extends Throwable {
	
	private int g;

 Izuzetak(int g) {
		this.g = g;
	}


public String toString() {
	return "Izuzetak [g=" + g + "] nisu ispravno unete";
}
	
	 
	
	
	
	
}