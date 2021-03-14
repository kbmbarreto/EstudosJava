
public class TestaBanco
{
	public static void main(String[] args)
	{
		Cliente kleber = new Cliente();
		kleber.nome = "Kleber Barreto";
		kleber.cpf = "222.222.222-2";
		kleber.profissao = "Engenheiro de Testes";
		
		Conta contaKleber = new Conta();
		
		contaKleber.depositar(50);
		
		//Associa o cliente Kleber à conta do Kleber (contaKleber)
		contaKleber.titular = kleber;
		System.out.println(contaKleber.titular.nome);
	}
}
