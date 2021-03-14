
public class TesteTributaveis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ContaCorrente cc = new ContaCorrente(222, 709036);
		cc.deposita(100.0);
		
		SeguroDeVida seguro = new SeguroDeVida();

		CalculadorImposto calc = new CalculadorImposto();
		calc.registra(cc);
		calc.registra(seguro);
		
		System.out.println(calc.getTotalImposto());
	}

}
