package sintaxe_variaveis_fluxo;

public class TestaConversao {

	public static void main(String[] args)
	{
		double salario = 1270.50;
		int valor = (int) salario;
		long numeroGrande = 987456321456L;
		short valorPequeno = 2131;
		byte b = 127;
		float pontoFlutuante = 3.14f;
		
		System.out.println("Valor double: "+salario);
		System.out.println("Valor int: "+valor);
		System.out.println("Valor long: "+numeroGrande);
		System.out.println("Valor short: "+valorPequeno);
		System.out.println("Valor byte: "+b);
		System.out.println("Valor float: "+pontoFlutuante);
	}

}
