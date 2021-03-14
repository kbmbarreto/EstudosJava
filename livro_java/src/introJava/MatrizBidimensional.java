package introJava;


/*Matriz bidimensional, com o tamanho de 5 x 5. Após o usuário entrar com os valores de seus elementos 
 * (vinte e cinco elementos), o código calcula a soma da diagonal principal e da diagonal secundária (fazendo um "X").
*/

public class MatrizBidimensional {

	public static void main(String[] args) {

		int intDiagonalPrincipal, intDiagonalSecundaria, intLinha, intColuna;
		int intMatrizNumeros[][] = new int[5][5];
		byte btValor[] = new byte[10];

		for (intLinha = 0; intLinha < 5; intLinha++) {
			for (intColuna = 0; intColuna < 5; intColuna++)
				intMatrizNumeros[intLinha][intColuna] = 0;
		}

		try {
			for (intLinha = 0; intLinha < 5; intLinha++) {
				for (intColuna = 0; intColuna < 5; intColuna++) {
					System.out.println("Digite o valor da posicao " + intLinha + "/" + intColuna + ": ");
					System.in.read(btValor);
					String strBuffer = new String(btValor);
					String strValor = new String(strBuffer.trim());

					intMatrizNumeros[intLinha][intColuna] = Integer.parseInt(strValor);
				}
			}

			intDiagonalPrincipal = 0;

			for (intLinha = 0; intLinha < 5; intLinha++)
				intDiagonalPrincipal += intMatrizNumeros[intLinha][intLinha];

			intDiagonalSecundaria = 0;
			intColuna = 0;

			for (intLinha = 4; intLinha >= 0; intLinha--) {
				intDiagonalSecundaria += intMatrizNumeros[intLinha][intColuna];
				intColuna++;
			}

			System.out.println("");
			System.out.println("Soma da diagonal principal = " + intDiagonalPrincipal);
			System.out.println("Soma da diagonal secundária = " + intDiagonalSecundaria);

		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
}
