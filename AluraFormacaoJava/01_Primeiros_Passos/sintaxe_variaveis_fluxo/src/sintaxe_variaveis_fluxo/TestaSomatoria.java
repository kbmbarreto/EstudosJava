package sintaxe_variaveis_fluxo;

public class TestaSomatoria
{
	public static void main(String[] args)
	{
		int contador = 0;
		int total = 0;
		
		while (contador <= 10)
		{
			total = total + contador; // Também pode ser "total += contador" 
			System.out.println(total);
			contador++;
		}
	}
}
