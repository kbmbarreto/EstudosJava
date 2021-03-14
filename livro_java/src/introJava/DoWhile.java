package introJava;

public class DoWhile {
	public static void main(String[] args) {
		
		int intContador;
		intContador = 1;
		
		do {
			System.out.println(intContador+" X 7 = "+(intContador++));
		} while (intContador <= 10);
	}
}
