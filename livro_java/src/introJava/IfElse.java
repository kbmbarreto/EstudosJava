package introJava;

import javax.swing.JOptionPane;

public class IfElse {
	public static void main(String[] args) {

		try {
		String strIdade;
		int intIdade;
		strIdade = JOptionPane.showInputDialog("Digite sua idade: ");
		intIdade = Integer.parseInt(strIdade);

			if(intIdade < 18)
				JOptionPane.showMessageDialog(null, "Menor de idade!", "Atenção", JOptionPane.INFORMATION_MESSAGE);
			else
				JOptionPane.showMessageDialog(null, "Maior de idade!", "Atenção", JOptionPane.INFORMATION_MESSAGE);
		} catch(Exception ex) {
			System.out.println("Erro de execução: " + ex);
		}
	}
}
