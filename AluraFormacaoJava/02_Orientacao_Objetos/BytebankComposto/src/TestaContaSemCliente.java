
public class TestaContaSemCliente
{
	public static void main(String[] args)
	{
		Conta contaBarbara = new Conta();
		System.out.println(contaBarbara.getSaldo());
		
		contaBarbara.titular = new Cliente();
		System.out.println(contaBarbara.titular);
		
		contaBarbara.titular.nome = "B�zinha";
		System.out.println(contaBarbara.titular.nome);
	}
}
