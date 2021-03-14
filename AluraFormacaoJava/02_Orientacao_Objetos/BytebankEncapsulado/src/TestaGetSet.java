
public class TestaGetSet
{
	public static void main(String[] args)
	{
		Conta conta = new Conta(1337, 256);
		
		conta.setNumero(1228);
		System.out.println(conta.getNumero());
		
		Cliente kleber = new Cliente();
		conta.setTitular(kleber);
		kleber.setNome("Kleber Barreto");
		kleber.setCpf("444.444.444-44");
		kleber.setProfissao("Engenheiro de Testes Júnior");
		
		System.out.println(conta.getTitular().getCpf());
		System.out.println(kleber.getProfissao());
	}
}
