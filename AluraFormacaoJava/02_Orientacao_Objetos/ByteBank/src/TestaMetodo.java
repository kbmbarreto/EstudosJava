
public class TestaMetodo
{
	public static void main(String[] args)
	{
		Conta contaKleber = new Conta();
		contaKleber.saldo = 100;
		contaKleber.depositar(150);
		System.out.println(contaKleber.saldo);
		
		boolean saqueRealizado = contaKleber.sacar(50);
		System.out.println(contaKleber.saldo);
		System.out.println(saqueRealizado);
		
		Conta contaBarbara = new Conta();
		contaBarbara.depositar(1000);
		
		contaBarbara.transferir(500, contaKleber);
		System.out.println("Conta da Bárbara: "+contaBarbara.saldo+".");
		System.out.println("Conta do Kleber: "+contaKleber.saldo+".");
	}
}
