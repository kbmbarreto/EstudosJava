package sintaxe_variaveis_fluxo;

public class TestaBooleanoCondicionais 
{
	public static void main(String[] args) 
	{
		int idade = 17;
		int qtdePessoas = 3;
		boolean acompanhado = true;
		
		if(idade >= 18 || qtdePessoas == 3 && acompanhado)
		{
			System.out.println("Sejam bem vindos � festa do ano!!!");
		}
		else
		{
			System.out.println("V� para casa tomar leite, crian�a �� ");
		}
	}
}
