
public class TestaValores
{
	public static void main(String[] args)
	{
		Conta conta = new Conta(750, 001);
		Conta conta2 = new Conta(750, 002);
		Conta conta3 = new Conta(750, 003);
		
		System.out.println(Conta.getTotal());
	}
}
