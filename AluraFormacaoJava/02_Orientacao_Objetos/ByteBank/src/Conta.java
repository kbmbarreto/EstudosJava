public class Conta 
{
	double saldo;
	int agencia;
	int numero;
	String titular;
	
	//M�todo depositar
	public void depositar(double valor)
	{
		this.saldo = this.saldo + valor;
	}
	
	//M�todo sacar
	public boolean sacar(double valor)
	{
		if (this.saldo >= valor)
		{
			this.saldo = saldo - valor;
		return true;
		}
		else
		{
			return false;
		}
	}
	
	//M�todo transferir
	public boolean transferir(double valor, Conta destino)
	{
		if(this.saldo >= valor)
		{
			this.saldo = saldo - valor;
			destino.depositar(valor);
			return true;
		}
		else
		{
			return  false;
		}
	}
}