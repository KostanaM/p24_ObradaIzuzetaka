package kostana.maksic;

public class Main {

	public static void main(String[] args) {
	
		finallyBlockWithException fbwe = new finallyBlockWithException();
		
		try {
			fbwe.proA();
		} catch (Exception e) {
			System.out.println("Exception caught");
		}
		fbwe.procB();
		fbwe.procC();

	}
}
