
public class Conta
{
	private double saldo;
	private int agencia;
	private int numero;
	private Cliente titular;
	private static int total;
	
	public Conta(int agencia, int numero)
	{
		Conta.total++;
		System.out.println("O total de contas abertas �: "+ Conta.total +".");
		this.agencia = agencia;
		this.numero = numero;
	}
	
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
	
	//M�todo saldo
	public double getSaldo()
	{
		return this.saldo;
	}
	
	public int getNumero()
	{
		return this.numero;
	}
	
	public void setNumero(int numero)
	{
		if (numero <= 0)
		{
			System.out.println("Entrada inv�lida! N�o existe conta com n�mero negativo.");
			return;
		}
		this.numero = numero;
	}
	
	public int getAgencia() 
	{
		return this.agencia;
	}
	
	public void setAgencia(int agencia)
	{
		if (agencia <= 0)
		{
			System.out.println("Entrada inv�lida! N�o existe conta com n�mero de ag�ncia"
					+ " negativo.");
			return;
		}
		this.agencia = agencia;
	}
	
	public void setTitular(Cliente string)
	{
		this.titular = string;
	}
	
	public Cliente getTitular()
	{
		return titular;
	}
	
	public static int getTotal()
	{
		return Conta.total;
	}
}
