package sintaxe_variaveis_fluxo;

public class TestaWhile {

	public static void main(String[] args) 
	{
		int contador = 0;
		
		while(contador <= 10)
		{
			System.out.println(contador);
			contador++;
		}
		System.out.println("O valor verificado ao final é "+contador+".");
	}

}
